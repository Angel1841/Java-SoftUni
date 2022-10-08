USE `minions`;

CREATE TABLE `towns`(
	
    `town_id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL

);

ALTER TABLE `minions`
ADD COLUMN `town_id` INT NOT NULL,
ADD CONSTRAINT `fk_minions-towns`
FOREIGN KEY (`town_id`)
REFERENCES `towns` (`id`);

INSERT INTO `towns`(`id`, `name`)
VALUES (1, "Sofia"), (2, "Plovdiv"), (3, "Varna");

USE `minions`;
INSERT INTO `minions`(`id`, `name`, `age`, `town_id`)
VALUES (1, "Kevin", 22, 1), 
		(2, "Bob", 15, 3),
        (3, "Steward", NULL, 2);
        
USE `minions`; 
TRUNCATE TABLE `minions`;

USE `minions`; 
DROP TABLE `minions`;
DROP TABLE `towns`;
