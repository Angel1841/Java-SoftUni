-- 5

SELECT * FROM `clients`
ORDER BY `birthdate` DESC, `id` DESC;

-- 6

SELECT `first_name`, `last_name`, `birthdate`, `review`
FROM `clients`
WHERE `card` IS NULL AND year(`birthdate`) BETWEEN 1978 AND 1993
ORDER BY `last_name` DESC, `id` ASC
LIMIT 5;

-- 7

SELECT CONCAT(`last_name`, `first_name`, CHAR_LENGTH(`first_name`), 'Restaurant') AS 'username',
		REVERSE(SUBSTR(`email`, 2, 12)) AS 'password'
		FROM `waiters`
WHERE `salary` IS NOT NULL
ORDER BY `password` DESC;

-- 8

SELECT p.`id`, p.`name`, COUNT(ord.`order_id`) AS 'count'
FROM products as p
JOIN orders_products as ord
ON p.id = ord.product_id
GROUP BY p.`name`
HAVING `count` >= 5

ORDER BY `count` DESC, p.`name` ASC;

-- 9

SELECT t.`id`, t.`capacity`, COUNT(oc.`client_id`) AS 'count_clients',
	CASE
		WHEN t.`capacity` > COUNT(oc.`client_id`) THEN 'Free seats'
		WHEN t.`capacity` = COUNT(oc.`client_id`) THEN 'Full'
		WHEN t.`capacity` < COUNT(oc.`client_id`) THEN 'Extra seats'
    	END AS `availability`

FROM `tables` AS t

JOIN `orders` AS o
ON t.id = o.table_id
JOIN `orders_clients` AS oc
ON o.id = oc.order_id
WHERE t.floor = 1

GROUP BY t.`id`

ORDER BY t.`id` DESC;