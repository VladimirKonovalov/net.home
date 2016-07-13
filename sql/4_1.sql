SELECT * FROM depart
WHERE( depart_id IN (4,5,6)
AND min_salary<800)
OR (depart_id IN (1,2,4,5,6,7)
AND max_salary<=1000)
OR (depart_id=1
AND min_salary<=600);