import pandas as pd
import matplotlib.pyplot as plt

# Read data from the CSV file
data = pd.read_csv('employee_data.csv')

# Extract columns
ages = data['Age']
salaries = data['Salary']
departments = data['Department']
experience = data['Experience']

# 1. Histogram of Ages
plt.subplot(231)
plt.hist(ages, bins=10, color='skyblue', edgecolor='black')
plt.title('Histogram of Ages')
plt.xlabel('Age')
plt.ylabel('Frequency')

# 2. Bar Chart of Department vs. Salary
department_salary = data.groupby('Department')['Salary'].mean()
plt.subplot(232)
department_salary.plot(kind='bar', color='lightgreen')
plt.title('Average Salary by Department')
plt.xlabel('Department')
plt.ylabel('Average Salary')

# 3. Scatter Plot of Experience vs. Salary
plt.subplot(233)
plt.scatter(experience, salaries, color='orange')
plt.title('Scatter Plot of Experience vs. Salary')
plt.xlabel('Years of Experience')
plt.ylabel('Salary')

# 4. Pie Chart of Department Distribution
department_counts = data['Department'].value_counts()
plt.subplot(234)
plt.pie(department_counts, labels=department_counts.index, autopct='%1.1f%%', startangle=90)
plt.title('Department Distribution')

# 5. Box Plot of Salary by Department
plt.subplot(235)
data.boxplot(column='Salary', by='Department', vert=False)
plt.title('Box Plot of Salary by Department')
plt.xlabel('Salary')

plt.tight_layout()
plt.show()