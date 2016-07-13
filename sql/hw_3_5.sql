SELECT * 
FROM contr c 
WHERE pers_id IN (SELECT pers_id 
                  FROM pers 
                  WHERE salary < 1000) 
              AND EXISTS
                  (SELECT pers_id 
                  FROM (SELECT * 
                        FROM pers 
                        WHERE depart_id IN (SELECT depart_id 
                                            FROM depart 
                                            WHERE parent_id = (SELECT depart_id 
                                                               FROM depart 
                                                               WHERE name LIKE 'Отдел логистики'))) a 
                  WHERE a.pers_id=c.pers_id) ;