/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  ddiaz
 * Created: 24-11-2025
 */
DROP DATABASE IF EXISTS dsyapp;
CREATE DATABASE dsyapp;
USE dsyapp;

CREATE TABLE arma (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    precision_arma DECIMAL(4, 2) NOT NULL,
    PRIMARY KEY (id)
);
-- Profe, estos son de prueba, estaran predeterminados en la BD.

INSERT INTO arma (nombre, precision_arma) VALUES ('Arco Largo', 0.85);
INSERT INTO arma (nombre, precision_arma) VALUES ('Daga', 0.40);
