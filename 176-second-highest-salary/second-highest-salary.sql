# Write your MySQL query statement below
SELECT MAX(salary) As SecondHighestSalary FROM Employee where salary<(SELECT MAX(salary) from Employee);