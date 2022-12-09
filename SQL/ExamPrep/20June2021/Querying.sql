-- 5

SELECT `make`, `model`, `condition`
FROM `cars`
ORDER BY `id`;

-- 6

SELECT d.`first_name`, d.`last_name`, c.`make`, c.`model`, c.`mileage`
FROM `drivers` AS d
JOIN `cars_drivers` AS cd 
ON cd.`driver_id` = d.`id`
JOIN `cars` AS c
ON c.`id` = cd.`car_id`
WHERE `mileage` IS NOT NULL
ORDER BY `mileage` DESC, `first_name`;


-- 7 

SELECT c.`id`, c.`make`, c.`mileage`, COUNT(co.`id`) AS 'count_of_courses', ROUND(AVG(co.`bill`), 2) AS 'avg_bill'
FROM `cars` AS c
LEFT JOIN `courses` AS co
ON c.`id` = co.`car_id`
GROUP BY c.`id`
HAVING `count_of_courses` <> 2
ORDER BY `count_of_courses` DESC, c.`id`;


-- 8
SELECT c.full_name, COUNT(co.`id`) AS 'count_of_cars', SUM(co.`bill`) AS 'total_sum'
FROM `clients` AS c
JOIN `courses` AS co
ON c.`id` = co.`client_id`
GROUP BY c.`id`
HAVING SUBSTR(c.`full_name`, 2, 1) LIKE 'a' AND `count_of_cars` > 1
ORDER BY c.`full_name`;

-- 9

-- 09. Full info for courses
SELECT a.`name`, 
		IF(hour(co.`start`) BETWEEN 6 AND 20, 'Day', 'Night') AS day_time,
        co.bill, c.full_name, ca.make, ca.model, cat.`name`
FROM courses AS co
JOIN addresses AS a
ON a.id = co.from_address_id
LEFT JOIN clients AS c
ON co.client_id = c.id
LEFT JOIN cars AS ca
ON co.car_id = ca.id
LEFT JOIN categories AS cat
ON ca.category_id = cat.id
ORDER BY co.id;