SELECT * 
FROM contr c, pers p
WHERE p.pers_id = c.pers_id AND 1 IN (p.depart_id);