# Creating a DataFrame
data <- data.frame(
  Name = c("Alice", "Bob", "Charlie"),
  Age = c(25, 30, 28),
  Score = c(90, 85, 92)
)

# Accessing columns
ages <- data$Age

# Printing the DataFrame and result
print(data)
print(ages)

# Filtering rows
young_people <- data[data$Age < 30, ]
print(young_people)
