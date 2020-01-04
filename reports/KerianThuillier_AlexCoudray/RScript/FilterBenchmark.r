# Need to be set in correct working directory
setwd("~/Documents/M1-SIF/R")

######## META PARAMETERS #########
nb_clauses_threshold <- 250000
nb_variables_threshold <- 100000
simple_clauses_rate_threshold <- 20
#
sample_rate <- 4
##################################


benchmark_file <- "benchmark_data.csv"
benchmarks <- read.table(benchmark_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")
results_file <- "benchmark-10x.csv"
results <- read.table(results_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")

library(dplyr)

##########################
### BENCHMARK REDUCTION
##########################

###
# BENCHMARK FILTERING

filter_benchmark <- benchmarks[benchmarks$Percentage.of.simple.clause <= simple_clauses_rate_threshold,]
filter_1 <- filter_benchmark[filter_benchmark$Number.of.clauses < nb_clauses_threshold,][filter_benchmark$Number.of.variables < nb_variables_threshold,]
filter_1 <- filter_1[sample(nrow(filter_1), nrow(filter_1)/sample_rate),]
filter_2 <- filter_benchmark[filter_benchmark$Number.of.clauses >= nb_clauses_threshold,][filter_benchmark$Number.of.variables >= nb_variables_threshold,]
filter_benchmark <- rbind(filter_1, filter_2) %>% distinct()

###
# VERIFICATION

# Data preparation
benchmark_time <- results %>%
  group_by(Benchmark) %>%
  mutate(Min.Time = min(Mean.Time)) %>%
  mutate(Max.Time = max(Mean.Time)) %>%
  mutate(Mean.Time = mean(Mean.Time))
benchmark_time$Standard.Deviation.Time <- NULL
benchmark_time$Low.Confident.Interval <- NULL
benchmark_time$Upper.Confident.Interval <- NULL
benchmark_time$Time.Diff <- NULL
benchmark_time$Sat. <- NULL
benchmark_time$Solver <- NULL
benchmark_time$Version <- NULL
benchmark_time <- benchmark_time %>% distinct()
benchmark_time[benchmark_time$Min.Time == -1,]$Min.Time <- 0

# Graphical repartition
filtered_benchmark_time <- merge(filter_benchmark, benchmark_time)

filtered_benchmark_time <- filtered_benchmark_time[order(filtered_benchmark_time$Percentage.of.simple.clause),]
plot.new()
plot(filtered_benchmark_time$Percentage.of.simple.clause, filtered_benchmark_time$Min.Time, type="o", col="blue", xlab="One literal clause rate", ylab="Computation time (ms)", xlim=c(0,max(filtered_benchmark_time$Percentage.of.simple.clause)), ylim=c(0, max(filtered_benchmark_time$Min.Time)))
# Legend
legend(x="topright",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))

filtered_benchmark_time <- filtered_benchmark_time[order(filtered_benchmark_time$Number.of.variables),]
plot.new()
plot(filtered_benchmark_time$Number.of.variables, filtered_benchmark_time$Min.Time, type="o", col="blue", xlab="Number of variables in formula", ylab="Computation time (ms)", xlim=c(0,max(filtered_benchmark_time$Number.of.variables)), ylim=c(0, max(filtered_benchmark_time$Min.Time)))
# Legend
legend(x="topright",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))

filtered_benchmark_time <- filtered_benchmark_time[order(filtered_benchmark_time$Number.of.clauses),]
plot.new()
plot(filtered_benchmark_time$Number.of.clauses, filtered_benchmark_time$Min.Time, type="o", col="blue", xlab="Number of clauses in formula", ylab="Computation time (ms)", xlim=c(0,max(filtered_benchmark_time$Number.of.clauses)), ylim=c(0, max(filtered_benchmark_time$Min.Time)))
# Legend
legend(x="topright",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))

# Best solver
results$Low.Confident.Interval <- results$Mean.Time - 1.95 * results$Standard.Deviation.Time / sqrt(10)
results[results$Mean.Time == -1,]$Low.Confident.Interval <- -1
results$Upper.Confident.Interval <- results$Mean.Time + 1.95 * results$Standard.Deviation.Time / sqrt(10)
results[results$Mean.Time == -1,]$Upper.Confident.Interval <- -1


results <- results %>% filter(Benchmark %in% filter_benchmark$Benchmark) 
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
  mutate(rank = row_number(Mean.Rank))

