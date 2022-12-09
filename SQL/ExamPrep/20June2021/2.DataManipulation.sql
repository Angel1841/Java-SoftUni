-- 2

INSERT INTO `clients`(`full_name`, `phone_number`)
SELECT CONCAT_WS(' ', `first_name`, `last_name`),
		CONCAT('(088) 9999', `id` * 2)
        FROM `drivers`
        WHERE `id` BETWEEN 10 AND 20;
        
-- 3

SET SQL_SAFE_UPDATES = 0;

UPDATE `cars`
SET `condition` = 'C'
WHERE `mileage` >= 800000 OR `mileage` IS NULL
AND `year` <= 2010
AND make NOT LIKE 'Mercedes-Benz';

-- 4

DELETE c
FROM `clients` AS c
LEFT JOIN `courses` AS co
ON c.`id` = co.`client_id`
WHERE co.`client_id` IS NULL AND CHAR_LENGTH(c.`full_name`) > 3;
