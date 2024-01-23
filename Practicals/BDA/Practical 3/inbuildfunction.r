# Create a matrix
matrix_data <- matrix(1:12, nrow = 3)

# Apply sum function to each column
column_sums <- apply(matrix_data, 2, sum)
print(column_sums)

# Create a list of vectors
list_data <- list(a = c(1, 2, 3), b = c(4, 5, 6))

# Apply sum function to each vector and return a vector
sums <- sapply(list_data, sum)
print(sums)

# Create a data frame
data <- data.frame(category = rep(c("A", "B"), each = 5), value = 1:10)

# Apply mean function to 'value' based on 'category'
means <- tapply(data$value, data$category, mean)
print(means)
