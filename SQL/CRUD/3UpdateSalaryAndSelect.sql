
SET SQL_SAFE_UPDATES = 0;

UPDATE `employees`
SET `salary` = `salary` + 100
WHERE `job_title` = 'Manager';

SELECT `salary` FROM `employees`;