# Sample numeric score
score <- as.integer(readline("Enter the Score: "))

# Determine grade using if-else
if (score >= 90) {
  grade <- "A"
} else if (score >= 80) {
  grade <- "B"
} else if (score >= 70) {
  grade <- "C"
} else if (score >= 60) {
  grade <- "D"
} else {
  grade <- "F"
}

# Print the result
cat("Your Final Score is :", score, "\n")
cat("Your Overall Grade is :", grade, "\n")
