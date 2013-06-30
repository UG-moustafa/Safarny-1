-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema travel
--

CREATE DATABASE IF NOT EXISTS travel;
USE travel;

--
-- Definition of table `airports`
--

DROP TABLE IF EXISTS `airports`;
CREATE TABLE `airports` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `airport_name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `airports`
--

/*!40000 ALTER TABLE `airports` DISABLE KEYS */;
INSERT INTO `airports` (`id`,`airport_name`) VALUES 
 (1,'borg el arab'),
 (2,'alexx');
/*!40000 ALTER TABLE `airports` ENABLE KEYS */;


--
-- Definition of table `booking hotel`
--

DROP TABLE IF EXISTS `booking hotel`;
CREATE TABLE `booking hotel` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `ticket_id` int(10) unsigned NOT NULL,
  `country` varchar(45) NOT NULL,
  `hotel` varchar(45) NOT NULL,
  `no_of_rooms` varchar(45) NOT NULL,
  `no_of_nights` varchar(45) NOT NULL,
  `total_price` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_booking hotel_1` (`ticket_id`),
  CONSTRAINT `FK_booking hotel_1` FOREIGN KEY (`ticket_id`) REFERENCES `booking` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `booking hotel`
--

/*!40000 ALTER TABLE `booking hotel` DISABLE KEYS */;
INSERT INTO `booking hotel` (`id`,`ticket_id`,`country`,`hotel`,`no_of_rooms`,`no_of_nights`,`total_price`) VALUES 
 (1,1,'london','ggg','2','3','1000');
/*!40000 ALTER TABLE `booking hotel` ENABLE KEYS */;


--
-- Definition of table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `no_of_ticket` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `from` varchar(45) NOT NULL,
  `airport` varchar(45) NOT NULL,
  `to` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `num_of_passenger` varchar(45) NOT NULL,
  `num_of_childern` varchar(45) NOT NULL,
  `num_of_baby` varchar(45) NOT NULL,
  `total_price` varchar(45) NOT NULL,
  `notes` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `booking`
--

/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` (`id`,`no_of_ticket`,`name`,`email`,`state`,`from`,`airport`,`to`,`date`,`num_of_passenger`,`num_of_childern`,`num_of_baby`,`total_price`,`notes`) VALUES 
 (1,'150','ahmed','bbb','go','alex','borg el arab','london','20/5','2','1','0','2000','kkkkkkkkkkkkkkkkk');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;


--
-- Definition of table `contries`
--

DROP TABLE IF EXISTS `contries`;
CREATE TABLE `contries` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `contry_name` varchar(45) NOT NULL,
  `price_on_go_pass` varchar(45) NOT NULL,
  `price_on_go_childern` varchar(45) NOT NULL,
  `price_on_go_baby` varchar(45) NOT NULL,
  `p_on_go_back_pass` varchar(45) NOT NULL,
  `p_on_go_back_children` varchar(45) NOT NULL,
  `p_on_go_back_baby` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contries`
--

/*!40000 ALTER TABLE `contries` DISABLE KEYS */;
/*!40000 ALTER TABLE `contries` ENABLE KEYS */;


--
-- Definition of table `hotels`
--

DROP TABLE IF EXISTS `hotels`;
CREATE TABLE `hotels` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `country_id` int(10) unsigned NOT NULL,
  `hotel_name` varchar(45) NOT NULL,
  `price_at_night` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_hotels_1` (`country_id`),
  CONSTRAINT `FK_hotels_1` FOREIGN KEY (`country_id`) REFERENCES `contries` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hotels`
--

/*!40000 ALTER TABLE `hotels` DISABLE KEYS */;
/*!40000 ALTER TABLE `hotels` ENABLE KEYS */;


--
-- Definition of table `province`
--

DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `province_name` varchar(45) NOT NULL,
  `airport_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_province_1` (`airport_id`),
  CONSTRAINT `FK_province_1` FOREIGN KEY (`airport_id`) REFERENCES `airports` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `province`
--

/*!40000 ALTER TABLE `province` DISABLE KEYS */;
INSERT INTO `province` (`id`,`province_name`,`airport_id`) VALUES 
 (1,'alex',1),
 (2,'alex',2);
/*!40000 ALTER TABLE `province` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
