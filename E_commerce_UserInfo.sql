CREATE TABLE `userinfo` (
  `Email` varchar(50) NOT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `MobileNo` bigint DEFAULT NULL,
  PRIMARY KEY (`Email`)
);
INSERT INTO `userinfo` VALUES (('vaishali15@gmail.com','vaishu','khachane' ,78675664),('jayashre@123','jayshree','mausmare',232532),('kahi','abhi','mujme',12323),('kjh#2','kjh4','jh',87654),('kjhg2','jhgKJHG','JHG',8765),('qw@','ertet','ertett',12123),('rushi@113','rushi','shah',123123),('rushi@123','rushi','nikam',123141),('rushi@812','wwerwr','wrww',123313),('safasf@','adadasd','rqwrer',121214),('sd2','rushi','ahwert',12123),('sdad@','adqwq','zvzvz',1231),('shah@1234','prathya','shah',12334),('vaishali@123','vaishali','kachane',1212),('wewv2','ada','asdadad',141412),('yogesh@12','yogesh','shelar',12414));

select * from userinfo;

