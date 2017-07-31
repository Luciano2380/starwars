-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: starwars
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

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
-- Table structure for table `tripulacoes`
--

DROP TABLE IF EXISTS `tripulacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tripulacoes` (
  `id_tri` int(11) NOT NULL AUTO_INCREMENT,
  `nave_tri` varchar(30) COLLATE utf8_bin NOT NULL,
  `tripulante1_tri` varchar(30) COLLATE utf8_bin NOT NULL,
  `tripulante2_tri` varchar(30) COLLATE utf8_bin NOT NULL,
  `tripulante3_tri` varchar(30) COLLATE utf8_bin NOT NULL,
  `tripulante4_tri` varchar(30) COLLATE utf8_bin NOT NULL,
  `usu_tri` int(11) NOT NULL,
  PRIMARY KEY (`id_tri`),
  KEY `fk_usuarios` (`usu_tri`),
  CONSTRAINT `fk_usuarios` FOREIGN KEY (`usu_tri`) REFERENCES `usuarios` (`id_usu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripulacoes`
--

LOCK TABLES `tripulacoes` WRITE;
/*!40000 ALTER TABLE `tripulacoes` DISABLE KEYS */;
INSERT INTO `tripulacoes` VALUES (3,'Calamari Cruiser','Wilhuff Tarkin','Chewbacca','Han Solo','Greedo',1),(4,'Republic Cruiser','Jabba Desilijic Tiure','Wedge Antilles','Yoda','Jek Tono Porkins',1),(5,'Naboo fighter','Greedo','Jabba Desilijic Tiure','Wedge Antilles','Jek Tono Porkins',1);
/*!40000 ALTER TABLE `tripulacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usu` int(11) NOT NULL AUTO_INCREMENT,
  `login_usu` varchar(30) COLLATE utf8_bin NOT NULL,
  `senha_usu` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_usu`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'luk','1478'),(2,'lucas','1234');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-30 23:09:05
