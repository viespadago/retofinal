-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2021 a las 18:18:03
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
(202001, '01-2020', 300, 90, 176, 21587, 50, 36, '101:09:00', 21587, 21587),
(202002, '02-2020', 400, 84, 157, 16653, 61, 39, '43:12:00', 16653, 16653),
(202003, '03-2020', 300, 69, 207, 23549, 69, 1, '36:22:00', 23549, 23549),
(202004, '04-2020', 400, 212, 418, 46093, 68, 1, '33:05:00', 46093, 46093),
(202005, '05-2020', 300, 369, 727, 79236, 73, 0, '32:20:00', 79236, 79236),
(202006, '06-2020', 400, 1338, 2251, 246026, 63, 10, '35:01:00', 246026, 246026),
(202007, '07-2020', 300, 1294, 3159, 328187, 56, 64, '34:14:00', 328187, 328187),
(202008, '08-2020', 400, 656, 3090, 287633, 59, 67, '38:20:00', 287633, 287633),
(202009, '09-2020', 109, 1712, 3802, 336507, 66, 109, '37:19:00', 336507, 336507),
(202010, '10-2020', 0, 0, 0, 0, 0, 0, '00:00:00', 0, 466924),
(201911, '11-2019', 142, 1, 1, 1, 0, 0, '00:00:00', 1, 1),
(201912, '12-2019', 142, 205, 230, 27297, 62, 142, '156:22:00', 27297, 27297);

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
