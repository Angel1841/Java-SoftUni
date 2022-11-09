-- 1

SELECT `employee_id`, concat_ws(' ', e.first_name, e.last_name) AS 'full_name', d.`department_id`, d.`name`
FROM `employees` AS e
RIGHT JOIN `departments` AS d
ON d.manager_id = e.employee_id
ORDER BY e.`employee_id`
LIMIT 5;

-- 2 

SELECT 
    COUNT(`employee_id`)
FROM
    employees AS e
WHERE
    e.salary > (SELECT 
            AVG(e.salary)
        FROM
            employees AS e);