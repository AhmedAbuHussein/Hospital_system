-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 12:30 PM
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
-- Table structure for table `nurse_information`
--

CREATE TABLE `nurse_information` (
  `ssn` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` int(11) NOT NULL,
  `date_of_birth` date NOT NULL,
  `blood_group` varchar(20) NOT NULL,
  `e_mail` varchar(20) NOT NULL,
  `website` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `department` varchar(20) NOT NULL,
  `qualification` text NOT NULL,
  `academics` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nurse_information`
--

INSERT INTO `nurse_information` (`ssn`, `name`, `phone`, `date_of_birth`, `blood_group`, `e_mail`, `website`, `address`, `department`, `qualification`, `academics`) VALUES
(2, 'mona ahmed', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(3, 'ali', 1203800502, '2016-09-13', 'O-', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'Bones', 'excellent', 'alex_university'),
(4, 'ali mohamed', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(6, 'ali ksjis', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(9, 'mona ahmed ', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(10, 'mona ahmed ', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(12, 'ali mohamed ', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(20, 'ali ', 1203800502, '1994-01-01', 'A+', 'a.h@yahoo.com', 'ali.weebly.com', 'egypt alex ', 'General', 'excellent', 'alex_university'),
(30, 'mona ali ahmed', 2012022012, '1994-01-01', 'A+', 'ahmed.com@yahoo', 'mfvkdjkxk', 'mdkjks', 'General', 'djshj', 'kjkzfdj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `nurse_information`
--
ALTER TABLE `nurse_information`
  ADD PRIMARY KEY (`ssn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
