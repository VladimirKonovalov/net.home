SELECT  
	UPPER(firstname) AS "FIRSTNAME ", 
	INITCAP(SUBSTR(lastname,1,LENGTH(lastname)-1))||' '||SUBSTR(firstname,1,1)||'.'||SUBSTR(middlename,1,1)||'.' AS "FIO"
FROM  
	pers
WHERE 
	lastname LIKE '%ì%' AND LENGTH(SUBSTR(lastname,1,LENGTH(lastname)-1)) < 7;