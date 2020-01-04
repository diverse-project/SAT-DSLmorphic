# Need to be set in correct working directory
setwd("~/Documents/M1-SIF/R")

results_file <- "benchmark-10x.csv"
results <- read.table(results_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")
benchmark_file <- "benchmark_data.csv"
benchmarks <- read.table(benchmark_file, header = TRUE, sep = "\t", quote = "\"", dec = ".", fill = TRUE, comment.char = "")

library(dplyr)

#####################
### Harder Formula
#####################

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

benchmark_time <- merge(benchmark_time, benchmarks)

# Variables
png("full_variables.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Number.of.variables),]
plot.new()
plot(benchmark_time$Number.of.variables, benchmark_time$Min.Time, type="o", col="blue", xlab="", ylab="", xlim=c(0,max(benchmark_time$Number.of.variables)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)  
plot(benchmark_time$Number.of.variables, benchmark_time$Max.Time, type="o", col="red", xlab="", ylab="", xlim=c(0,max(benchmark_time$Number.of.variables)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)
plot(benchmark_time$Number.of.variables, benchmark_time$Mean.Time, type="o", col="green", xlab="Number of variables in formula", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Number.of.variables)), ylim=c(0, max(benchmark_time$Max.Time)))
# Legend
legend(x="topright",legend=c("Maximal computation time","Minimal computation time", "Average computation time"), text.col=c("red","blue","green"),col=c("red","blue","green"))
dev.off()

png("min_variables.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Number.of.variables),]
plot.new()
plot(benchmark_time$Number.of.variables, benchmark_time$Min.Time, type="o", col="blue", xlab="Number of variables in formula", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Number.of.variables)), ylim=c(0, max(benchmark_time$Min.Time)))
# Legend
legend(x="topleft",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))
dev.off()

# Clauses
png("full_clauses.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Number.of.clauses),]
plot.new()
plot(benchmark_time$Number.of.clauses, benchmark_time$Min.Time, type="o", col="blue", xlab="", ylab="", xlim=c(0,max(benchmark_time$Number.of.clauses)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)  
plot(benchmark_time$Number.of.clauses, benchmark_time$Max.Time, type="o", col="red", xlab="", ylab="", xlim=c(0,max(benchmark_time$Number.of.clauses)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)
plot(benchmark_time$Number.of.clauses, benchmark_time$Mean.Time, type="o", col="green", xlab="Number of clauses in formula", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Number.of.clauses)), ylim=c(0, max(benchmark_time$Max.Time)))
# Legend
legend(x="topright",legend=c("Maximal computation time","Minimal computation time", "Average computation time"), text.col=c("red","blue","green"),col=c("red","blue","green"))
dev.off()

png("min_clauses.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Number.of.clauses),]
plot.new()
plot(benchmark_time$Number.of.clauses, benchmark_time$Min.Time, type="o", col="blue", xlab="Number of clauses in formula", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Number.of.clauses)), ylim=c(0, max(benchmark_time$Min.Time)))
# Legend
legend(x="topleft",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))
dev.off()

# Simple Clauses
png("full_simple_clauses.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Percentage.of.simple.clause),]
plot.new()
plot(benchmark_time$Percentage.of.simple.clause, benchmark_time$Min.Time, type="o", col="blue", xlab="", ylab="", xlim=c(0,max(benchmark_time$Percentage.of.simple.clause)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)  
plot(benchmark_time$Percentage.of.simple.clause, benchmark_time$Max.Time, type="o", col="red", xlab="", ylab="", xlim=c(0,max(benchmark_time$Percentage.of.simple.clause)), ylim=c(0, max(benchmark_time$Max.Time)))
par(new = TRUE)
plot(benchmark_time$Percentage.of.simple.clause, benchmark_time$Mean.Time, type="o", col="green", xlab="One literal clause rate", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Percentage.of.simple.clause)), ylim=c(0, max(benchmark_time$Max.Time)))
# Legend
legend(x="topright",legend=c("Maximal computation time","Minimal computation time", "Average computation time"), text.col=c("red","blue","green"),col=c("red","blue","green"))
dev.off()

png("min_simple_clauses.png", width = 500, height = 500)
benchmark_time <- benchmark_time[order(benchmark_time$Percentage.of.simple.clause),]
plot.new()
plot(benchmark_time$Percentage.of.simple.clause, benchmark_time$Min.Time, type="o", col="blue", xlab="One literal clause rate", ylab="Computation time (ms)", xlim=c(0,max(benchmark_time$Percentage.of.simple.clause)), ylim=c(0, max(benchmark_time$Min.Time)))
# Legend
legend(x="topright",legend=c("Minimal computation time"), text.col=c("blue"),col=c("blue"))
dev.off()

