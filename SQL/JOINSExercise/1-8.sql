-- 01. Employee Address 
SELECT e.`employee_id`, e.`job_title`, e.`address_id`, a.`address_text`
FROM `employees` AS e
INNER JOIN `addresses` AS a
ON e.`address_id` = a.`address_id`
ORDER BY a.`address_id`
LIMIT 5;

-- 02. Addresses with Towns
SELECT e.`first_name`, e.`last_name`, t.`name`, a.`address_text`
FROM `employees` AS e
INNER JOIN `addresses` AS a
ON e.`address_id` = a.`address_id`
INNER JOIN `towns` AS t
ON a.`town_id` = t.`town_id`
ORDER BY e.`first_name`, e.`last_name`
LIMIT 5;

-- 03. Sales Employee
SELECT e. `employee_id`, e.`first_name`, e.`last_name`, d.`name`
FROM `employees` AS e
INNER JOIN `departments` AS d
ON e.`department_id` = d.`department_id`
WHERE d.`name` = 'Sales'
ORDER BY e.`employee_id` DESC;

-- 04. Employee Departments
SELECT e.`employee_id`, e.`first_name`, e.`salary`, d.`name` AS 'department_id'
FROM `employees` AS e 
INNER JOIN `departments` AS d ON e.`department_id` = d.`department_id`
WHERE e.`salary` > 15000
ORDER BY d.`department_id` DESC
LIMIT 5;


-- 6
SELECT e.`first_name`, e.`last_name`, e.`hire_date`, d.`name`
FROM `employees` AS e
INNER JOIN `departments` AS d
ON e.`department_id` = d.`department_id`
WHERE d.`name` IN ('Sales', 'Finance') AND e.`hire_date` > '1999-01-01 00:00:00'
ORDER BY e.`hire_date`;

-- 7

SELECT e.`employee_id`, e.`first_name`, p.`name`
FROM `employees` AS e
	JOIN `employees_projects` AS ep ON e.`employee_id` = ep.`employee_id`
	JOIN `projects` AS p ON p.`project_id` = ep.`project_id`
WHERE DATE(p.`start_date`) > '2002-08-13' AND p.end_date IS NULL
ORDER BY e.`first_name`, p.`name`
LIMIT 5;

-- 8 

SELECT e.`employee_id`,
		e.`first_name`,
        IF(YEAR(p.`start_date`) >= 2005, NULL, p.`name`) AS 'project_name'
FROM `employees` AS e
JOIN `employees_projects` AS ep ON e.`employee_id` = ep.`employee_id`
JOIN `projects` AS p ON ep.`project_id` = p.`project_id`
WHERE e.`employee_id` = 24
ORDER BY p.`name`;

-- 9 

SELECT e1.`employee_id`, e1.`first_name`, e1.`manager_id`, (
	SELECT e2.`first_name`
    FROM `employees` AS e2
    WHERE e1.`manager_id` = e2.`employee_id`
    ) AS 'manager_name'
FROM `employees` AS e1
WHERE e1.`manager_id` IN (3, 7)
ORDER BY e1.`first_name`;

-- 11

SELECT AVG(`salary`) AS 'min_avg_salary'
FROM `employees`
GROUP BY `department_id`
ORDER BY `min_avg_salary`
LIMIT 1;
