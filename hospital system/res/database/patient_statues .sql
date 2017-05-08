-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 08, 2017 at 12:01 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient_statues`
--

CREATE TABLE `patient_statues` (
  `ssn` int(20) NOT NULL,
  `doctor_report` text NOT NULL,
  `patient_investigation` text NOT NULL,
  `investigation_type` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_statues`
--

INSERT INTO `patient_statues` (`ssn`, `doctor_report`, `patient_investigation`, `investigation_type`) VALUES
(1, 'he has some pain in the head', 'we want an investigation of blood', 'blood'),
(2, 'he has some pain in the head', 'we want an investigation of blood', 'X-ray'),
(3, 'he has some pain in the head', 'we want an investigation of blood', 'blood');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient_statues`
--
ALTER TABLE `patient_statues`
  ADD PRIMARY KEY (`ssn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
