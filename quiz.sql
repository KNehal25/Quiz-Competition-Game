-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: quiz
-- ------------------------------------------------------
-- Server version	5.1.33-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gk`
--

DROP TABLE IF EXISTS `gk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gk` (
  `Sno` int(11) DEFAULT NULL,
  `Question` varchar(200) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gk`
--

LOCK TABLES `gk` WRITE;
/*!40000 ALTER TABLE `gk` DISABLE KEYS */;
INSERT INTO `gk` VALUES (1,'For how long did Kurukshetra war continue','20 days','25 days','18 days','29 days','c'),(2,'The first Sermon of Gautam Buddha was delivered at-','Sarnath','Lumbini','Gaya','Kapilvastu','a'),(3,'Life is absent on the moon due to lack of','Carbon','Hydrogen','Water','Nitrogen','c'),(4,'Which of the following vitamin is considered helpful to keep the eyes healthy','Vitamin A','Vitamin B complex','Vitamin D','Vitamin C','a'),(5,'The cricket ground GABA is located in which country','Australia','Pakistan','South Africa','England','a'),(6,'An electric bulb has a filament made of-','Copper','Iron','Lead','Tungsten','d'),(7,'The time period of pendulum on moon-','Decreses','Increases','Remains the same','Zero','b'),(8,'Chemically, dry ice is-','Solid Carbon dioxide','Solid Sulphur dioxide','Ice formed from distilled water','Ice kept at sub-zero temperatures','a'),(9,'The Indian Standard Time is local time of-','Delhi','Ujjain','Allahabad','Chennai','c'),(10,'At the equator, the duration of day is-','10 hours','12 hours','14 hours','16 hours','b');
/*!40000 ALTER TABLE `gk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ip`
--

DROP TABLE IF EXISTS `ip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ip` (
  `Sno` int(11) DEFAULT NULL,
  `Question` varchar(200) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ip`
--

LOCK TABLES `ip` WRITE;
/*!40000 ALTER TABLE `ip` DISABLE KEYS */;
INSERT INTO `ip` VALUES (1,'which of the following softwares is not open soures','OGG.','HTML.','WMA.','PNG.','c'),(2,'Which of the following is invalid identifier','Data_rec','_data','data 1','data1','c'),(3,'A constructor method has which datatype-','Void','No','Int','String','c'),(4,'A method that lacks a body is-','Null method','Abstract method','Private method','Protected method','b'),(5,'Which library is already imported in netbeans','java.io','java.util','java.awt','java.lang','d'),(6,'The value #FFFFFF is','Black','White','Red','None of the above','b'),(7,'To show duplicate rows from the result set of a SELECT use the following keyword','NO DUPLICATE','UNIQUE','DISTINCT','None of the above','d'),(8,'Mysql is-','A Programming language','A Markup language','A technique for writing reliable programs','A Relational Database Management System','d'),(9,'How many PRIMARY KEYs can be there in a table','One at most','Two at most','Many','There may be one per column','a'),(10,'What do meant by DEGREE','Rows','Column','No of Tuples','No of Attributes','d');
/*!40000 ALTER TABLE `ip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `ID` varchar(20) NOT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('nehal@25','123');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `result` (
  `ID` varchar(20) DEFAULT NULL,
  `ipResult` varchar(200) DEFAULT NULL,
  `gkResult` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES ('nehal@25','0','0');
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-15 11:37:33
