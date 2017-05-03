-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2017 at 02:38 PM
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
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `SSN` int(8) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `gender` varchar(11) NOT NULL,
  `phone` double NOT NULL,
  `age` int(5) NOT NULL,
  `address` text NOT NULL,
  `marital_status` varchar(10) NOT NULL,
  `weight` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`SSN`, `Name`, `gender`, `phone`, `age`, `address`, `marital_status`, `weight`) VALUES
(1, 'ali mohmed', 'male', 2763483, 23, 'esmailia', 'Single', 60),
(2, 'aya ahmed', 'female', 2.3597344, 25, 'cairo', 'Single', 58),
(3, 'ahmed shaker', 'male', 34623771, 22, 'kafr elshaikh', 'Single', 86),
(4, 'ahmed el3mary', 'male', 6327672, 21, 'esmaili		', 'Single', 70),
(546, 'ahmed mohamed', 'male', 67854328765, 77, 'egy', 'Single', 66);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`SSN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
