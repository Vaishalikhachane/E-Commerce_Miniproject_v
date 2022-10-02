CREATE TABLE `product` (
  `Pid` int NOT NULL AUTO_INCREMENT,
  `Descriptions` varchar(50) DEFAULT NULL,
  `Price` int DEFAULT NULL,
  `Pnames` varchar(50) DEFAULT NULL,
  `Quantity` int DEFAULT NULL,
  PRIMARY KEY (`Pid`));
  
  INSERT INTO `product` VALUES (1,'Electrical',70000,'laptop',28),(2,'Electrical',120000,'mobile',23),(3,'Electrical',2000,'headphones',20),(4,'Electrical',1000,'mouse',10),(5,'Electrical',100,'mousepad',35),(6,'Electrical',1100,'keyborad',25),(7,'Electrical',5000,'RAM',20),(8,'Electrical',9000,'monitor',6),(9,'Electrical',900,'earphone',60),(10,'Electrical',1000,'MobileCharger',45);

select * from product;