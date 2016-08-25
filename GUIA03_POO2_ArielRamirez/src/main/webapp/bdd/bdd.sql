-- --------------------------------------------------------
-- Host:                         gator4227.hostgator.com
-- Versión del servidor:         5.5.48-37.8 - Percona Server (GPL), Release 37.8, Revision 727
-- SO del servidor:              Linux
-- HeidiSQL Versión:             9.1.0.4905
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para rceron_poo
CREATE DATABASE IF NOT EXISTS `rceron_poo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `rceron_poo`;

-- SET PASSWORD FOR 'root'@'localhost' = PASSWORD('123');



-- Volcando estructura para tabla rceron_poo.card_iden
CREATE TABLE IF NOT EXISTS `card_iden` (
  `codi_card` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_card` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `foto_card` longblob,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_card`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.equi_comp
CREATE TABLE IF NOT EXISTS `equi_comp` (
  `codi_equi_comp` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_equi_com` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_luga_acce` bigint(64) DEFAULT NULL,
  `mac_addr_equi_comp` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ip_addr_equi_comp` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_equi_comp`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.gafe_iden
CREATE TABLE IF NOT EXISTS `gafe_iden` (
  `codi_gafe_iden` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_gafe_iden` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nume_tipo_gafe` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_tipo_gafe` bigint(64) DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_gafe_iden`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.luga_acce
CREATE TABLE IF NOT EXISTS `luga_acce` (
  `codi_luga_acce` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_luga_acce` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_luga_acce`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.pers
CREATE TABLE IF NOT EXISTS `pers` (
  `codi_pers` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_pers` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apel_pers` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `foto_pers` longblob,
  `codi_tipo_pers` bigint(64) DEFAULT NULL,
  `gene_pers` char(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_naci_pers` datetime DEFAULT NULL,
  `dui_pers` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nit_pers` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tipo_sang_pers` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_ubic_geog` bigint(64) DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_pers`),
  KEY `fk_pers_tipopers` (`codi_tipo_pers`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.pers_hist
CREATE TABLE IF NOT EXISTS `pers_hist` (
  `codi_pers_hist` bigint(64) NOT NULL AUTO_INCREMENT,
  `codi_pers` bigint(64) DEFAULT NULL,
  `nomb_pers` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `apel_pers` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `foto_pers` longblob,
  `codi_tipo_pers` bigint(64) DEFAULT NULL,
  `codi_ubic_geog` bigint(64) DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_pers_hist`),
  KEY `fk_pershist_pers` (`codi_pers`),
  KEY `fk_pershist_tipopers` (`codi_tipo_pers`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.tipo_docu
CREATE TABLE IF NOT EXISTS `tipo_docu` (
  `codi_tipo_docu` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_tipo_docu` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_tipo_docu`),
  UNIQUE KEY `idx_tipo_docu` (`codi_tipo_docu`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.tipo_gafe
CREATE TABLE IF NOT EXISTS `tipo_gafe` (
  `codi_tipo_gafe` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_tipo_gafe` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_tipo_gafe`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.tipo_pers
CREATE TABLE IF NOT EXISTS `tipo_pers` (
  `codi_tipo_pers` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_tipo_pers` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_tipo_pers`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.ubic_geog
CREATE TABLE IF NOT EXISTS `ubic_geog` (
  `codi_ubic_geog` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_ubic_geog` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_ubic_geog_supe` bigint(64) DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_ubic_geog`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.unid_orga
CREATE TABLE IF NOT EXISTS `unid_orga` (
  `codi_unid_orga` bigint(64) NOT NULL AUTO_INCREMENT,
  `nomb_unid_orga` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sigl_unid_orga` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_unid_orga_supe` bigint(64) DEFAULT NULL,
  `dire_unid_orga` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tele_unid_orga` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fax_unid_orga` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emai_unid_orga` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cont_unid_orga` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `codi_ubic_geog` bigint(64) DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_unid_orga`),
  KEY `fk_unidorga_ubicgeog` (`codi_ubic_geog`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.usua
CREATE TABLE IF NOT EXISTS `usua` (
  `codi_usua` bigint(64) NOT NULL AUTO_INCREMENT,
  `codi_pers` bigint(64) DEFAULT NULL,
  `acce_usua` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cont_usua` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fech_camb_clav_usua` datetime DEFAULT NULL,
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_usua`),
  KEY `fk_usua_pers` (`codi_pers`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla rceron_poo.visi
CREATE TABLE IF NOT EXISTS `visi` (
  `codi_visi` bigint(64) NOT NULL AUTO_INCREMENT COMMENT 'codigo de la visita',
  `codi_usua` bigint(64) DEFAULT NULL COMMENT 'usuario que registra la visita',
  `codi_pers` bigint(64) DEFAULT NULL COMMENT 'persona que hace la visita',
  `codi_pers_visi` bigint(64) DEFAULT NULL COMMENT 'empleado que recibe la visita',
  `codi_unid_orga_visi` bigint(64) DEFAULT NULL COMMENT 'unidad organizativa que recibe la visita',
  `codi_tipo_docu` bigint(64) DEFAULT NULL,
  `codi_gafe` bigint(64) DEFAULT NULL COMMENT 'codigo del gafete que lo identifica',
  `codi_luga_entr` bigint(64) DEFAULT NULL COMMENT 'codigo del lugar de acceso a la visita',
  `codi_luga_sali` bigint(64) DEFAULT NULL COMMENT 'codigo del lugar donde sale la visita',
  `fech_hora_entr_visi` datetime DEFAULT NULL COMMENT 'fecha y hora de la entrada de visita',
  `fech_hora_sali_visi` datetime DEFAULT NULL COMMENT 'fecha y hora de la salida de visita',
  `moti_visi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'motivo de la visita',
  `fech_alta` datetime DEFAULT NULL,
  `fech_baja` datetime DEFAULT NULL,
  `esta` int(1) DEFAULT NULL,
  PRIMARY KEY (`codi_visi`),
  KEY `fk_visi_lugaacce_entr` (`codi_luga_entr`),
  KEY `fk_visi_lugaacce_sali` (`codi_luga_sali`),
  KEY `fk_visi_gafeinden` (`codi_gafe`),
  KEY `fk_visi_unidorga` (`codi_unid_orga_visi`),
  KEY `fk_visi_pershist_usua` (`codi_usua`),
  KEY `fk_visi_pershist_pers` (`codi_pers`),
  KEY `fk_visi_tipodocu` (`codi_tipo_docu`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
