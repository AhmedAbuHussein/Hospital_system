-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 02:06 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

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
-- Table structure for table `doctor_information`
--

CREATE TABLE `doctor_information` (
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
-- Dumping data for table `doctor_information`
--

INSERT INTO `doctor_information` (`ssn`, `name`, `phone`, `date_of_birth`, `blood_group`, `e_mail`, `website`, `address`, `department`, `qualification`, `academics`) VALUES
(1, 'heba hamed', 457878, '2017-05-08', 'A+', 'heba@yahoo.com', 'heba@gmail.com', 'dammiete', 'general', 'kxgjkd', 'kvfdjhvj'),
(2, 'heba hamed', 457878, '1994-01-01', 'A+', 'heba@yahoo.com', 'heba@gmail.com', 'dammiete', 'General', 'kxgjkd', 'kvfdjhvj'),
(3, 'heba hamed', 457878, '1994-01-01', 'A+', 'heba@yahoo.com', 'heba@gmail.com', 'dammiete', 'General', 'kxgjkd', 'kvfdjhvj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor_information`
--
ALTER TABLE `doctor_information`
  ADD PRIMARY KEY (`ssn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
