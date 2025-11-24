/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package baseDatos;

/**
 *
 * @author ddiaz
 */

public interface IDatabase {
    public String DRIVER = "com.mysql.cj.jdbc.Driver";
    public String HOST = "localhost";
    public String PORT = "3307";
    public String DATABASE = "dsyapp";
    public String OPCIONES = "?charSet=LATIN1";
    public String JDBC = "jdbc:mysql://";
    public String USERNAME = "root";
    public String PASSWORD = "";
}