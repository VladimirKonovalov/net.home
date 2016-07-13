SELECT director_id, 
       (SELECT INITCAP(SUBSTR(lastname,1,LENGTH(lastname)-1))||' '||SUBSTR(firstname,1,1)||'.'||SUBSTR(middlename,1,1)||'.'
          FROM pers p
          WHERE d.director_id = p.pers_id) AS director_fio
  FROM depart d;
  