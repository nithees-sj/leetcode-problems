# Write your MySQL query statement below
Select email
from Person
GROUP BY email
having count(*)>1; 