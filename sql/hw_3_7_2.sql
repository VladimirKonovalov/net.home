SELECT * 
FROM depart d, (SELECT p.depart_id AS depart_id, SUM(p.salary), TRUNC(AVG(p.salary),2) AS avg_salary, MIN(p.salary) AS minim, MAX(p.salary), COUNT(p.pers_id) AS countt
                FROM pers p
                GROUP BY p.depart_id HAVING COUNT(p.pers_id) > 10
                ORDER BY p.depart_id) p
WHERE d.depart_id = p.depart_id AND NOT p.avg_salary > d.max_salary;              