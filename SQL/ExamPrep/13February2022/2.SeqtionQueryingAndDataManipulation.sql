-- 2

INSERT INTO `reviews` (`content`, `picture_url`, `published_at`, `rating`)
	SELECT
		LEFT(`description`, 15),
        REVERSE(`name`),
		'2010-10-10',
        `price` / 8
		
    FROM `products`
    
	WHERE `id` >= 5;

-- 3 
SET SQL_SAFE_UPDATES = 0;
UPDATE `products`
SET `quantity_in_stock` = `quantity_in_stock` - 5
WHERE `quantity_in_stock` BETWEEN 60 AND 70;

-- 4
DELETE c
FROM `customers` AS c
LEFT JOIN `orders` AS o ON c.`id` = o.`customer_id`
WHERE o.`customer_id` IS NULL;

-- 5 
SELECT `id`,`name` FROM `categories`
ORDER BY `name` DESC; 

-- 6
SELECT `id`, `brand_id`, `name`, `quantity_in_stock` FROM `products`
WHERE `price` > 1000 AND `quantity_in_stock` < 30
ORDER BY `quantity_in_stock` ASC, `id`;

-- 7 
SELECT * FROM `reviews`
WHERE LEFT(`content`, 2) = 'My' AND CHAR_LENGTH(`content`) > 61
ORDER BY `rating` DESC;

-- 8 
SELECT 
	CONCAT_WS(' ', c.`first_name`, c.`last_name`) AS 'full_name' ,
    c.`address`,
    o.`order_datetime`
    FROM `customers` AS c
	LEFT JOIN `orders` AS o ON c.`id` = o.`customer_id`
    WHERE YEAR(o.`order_datet ime`) <= 2018
	ORDER BY `full_name` DESC;
    
-- 9
SELECT COUNT(p.`id`) AS 'items_count', c.`name`, SUM(p.`quantity_in_stock`) AS 'total_quantity' 
FROM `products` AS p
RIGHT JOIN `categories` AS c
ON p.`category_id` = c.`id`
GROUP BY p.`category_id`
ORDER BY `items_count` DESC, `total_quantity`
LIMIT 5;


	