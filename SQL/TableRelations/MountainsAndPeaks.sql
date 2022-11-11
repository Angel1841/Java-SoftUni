CREATE TABLE `mountains`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL
);

CREATE TABLE `peaks`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `mountain_id` INT NOT NULL,
    CONSTRAINT fk_peaks_mountains
    FOREIGN KEY (`mountain_id`)
    REFERENCES mountains(`id`)
);