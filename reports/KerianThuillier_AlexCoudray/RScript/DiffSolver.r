# Need to be set in correct working directory
setwd("~/Documents/M1-SIF/R")

results_file <- "benchmark-10x.csv"
results <- read.table(results_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")

#head(results)
#head(benchmarks)

######################
# Solver Difference
######################

clear_columns <- function (t) {
  t$Benchmark <- NULL
  t$Mean.Time <- NULL
  t$Standard.Deviation.Time <- NULL
  t$Low.Confident.Interval <- NULL
  t$Upper.Confident.Interval <- NULL
  t$Time.Diff <- NULL
  t$Sat. <- NULL
  t <- t %>%
    distinct()
  return(t)
}

# Global
diff_function <- function (t, contains, excepts) {
t1 <- t[order(t$Mean.Time),]
t1 <- t1[order(t1$Benchmark),]
benchmark <- ""
for (row in 1:nrow(t1)) {
  if (t1$Solver[row] != excepts && grepl(contains, t1$Solver[row], fixed=TRUE)) {
    if (benchmark != t1$Benchmark[row]) {
      benchmark <- t1$Benchmark[row]
      ref <- t1$Mean.Time[row]
    }
    if (ref != 0)
      t1$Time.Diff[row] <-(t1$Mean.Time[row] - ref) / ref * 100
    else
      t1$Time.Diff[row] <-t1$Mean.Time[row] * 100
  } else {
    t1$Time.Diff[row] <- NA
  }
}
return(t1)
}

stat_function <- function (t) {
  t <- t %>%
    group_by(Solver, Version) %>%
    mutate(Med.Diff = median(Time.Diff)) %>%
    mutate(Mean.Diff = mean(Time.Diff))
  return(t)
}

diff_results_global <- diff_function(results, "", "")

diff_solver_global <- stat_function(diff_results_global)
diff_solver_global <- clear_columns(diff_solver_global)

# Without SAT4J_JAVA
diff_results_wihtout_java <- diff_function(results, "", "SAT4J_JAVA")

diff_solver_wihtout_java <- stat_function(diff_results_wihtout_java)
diff_solver_wihtout_java <- clear_columns(diff_solver_wihtout_java)

# Only Sat4J JAR
diff_results_sat4j_jar <- diff_function(results, "SAT4J_JAR", "SAT4J_JAVA")

diff_solver_sat4j_jar <- stat_function(diff_results_sat4j_jar)
diff_solver_sat4j_jar <- clear_columns(diff_solver_sat4j_jar)

# Only Sat4J MVN
diff_results_sat4j_mvn <- diff_function(results, "SAT4J_COMP", "SAT4J_JAVA")

diff_solver_sat4j_mvn <- stat_function(diff_results_sat4j_mvn)
diff_solver_sat4j_mvn <- clear_columns(diff_solver_sat4j_mvn)

# Only Minisat
diff_results_minisat <- diff_function(results, "minisat", "cryptominisat")

diff_solver_minisat <- stat_function(diff_results_minisat)
diff_solver_minisat <- clear_columns(diff_solver_minisat)
