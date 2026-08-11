-- Last updated: 8/11/2026, 4:10:31 PM
SELECT DISTINCT Num AS ConsecutiveNums
FROM Logs
WHERE(Id + 1,Num) IN (SELECT Id,Num FROM Logs)
AND(Id + 2,Num)In (SELECT Id,Num FROM Logs);