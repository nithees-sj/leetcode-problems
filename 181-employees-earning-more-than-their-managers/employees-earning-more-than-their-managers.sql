# Write your MySQL query statement below
Select e.name AS Employee from Employee e
Join Employee m
on e.managerId=m.id
Where e.salary>m.salary;