-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2021 a las 14:12:23
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nuwe_cash`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `data`
--

CREATE TABLE `data` (
  `name` int(11) NOT NULL,
  `nameuuid` varchar(25) COLLATE latin1_spanish_ci NOT NULL,
  `total_users` int(11) NOT NULL,
  `total_new_users` int(11) NOT NULL,
  `total_unique_users` int(11) NOT NULL,
  `total_requested_money` double NOT NULL,
  `accepted_requests_paid` int(11) NOT NULL,
  `accepted_requests_unpaid` int(11) NOT NULL,
  `loan_return_time` time NOT NULL,
  `real_budget` double NOT NULL,
  `predicted_budget` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `data`
--

INSERT INTO `data` (`name`, `nameuuid`, `total_users`, `total_new_users`, `total_unique_users`, `total_requested_money`, `accepted_requests_paid`, `accepted_requests_unpaid`, `loan_return_time`, `real_budget`, `predicted_budget`) VALUES
(202001, '01-2020', 300, 30, 500, 4000, 400, 600, '16:46:28', 25000, 25500),
(202002, '02-2020', 400, 50, 600, 5000, 500, 550, '17:46:28', 26000, 26500),
(202003, '03-2020', 300, 30, 500, 4000, 400, 600, '18:46:28', 25000, 25500),
(202004, '04-2020', 400, 50, 600, 5000, 500, 550, '19:46:28', 26000, 26500),
(202005, '05-2020', 300, 30, 500, 4000, 400, 600, '20:46:28', 25000, 25500),
(202006, '06-2020', 400, 50, 600, 5000, 500, 550, '21:46:28', 26000, 26500),
(202007, '07-2020', 300, 30, 500, 4000, 400, 600, '22:46:28', 25000, 25500),
(202008, '08-2020', 400, 50, 600, 5000, 500, 550, '23:46:28', 26000, 26500),
(202009, '09-2020', 400, 50, 600, 5000, 500, 550, '00:46:28', 26000, 26500),
(201911, '11-2019', 300, 30, 500, 4000, 400, 600, '16:46:28', 25000, 25500),
(201912, '12-2019', 300, 30, 500, 4000, 400, 600, '16:46:28', 25000, 25500);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`nameuuid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*LOAD DATA INFILE 'Data.csv' INTO TABLE data
FIELDS TERMINATED by ',';*/