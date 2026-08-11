-- Last updated: 8/11/2026, 4:10:36 PM
SELECT(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
)AS SecondHighestSalary;
