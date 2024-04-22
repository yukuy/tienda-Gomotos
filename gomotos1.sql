-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-04-2024 a las 00:01:16
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gomotos1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `documento` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nombre`, `documento`, `telefono`) VALUES
(1, 'jhonny', 444, 12244),
(2, 'juan', 6321654, 325369),
(3, 'eren', 654987, 325654);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE `detalle_factura` (
  `idRepuestos` int(20) NOT NULL,
  `idFactura` int(20) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `sutTotal` double NOT NULL,
  `PrecioU` double NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `detalle_factura`
--

INSERT INTO `detalle_factura` (`idRepuestos`, `idFactura`, `cantidad`, `sutTotal`, `PrecioU`, `nombre`) VALUES
(2, 34, 2, 130000, 65000, 'piston'),
(2, 35, 1, 65000, 65000, 'piston'),
(2, 36, 4, 260000, 65000, 'piston'),
(2, 37, 4, 260000, 65000, 'piston'),
(2, 39, 6, 390000, 65000, 'piston'),
(2, 40, 6, 390000, 65000, 'piston'),
(2, 41, 1, 65000, 65000, 'piston'),
(2, 43, 1, 65000, 65000, 'piston'),
(3, 0, 5, 250000, 50000, 'anillos'),
(3, 30, 47, 3055000, 65000, 'anillos'),
(3, 31, 2, 100000, 50000, 'anillos'),
(3, 33, 2, 100000, 50000, 'anillos'),
(3, 37, 5, 250000, 50000, 'anillos'),
(3, 43, 2, 100000, 50000, 'anillos'),
(4, 32, 2, 20000, 10000, 'cilindro'),
(4, 33, 1, 10000, 10000, 'cilindro'),
(4, 43, 1, 10000, 10000, 'cilindro'),
(5, 31, 3, 600000, 200000, 'culata'),
(5, 32, 2, 400000, 200000, 'culata'),
(5, 33, 1, 200000, 200000, 'culata'),
(6, 0, 2, 160000, 80000, 'carcasas'),
(6, 38, 51, 4080000, 80000, 'carcasas'),
(6, 40, 1, 80000, 80000, 'carcasas'),
(7, 38, 2, 200000, 100000, 'culata'),
(7, 40, 5, 500000, 100000, 'culata');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_repuestos`
--

CREATE TABLE `detalle_repuestos` (
  `idProveedorDetalle` int(11) NOT NULL,
  `idRepuestosDetalle` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fecha` varchar(11) NOT NULL,
  `totalPagar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idFactura`, `idCliente`, `fecha`, `totalPagar`) VALUES
(1, 1, 'Hoy', 0),
(30, 1, '78', 3055000),
(31, 3, 'Abril 8', 700000),
(32, 3, 'abril 9', 420000),
(33, 3, '09 de Abril', 560000),
(34, 2, 'Abril 10', 130000),
(35, 1, '', 65000),
(36, 1, '', 260000),
(37, 1, '', 510000),
(38, 3, 'Abril 10', 4280000),
(39, 1, 'Abril 10', 450000),
(40, 1, 'Abril 10', 1030000),
(41, 1, '', 65000),
(42, 1, '', 0),
(43, 2, 'abril 10', 175000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `documento` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombre`, `documento`, `telefono`) VALUES
(1, 'juan', 444444, 322222),
(2, 'jhonny', 65546, 32244),
(4, 'duban', 3659652, 32432165);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuestos`
--

CREATE TABLE `repuestos` (
  `idRepuestos` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`idRepuestos`, `nombre`, `cantidad`, `tipo`, `precio`) VALUES
(2, 'piston', 65, 'original', 65000),
(3, 'anillos', 90, 'original', 50000),
(4, 'cilindro', 50, 'original', 10000),
(6, 'carcasas', 96, 'generico', 80000),
(7, 'culata', 68, 'original', 100000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD UNIQUE KEY `idRepuestos` (`idRepuestos`,`idFactura`);

--
-- Indices de la tabla `detalle_repuestos`
--
ALTER TABLE `detalle_repuestos`
  ADD PRIMARY KEY (`idProveedorDetalle`,`idRepuestosDetalle`),
  ADD KEY `fk_Proveedor_has_Repuestos_Repuestos1_idx` (`idRepuestosDetalle`),
  ADD KEY `fk_Proveedor_has_Repuestos_Proveedor1_idx` (`idProveedorDetalle`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `fk_Factura_Cliente1_idx` (`idCliente`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD PRIMARY KEY (`idRepuestos`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idFactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `repuestos`
--
ALTER TABLE `repuestos`
  MODIFY `idRepuestos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_repuestos`
--
ALTER TABLE `detalle_repuestos`
  ADD CONSTRAINT `fk_Proveedor_has_Repuestos_Proveedor1` FOREIGN KEY (`idProveedorDetalle`) REFERENCES `proveedor` (`idProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Proveedor_has_Repuestos_Repuestos1` FOREIGN KEY (`idRepuestosDetalle`) REFERENCES `repuestos` (`idRepuestos`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `fk_Factura_Cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
