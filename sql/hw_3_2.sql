SELECT * FROM contr 
LEFT OUTER JOIN pers ON (pers.pers_id = contr.pers_id) 
  JOIN (
    SELECT * FROM depart WHERE min_salary >= 1500 OR max_salary <= 1500)
  ON (pers.depart_id = depart.depart_id)
  );