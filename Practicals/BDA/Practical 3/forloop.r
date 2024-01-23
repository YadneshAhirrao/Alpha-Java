# Set the number of rows for the pattern
num_rows <- as.integer(readline("Enter the Number of Rows: "))

# Nested loops to print the star pattern
for (i in 1:num_rows) {
  for (j in 1:i) {
    cat("* ")
  }
  cat("\n")
}

for (i in num_rows:1) {
  for (j in 1:i) {
    cat("* ")
  }
  cat("\n")
}
