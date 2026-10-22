# Write your MySQL query statement below
WITH ranked AS (
    SELECT d.name AS Department, e.name AS Employee, salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY Salary DESC) AS `rank` 
    FROM Employee e LEFT JOIN Department d ON e.departmentId = d.id 
)
SELECT Department, Employee, Salary 
FROM ranked 
WHERE `rank` < 2;