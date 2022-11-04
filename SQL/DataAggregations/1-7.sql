-- 01. Records’ Count

SELECT COUNT(`id`) AS 'count' FROM `wizzard_deposits`;

-- 02. Longest Magic Wand

SELECT MAX(`magic_wand_size`) AS 'longest magic wand' FROM `wizzard_deposits`;

-- 03. Longest Magic Wand per Deposit Groups

SELECT `deposit_group`, MAX(`magic_wand_size`) AS 'longest magic wand' FROM `wizzard_deposits`
GROUP BY `deposit_group`
ORDER BY `longest magic wand`, `deposit_group`;

-- 04. Smallest Deposit Group per Magic Wand Size
SELECT `deposit_group` FROM `wizzard_deposits`
GROUP BY `deposit_group`
ORDER BY AVG(`magic_wand_size`)
LIMIT 1;

-- 05. Deposits Sum
SELECT `deposit_group`, SUM(`deposit_amount`) AS 'total_sum' FROM `wizzard_deposits`
GROUP BY `deposit_group`
ORDER BY `total_sum`;

-- 06. Deposits Sum for Ollivander Family

SELECT `deposit_group`, SUM(`deposit_amount`) AS 'total_sum' FROM `wizzard_deposits`
WHERE `magic_wand_creator` = 'Ollivander family'
GROUP BY `deposit_group`
ORDER BY `deposit_group`;

-- 07. Deposits Filter

SELECT `deposit_group`, SUM(`deposit_amount`) AS 'total_sum' FROM `wizzard_deposits`
WHERE `magic_wand_creator` = 'Ollivander family'
GROUP BY `deposit_group`
HAVING `total_sum` < 150000
ORDER BY `total_sum` DESC;
