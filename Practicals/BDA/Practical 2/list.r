# Creating a list
my_list <- list(
  Name = "Yadnesh",
  Age = 19,
  Scores = c(85, 90, 78),
  Contacts = c("admin@xyz.com", "9999999999")
)

# Accessing elements
name <- my_list$Name
age <- my_list$Age
scores <- my_list$Scores

# Printing the list and elements
print(my_list)
print(name)
print(age)
print(scores)

# Adding elements
my_list$Location <- "Nanded"
print(my_list)
