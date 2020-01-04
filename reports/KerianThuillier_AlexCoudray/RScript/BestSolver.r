# Need to be set in correct working directory
setwd("~/Documents/M1-SIF/R")

results_file <- "benchmark-10x.csv"
results <- read.table(results_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")

#head(results)
#head(benchmarks)

################
# Best Solver
################
#install.packages("dplyr")
library(dplyr)

# Is result produced by solvers for an instance different ?
diff_results <- results %>%
  group_by(Benchmark) %>%
  mutate(diff = if (all(Sat. == "SAT") || all(Sat. == "UNSAT")) {FALSE} else {TRUE})
diff_results <- diff_results[diff_results$diff == TRUE,]

if (nrow(diff_results) == 0) {
  print("All solvers returned the same result for each instance.")
} else {
  print(paste(c("At least one solver did not agree with the others for", nrow(diff_results), "instance(s)."), collapse = " "))
  print("Those instances are :")
  print(diff_results$Benchmark)
}

# Rank results
results$Low.Confident.Interval <- results$Mean.Time - 1.95 * results$Standard.Deviation.Time / sqrt(10)
results[results$Mean.Time == -1,]$Low.Confident.Interval <- -1
results$Upper.Confident.Interval <- results$Mean.Time + 1.95 * results$Standard.Deviation.Time / sqrt(10)
results[results$Mean.Time == -1,]$Upper.Confident.Interval <- -1

ranking_function <- function (t) {
  t1 <- t[order(t$Upper.Confident.Interval),]
  t1 <- t1[order(t1$Benchmark),]
  benchmark <- ""
  for (row in 1:nrow(t1)) {
    if (benchmark != t1$Benchmark[row]) {
      benchmark <- t1$Benchmark[row]
      init_rank <- row
      rank_1 <- 0
      old_1 <- -2
    }
    if (t1$Upper.Confident.Interval[row] != old_1) {
      rank_1 <- row - init_rank + 1
      t1$rank[row] <- rank_1
      old_1 <- t1$Upper.Confident.Interval[row]
    } else {
      t1$rank[row] <-rank_1
    }
  }
  
  t2 <- t1[order(t1$Low.Confident.Interval),]
  t2 <- t2[order(t2$Benchmark),]
  benchmark <- ""
  for (row in 1:nrow(t2)) {
    if (benchmark != t2$Benchmark[row]) {
      benchmark <- t2$Benchmark[row]
      init_rank <- row
      rank_1 <- 0
      old_1 <- -2
    }
    if (t2$Low.Confident.Interval[row] != old_1) {
      rank_1 <- row - init_rank + 1
      t2$rank[row] <- (rank_1 + t2$rank[row]) / 2
      old_1 <- t2$Low.Confident.Interval[row]
    } else {
      t2$rank[row] <-(rank_1 + t2$rank[row]) / 2
    }
  }
  return(t2)
}
ranked_results <- ranking_function(results)

ranked_solver <- aggregate(ranked_results$rank, list(ranked_results$Solver, ranked_results$Version), mean)
ranked_solver <- ranked_solver %>% 
  rename(
    Solver = Group.1,
    Version = Group.2,
    Mean.Rank = x
  )
ranked_solver <- ranked_solver %>%
  group_by() %>%
  mutate(rank = row_number(x))