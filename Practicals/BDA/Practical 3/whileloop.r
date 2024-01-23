# Function to check if a number is prime
is_prime <- function(num) {
  if (num <= 1) {
    return(FALSE)
  }
  
  for (i in 2:sqrt(num)) {
    if (num %% i == 0) {
      return(FALSE)
    }
  }
  
  return(TRUE)
}

# Find and print prime numbers between 1 and 100 using while loop
number <- 1
while (number <= 100) {
  if (is_prime(number)) {
    cat(number, " ")
  }
  number <- number + 1
}
