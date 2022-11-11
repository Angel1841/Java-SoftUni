SELECT v.`driver_id`,
v.`vehicle_type`,
CONCAT(c.`first_name`, ' ', c.`last_name`) as 'driver name'

FROM `vehicles` AS v 
JOIN 
campers AS c ON v.driver_id = c.id;