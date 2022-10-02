CREATE TABLE `cart` (
  `username` varchar(50) DEFAULT NULL,
  `Productname` varchar(50) DEFAULT NULL,
  `Pprice` int DEFAULT NULL,
  `Quantity` int DEFAULT NULL);
  
  INSERT INTO `cart` VALUES (('rushi','laptop',420000,2),('vaishali','laptop',0,0),('jayshree','laptop',0,0));
select * from cart;
