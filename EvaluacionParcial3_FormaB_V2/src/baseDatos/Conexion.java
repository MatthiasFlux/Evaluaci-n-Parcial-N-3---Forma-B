/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ddiaz
 */
public class Conexion {
    
    private static String jdbc;
    private static String driverClass;
    private static String host;
    private static String port;
    private static String database;
    private static String opciones;
    private static String url;
    private static String username;
    private static String password;

    private static Connection conexion;

    public static Connection open() throws java.lang.ClassNotFoundException,
            java.lang.InstantiationException, java.lang.IllegalAccessException,
            java.sql.SQLException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        jdbc = IDatabase.JDBC;
        driverClass = IDatabase.DRIVER;
        host = IDatabase.HOST;
        port = IDatabase.PORT;
        database = IDatabase.DATABASE;
        opciones = IDatabase.OPCIONES;
        url = jdbc + host + ":" + port + "/" + database + opciones;
        username = IDatabase.USERNAME;
        password = IDatabase.PASSWORD;
        Class.forName(driverClass).getDeclaredConstructor().newInstance();
        conexion = DriverManager.getConnection(url, username, password);
        return conexion;
    }

    public static void close() throws SQLException {
        conexion.close();
    }
}

