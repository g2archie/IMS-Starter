INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('matt', 'noyes');

INSERT INTO `ims`.`items` (`name`, `price`) VALUES ('computer', 1000.00);
INSERT INTO `ims`.`items` (`name`, `price`) VALUES ('monitor', 299.99);
INSERT INTO `ims`.`items` (`name`, `price`) VALUES ('desk', 50.00);

INSERT INTO `ims`.`orders` (`order_date`, `cust_id`) VALUES (NOW(), 1);
INSERT INTO `ims`.`orders` (`order_date`, `cust_id`) VALUES (NOW(), 1);
INSERT INTO `ims`.`orders` (`order_date`, `cust_id`) VALUES (NOW(), 2);

INSERT INTO `ims`.`orderitems` (`amount`, `order_id`, 'item_id') VALUES (1, 1, 1);
INSERT INTO `ims`.`orderitems` (`amount`, `order_id`, 'item_id') VALUES (1, 1, 2);
INSERT INTO `ims`.`orderitems` (`amount`, `order_id`, 'item_id') VALUES (2, 3, 3);
INSERT INTO `ims`.`orderitems` (`amount`, `order_id`, 'item_id') VALUES (10, 3, 1);
INSERT INTO `ims`.`orderitems` (`amount`, `order_id`, 'item_id') VALUES (1, 2, 2);


