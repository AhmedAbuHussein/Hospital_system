-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2017 at 08:19 PM
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
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductID` int(15) NOT NULL DEFAULT '0',
  `ProductName` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `Category` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `price` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `deadline` text COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductID`, `ProductName`, `Category`, `price`, `deadline`) VALUES
(1000, ' Abacavir', 'Capsules', '20 EGP', '2017-05-11'),
(1001, 'Alerid', 'Tablets/Syrup', '34 EGP', '2017-05-04'),
(1002, 'Antidiazox', 'suspension', '17 EGP', '2017-05-01'),
(1003, 'Alpha Kadol', 'Ointment ', '44 EGP', '2017-05-12'),
(1004, 'Adanoid', 'Gel', '13 EGP', '2017-07-06'),
(1005, 'Bronchotec', 'Syrup ', '23 EGP', '2017-06-15'),
(1006, 'Batrafen', 'Cream', '33 EGP', '2017-05-23'),
(1007, 'Bepra', 'Tablets ', '37 EGP', '2017-05-22'),
(1008, 'Cidomycin', 'Cream/Ointment ', '24 EGP', '2017-05-12'),
(1009, 'Clomid', 'Tablets', '24 EGP', '2017-05-10'),
(1010, 'Deltarhino', 'Spray', '17 EGP', '2017-03-14'),
(1011, 'Disartan', 'Capsules', '29 EGP ', '2017-07-21'),
(1012, 'Ebastel', 'Tablets', '33 EGP', '2017-08-15'),
(1013, 'Ebastel Syrup', 'Syrup', '51 EGP', '2017-08-21'),
(1014, ' Gridamom', 'Cream/Ointment', '44 EGP', '2017-06-14'),
(1015, 'Gentazone', 'Cream', '53 EGP', '2017-05-11'),
(1016, 'Hairoglobe lotion', 'Lotion', '33 EGP', '2017-05-03'),
(1017, 'Hair stabil', 'Shampoo', '13 EGP', '2017-05-17'),
(1018, 'Hopforhep', 'Tablets', '25 EGP', '2017-05-22'),
(1019, 'Hexgabalin', 'Capsules', '33 EGP', '2017-05-10'),
(1020, 'Kerella Lotion', 'Lotion', '19 EGP', '2017-05-11'),
(1021, 'Kerella Ointment', 'Ointment', '27 EGP', '2017-05-12'),
(1022, 'Mesulid', 'Tablets/Suppositories', '55 EGP', '2017-05-10'),
(1023, 'Metacardia MR', 'Tablets', '24 EGP', '2017-05-24'),
(1024, 'Morlimin', 'Tablets', '19 EGP', '2017-05-12'),
(1025, 'Napizole Lyoph Vial', 'Vials ', '51 EGP', '0000-00-00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
