drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `cust_id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NOT NULL,
    `surname` VARCHAR(40) NOT NULL,
    PRIMARY KEY (`cust_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
    `order_id` INT NOT NULL AUTO_INCREMENT,
    `order_date` TIMESTAMP,
    `cust_id` INT NOT NULL,
    PRIMARY KEY (`order_id`),
    FOREIGN KEY (`cust_id`) REFERENCES customers(`cust_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
    `item_id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) NOT NULL,
    `price` DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (`item_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orderitems` (
    `ord_it_id` INT NOT NULL AUTO_INCREMENT,
    `amount` INT NOT NULL DEFAULT 1,
    `order_id` INT NOT NULL,
    `item_id` INT NOT NULL,
    PRIMARY KEY (`ord_it_id`),
    FOREIGN KEY (`order_id`) REFERENCES order(`order_id`),
    FOREIGN KEY (`item_id`) REFERENCES items(`item_id`)
);

