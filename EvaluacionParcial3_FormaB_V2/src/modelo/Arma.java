/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ddiaz
 */
import dao.ArmaDAOImpl;
import java.util.ArrayList;

public class Arma {
    
    // Atributos
    private int id;
    private String nombre;
    private double precision;

    //Constructor vacio
    public Arma() {
    }

    //ConstructorES completoS
    public Arma(int id, String nombre, double precision) {
        this.id = id;
        this.nombre = nombre;
        this.precision = precision; 
    }

    public Arma(String nombre, double precision) {
        this.nombre = nombre;
        this.precision = precision;
    }
    
    public Arma(int id) {
        this.id = id;        
    }

    //Gett y sett
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }
    
    //Metodos
    public void agregar() throws Exception {
        ArmaDAOImpl dao = new ArmaDAOImpl();
        dao.create(this); // Se pasa a sí mismo para guardarse
    }
    
    public ArrayList<Arma> leer() throws Exception {
        ArmaDAOImpl dao = new ArmaDAOImpl();
        return dao.read(); // Recupera la lista de la BD
    }
}