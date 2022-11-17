-- 2

INSERT INTO `games`(`name`, `rating`, `budget`, `team_id`)

SELECT 
	LOWER(REVERSE(SUBSTR(`name`, 2))),
    `id`,
    `leader_id` * 1000,
    `id`
    FROM `teams`
    WHERE `id` BETWEEN 1 AND 9;
    
-- 3

UPDATE `employees` AS e
LEFT JOIN `teams` AS t ON e.`id` = t.`leader_id`
SET e.`salary` = e.`salary` + 1000
WHERE age < 40 AND `salary` < 5000;

-- 4

DELETE g
FROM `games` AS g
LEFT JOIN `games_categories` AS gc
ON g.`id` = gc.`game_id`
WHERE gc.`game_id` IS NULL AND g.`release_date` IS NULL;
    