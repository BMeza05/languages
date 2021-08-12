-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema languages
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema languages
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `languages` DEFAULT CHARACTER SET utf8 ;
USE `languages` ;

-- -----------------------------------------------------
-- Table `languages`.`languages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `languages`.`languages` (
  `name` VARCHAR(45) NOT NULL,
  `creator` VARCHAR(45) NOT NULL,
  `version` INT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`name`, `creator`, `version`, `updated_at`, `created_at`))
ENGINE = InnoDB;

USE `languages` ;

-- -----------------------------------------------------
-- Placeholder table for view `languages`.`view1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `languages`.`view1` (`id` INT);

-- -----------------------------------------------------
-- View `languages`.`view1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `languages`.`view1`;
USE `languages`;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
