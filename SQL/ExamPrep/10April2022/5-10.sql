-- 5. Countries

SELECT *
FROM `countries`
ORDER BY `currency` DESC, `id`; 

-- 6. Old movies

SELECT m.`id`, m.`title`, a.`runtime`, a.`budget`, a.`release_date`
FROM `movies_additional_info` AS a
JOIN `movies` AS m USING (`id`)
WHERE YEAR(`release_date`) BETWEEN 1996 AND 1999
ORDER BY `runtime` ASC, `id`
LIMIT 20;

-- 7. Movie casting

SELECT CONCAT_WS(' ', `first_name`, `last_name`) AS 'full_name',
		CONCAT(REVERSE(`last_name`), char_length(`last_name`), '@cast.com') AS 'email',
        2022 - year(`birthdate`) AS 'age',
        `height`
        
FROM `actors`
LEFT JOIN `movies_actors` AS m
ON `actors`.id = m.`actor_id`
WHERE `actor_id` IS NULL
ORDER BY `height` ASC;
        