-- Last updated: 8/11/2026, 4:07:48 PM
SELECT name
FROM Employee
WHERE id IN(
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
)
