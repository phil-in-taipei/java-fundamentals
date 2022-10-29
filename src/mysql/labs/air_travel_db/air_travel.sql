CREATE DATABASE  IF NOT EXISTS `air_travel` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `air_travel`;
-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: air_travel
-- ------------------------------------------------------
-- Server version	8.0.31-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `airlines`
--

DROP TABLE IF EXISTS `airlines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airlines` (
  `idairlines` int NOT NULL AUTO_INCREMENT,
  `airlines_name` varchar(250) NOT NULL,
  PRIMARY KEY (`idairlines`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airlines`
--

LOCK TABLES `airlines` WRITE;
/*!40000 ALTER TABLE `airlines` DISABLE KEYS */;
INSERT INTO `airlines` VALUES (1,'PanAm'),(2,'SouthWest'),(3,'Eva'),(4,'ChinaAirlines');
/*!40000 ALTER TABLE `airlines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `idflights` int NOT NULL AUTO_INCREMENT,
  `departure_time` timestamp NOT NULL,
  `arrival_time` timestamp NOT NULL,
  `departure_location_id` int NOT NULL,
  `arrival_location_id` int NOT NULL,
  `plane_id` int NOT NULL,
  `airline_id` int NOT NULL,
  PRIMARY KEY (`idflights`),
  KEY `departure_id_idx` (`departure_location_id`),
  KEY `arrival_id_idx` (`arrival_location_id`),
  KEY `plane_id_idx` (`plane_id`),
  KEY `airline_id_idx` (`airline_id`),
  CONSTRAINT `airline_id` FOREIGN KEY (`airline_id`) REFERENCES `airlines` (`idairlines`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `arrival_id` FOREIGN KEY (`arrival_location_id`) REFERENCES `locations` (`idlocations`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `departure_id` FOREIGN KEY (`departure_location_id`) REFERENCES `locations` (`idlocations`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `plane_id` FOREIGN KEY (`plane_id`) REFERENCES `planes` (`idplanes`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES (1,'2022-11-20 02:14:07','2022-11-20 07:14:00',2,5,1,1),(2,'2022-11-21 02:14:07','2022-11-21 07:14:00',2,5,1,1);
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locations` (
  `idlocations` int NOT NULL AUTO_INCREMENT,
  `airport_name` varchar(250) NOT NULL,
  PRIMARY KEY (`idlocations`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` VALUES (1,'ChaingKaiShek'),(2,'Reagan'),(3,'Dulles'),(4,'JohnFKennedy'),(5,'PortlandInternational');
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengers`
--

DROP TABLE IF EXISTS `passengers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengers` (
  `idpassengers` int NOT NULL AUTO_INCREMENT,
  `passport_number` int NOT NULL,
  `given_name` varchar(150) NOT NULL,
  `surname` varchar(150) NOT NULL,
  PRIMARY KEY (`idpassengers`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers`
--

LOCK TABLES `passengers` WRITE;
/*!40000 ALTER TABLE `passengers` DISABLE KEYS */;
INSERT INTO `passengers` VALUES (1,111111111,'Shortshort','Sally'),(2,222222222,'Liza','AlDente'),(3,333333333,'Henry','Tesla'),(4,444444444,'Nicola','Ford'),(5,555555555,'AgentAlice','Cooper');
/*!40000 ALTER TABLE `passengers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planes`
--

DROP TABLE IF EXISTS `planes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planes` (
  `idplanes` int NOT NULL AUTO_INCREMENT,
  `plane_name` varchar(150) NOT NULL,
  PRIMARY KEY (`idplanes`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planes`
--

LOCK TABLES `planes` WRITE;
/*!40000 ALTER TABLE `planes` DISABLE KEYS */;
INSERT INTO `planes` VALUES (1,'TheJuneTulip'),(2,'AirForceInfinity'),(3,'TheBlindenbot'),(4,'EffSixteen'),(5,'ShopBum');
/*!40000 ALTER TABLE `planes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tickets` (
  `idtickets` int NOT NULL AUTO_INCREMENT,
  `flight_id` int NOT NULL,
  `passenger_id` int NOT NULL,
  `price` decimal(19,2) NOT NULL,
  PRIMARY KEY (`idtickets`),
  KEY `flight_id_idx` (`flight_id`),
  KEY `passenger_id_idx` (`passenger_id`),
  CONSTRAINT `flight_id` FOREIGN KEY (`flight_id`) REFERENCES `flights` (`idflights`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `passenger_id` FOREIGN KEY (`passenger_id`) REFERENCES `passengers` (`idpassengers`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES (1,1,2,500.53),(2,1,1,75.00);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-29 21:48:34
