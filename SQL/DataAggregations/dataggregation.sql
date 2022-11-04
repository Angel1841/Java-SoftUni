
-- 1. Departments Info
SELECT `department_id`, COUNT(`id`)
FROM `employees`
GROUP BY `department_id`;

-- 2. Average Salary
SELECT `department_id`, ROUND(AVG(`salary`),2)
FROM `employees`
GROUP BY `department_id`;

-- 3. Minimum Salary
SELECT `department_id`,
	ROUND(MIN(`salary`),2) AS 'minSalary'
FROM `employees`
GROUP BY `department_id`
HAVING `minSalary` > 800;


SELECT COUNT(*) FROM `products`
WHERE `category_id` = 2 AND PRICE > 8;

SELECT `category_id`,
	ROUND(AVG(`price`), 2) AS 'AveragePrice',
    ROUND(MIN(`price`), 2) AS 'CheapestProduct',
    ROUND(MAX(`price`), 2) AS 'MostExpensiveProduct'
FROM `products` 
GROUP BY `category_id`;

