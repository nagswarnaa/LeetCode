# Write your MySQL query statement below
SELECT A.NAME,B.BONUS
FROM EMPLOYEE AS A 
LEFT JOIN BONUS AS B 
ON A.empId=B.empId
WHERE B.BONUS <1000 OR B.BONUS IS NULL
