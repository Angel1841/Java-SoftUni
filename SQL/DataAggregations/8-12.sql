-- 08. Deposit Charge

SELECT `deposit_group`, `magic_wand_creator`, MIN(`deposit_charge`) AS 'min_deposit_charge' FROM `wizzard_deposits`
GROUP BY `deposit_group`, `magic_wand_creator`
ORDER BY `magic_wand_creator`, `deposit_group` ASC;

-- 09. Age Groups
SELECT 
	CASE
		WHEN age <= 10 THEN '[0-10]'
		WHEN age <= 20 THEN '[11-20]'
		WHEN age <= 30 THEN '[21-30]'
		WHEN age <= 40 THEN '[31-40]'
		WHEN age <= 50 THEN '[41-50]'
		WHEN age <= 60 THEN '[51-60]'
		ELSE '[61+]'
	END AS 'age_group',
	COUNT(`id`) AS 'wizard_count'
FROM `wizzard_deposits`
GROUP BY `age_group`
ORDER BY `wizard_count`;

-- 10. First Letter

SELECT LEFT(`first_name`, 1) AS 'first_letter'
FROM `wizzard_deposits`
WHERE `deposit_group` = 'Troll Chest'
GROUP BY `first_letter`
ORDER BY `first_letter`;

-- 11. Average Interest

SELECT `deposit_group`, `is_deposit_expired`, AVG(`deposit_interest`) AS `average_interest`
FROM `wizzard_deposits`
WHERE `deposit_start_date` > 01/01/1985
GROUP BY `deposit_group`, `is_deposit_expired`
ORDER BY `deposit_group` DESC, `is_deposit_expired`;

