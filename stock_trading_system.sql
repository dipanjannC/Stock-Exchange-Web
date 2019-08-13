create database stock_management_system;
use stock_management_system;

CREATE TABLE `sectors` (
  `id` int(11) auto_increment,
  `sector_name` varchar(45) DEFAULT NULL,
 `brief` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

desc sectors;

insert into sectors(sector_name,brief)  values('tech','growing rapidly');
select * from sectors;



CREATE TABLE `user` (
  `id` int(11)  auto_increment,
  `username` varchar(45) DEFAULT NULL,
  
`password` varchar(45) DEFAULT NULL,
  `usertype` varchar(45) DEFAULT NULL,
  
`email` varchar(45) DEFAULT NULL,
  `mobilenumber` int(10) DEFAULT NULL,
  
`confirmed` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `stockexchange` (
  `stockexchange_id` int(11) auto_increment,
  `stockExchange_name`  varchar(45) not null,
  
`brief` varchar(45) DEFAULT NULL,
  `contactaddress` varchar(45) DEFAULT NULL,
 
 `remarks` varchar(45) DEFAULT NULL,
  
PRIMARY KEY (`stockexchange_id`)
);



 
 
CREATE TABLE `company` (
  `company_code` int(11) NOT NULL,
  `company_Name` varchar(45) DEFAULT NULL,
  
`turnover` decimal(10,0) DEFAULT NULL,
  `ceo` varchar(45) DEFAULT NULL,
  
`boardofdirectors` varchar(100) DEFAULT NULL,
  `sector_id` int(11) DEFAULT NULL,
 
 `breifwriteup` varchar(200) DEFAULT NULL,
  `stock_Code` int(11) DEFAULT NULL,
 
 PRIMARY KEY (`company_code`),
    FOREIGN KEY (sector_id) REFERENCES sectors(id)
);




CREATE TABLE `ipo_planned` (
  `id` int(11) NOT NULL,
  `Company_code` int(11) DEFAULT NULL,
  
`Stock_exchange` int(11) DEFAULT NULL,
  `price_per_share` decimal(10,0) DEFAULT NULL,
 
 `total_no_of_shares` int(11) DEFAULT NULL,
  `open_date_time` date DEFAULT NULL,
  
`remarks` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
 FOREIGN KEY (Company_code) REFERENCES company(company_code),
 FOREIGN KEY (Stock_exchange) REFERENCES stockexchange(stockexchange_id));
 
 
insert into company values(1001, 'insofys',232.23,'sdf','sdf',1,'sdf',343);

select * from company;