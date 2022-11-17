-- 5

SELECT `first_name` ,`last_name`, `age`, `salary`, `happiness_level`
FROM `employees`
ORDER BY `salary`, `id`;

-- 6

SELECT t.`name`, a.`name`, CHAR_LENGTH(a.`name`)
FROM `teams` AS t
JOIN `offices` AS o
ON t.`office_id` = o.`id`
JOIN `addresses` AS a
ON a.`id` = o.`address_id`
WHERE o.`website` IS NOT NULL
ORDER BY t.`name`, a.`name`;

-- 7 

SELECT c.`name`,
	COUNT(gc.`game_id`) AS 'games_count',
    ROUND(AVG(g.`budget`), 2) AS 'avg_budget',
    MAX(g.`rating`) AS 'max_rating'
    FROM categories AS c
    JOIN games_categories AS gc 
    ON c.`id` = gc.`category_id`
    JOIN games AS g
    ON g.`id` = gc.`game_id`
    GROUP BY c.`name`
    HAVING `max_rating` >= 9.5
    ORDER BY `games_count` DESC, c.`name`;
    
-- 8

SELECT g.`name`,
		g.`release_date`,
        concat(LEFT(g.`description`, 10), '...') AS 'summary',
        CASE
			WHEN month(g.`release_date`) BETWEEN 1 AND 3 THEN 'Q1'
            WHEN month(g.`release_date`) BETWEEN 4 AND 6 THEN 'Q2'
			WHEN month(g.`release_date`) BETWEEN 7 AND 9 THEN 'Q3'
        	ELSE 'Q4'
            END AS 'quarter',
        t.`name`
        
        FROM games AS g
        JOIN teams AS t
        ON g.`team_id` = t.`id`
        
	WHERE right(g.`name`, 1) = '2'
	AND year(g.`release_date`) = 2022
    	AND month(g.release_date) % 2 = 0
ORDER BY `quarter`;
            
    