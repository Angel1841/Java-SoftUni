-- 2

INSERT INTO `products`(`name`, `type`, `price`)
SELECT
	CONCAT(`last_name`, ' ', 'specialty'),
    'Cocktail',
    CEILING(`salary` * 0.01)
    
    FROM `waiters`
    
    WHERE `id` > 6;
    
-- 3

UPDATE `orders`
SET `table_id` = `table_id` - 1
WHERE id between 12 and 23;

-- 4
SET SQL_SAFE_UPDATES = 0;
DELETE w
FROM `waiters` AS w
LEFT JOIN `orders` AS o
ON w.`id` = o.`waiter_id`
WHERE o.`waiter_id` IS NULL;
