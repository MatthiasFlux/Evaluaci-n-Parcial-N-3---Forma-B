/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controlador.ControladorArma;
import vista.VistaArma;
/**
 *
 * @author ddiaz
 */
public class Main {
    public static void main(String args[]) {
        VistaArma vista = new VistaArma();
        ControladorArma controlador = new ControladorArma(vista);
        controlador.inicializar();
    }    
}