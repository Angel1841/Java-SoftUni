-- 2 INSERT

INSERT INTO `actors`(`first_name`, `last_name`, `birthdate`, `height`, `awards`, `country_id`)

SELECT REVERSE(`first_name`),
		REVERSE(`last_name`),
        date_sub(birthdate, INTERVAL 2 DAY),
        `height` + 10,
        `country_id`,
        (SELECT id FROM `countries` WHERE `name` LIKE 'ARMENIA')
        
        FROM `actors`
        WHERE `id` <= 10;
        
-- 3 UPDATE

UPDATE `movies_additional_info`
SET `runtime` =
	CASE
		WHEN `runtime` - 10 < 0
        THEN 0
        ELSE 
        `runtime` - 10
        END
	WHERE `id` BETWEEN 15 AND 25;
    
-- 4 DELETE
    SET SQL_SAFE_UPDATES = 0;
    DELETE c
    FROM countries AS c
    LEFT JOIN movies AS m
    ON c.`id` = m.`country_id`
    WHERE m.`country_id` IS NULL;
    