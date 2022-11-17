-- 10

DELIMITER $$;
CREATE FUNCTION udf_game_info_by_name (game_name VARCHAR (20))
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
	DECLARE info VARCHAR (255);
	DECLARE team_name VARCHAR (40);
    DECLARE address_text VARCHAR (50);
    
    SET team_name := (SELECT t.`name`
    FROM `teams` AS t
    JOIN `games` AS g
    ON t.`id` = g.`team_id`
    WHERE g.`name` = game_name);
    
    SET address_text := (SELECT a.`name` FROM
    `addresses` AS a
    JOIN `offices` AS o
    ON a.`id` = o.`address_id`
    JOIN `teams` AS t
    ON t.`office_id` = o.`id`
    WHERE t.`name` = team_name);
    
    SET info := concat_ws(' ', 'The', `game_name`, 'is developed by a', `team_name`, 'in an office with an address', `address_text`);
    
    RETURN info;
    
    END$$;
    
    
-- 11
DELIMITER $$;
CREATE PROCEDURE udp_update_budget (min_game_rating FLOAT)
BEGIN
		UPDATE `games` AS g
        LEFT JOIN `games_categories` AS gc
        ON g.`id` = gc.`game_id`
        SET g.`budget` = g.`budget` + 100000,
				g.release_date = adddate(g.release_date, INTERVAL 1 YEAR)
        WHERE gc.`category_id` IS NULL 
			AND g.`rating` > `min_game_rating`
            AND g.`release_date` IS NOT NULL;
END$$;