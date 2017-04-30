-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2017 at 04:07 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `hospital_system`
--

CREATE TABLE `hospital_system` (
  `SSN` int(5) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `Phone` int(11) NOT NULL,
  `Age` int(10) NOT NULL,
  `Address` text NOT NULL,
  `MaritalStatus` varchar(20) NOT NULL,
  `Weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital_system`
--

INSERT INTO `hospital_system` (`SSN`, `FirstName`, `LastName`, `gender`, `Phone`, `Age`, `Address`, `MaritalStatus`, `Weight`) VALUES
(1, 'ali', 'ahmed', 'male', 1234567891, 20, 'egypt', 'single', 55);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hospital_system`
--
ALTER TABLE `hospital_system`
  ADD PRIMARY KEY (`SSN`),
  ADD KEY `SSN` (`SSN`),
  ADD KEY `SSN_2` (`SSN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
