/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Arma;
import vista.VistaArma;
import vista.VistaMensaje;

/**
 *
 * @author ddiaz
 */
public class ControladorArma {
    private final VistaArma vista;
    private Arma modelo = new Arma();

    public ControladorArma(VistaArma vista) {
        this.vista = vista;
    }

    private void agregarRegistro() {
        try {
            /* Obtiene los valores desde la vista */
            String nombre = this.vista.getTxtNombre().getText();
            double precision = Double.parseDouble(this.vista.getTxtPrecision().getText());
            
            if (0 <= precision && precision <= 1){
                this.modelo = new Arma(nombre, precision);
                this.modelo.agregar();
                VistaMensaje.verMensajeInfo(null, "Arma agregada con exito!");
                this.verRegistros();
                
            } else {
                JOptionPane.showInternalMessageDialog(null, "Debe ser un numero mayor a 0 y menor o igual a 1");
            }
            
            
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorArma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorArma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inicializar() {
        /* Setea las acciones de los botones */
        this.vista.getBtnEliminar().addActionListener(e -> limpiarFormulario());
        this.vista.getBtnAgregar().addActionListener(e -> agregarRegistro());
        this.vista.getBtnVerRegistro().addActionListener(e -> verRegistros());
        
        this.vista.setVisible(true);
    }

    private void limpiarFormulario() {
        this.vista.getTxtPrecision().setText("0");
        this.vista.getTxtNombre().setText("");
        this.vista.getTxtNombre().requestFocus();
    }

    public void verRegistros() {
        try {
            /* Solicita a la vista mostrat el contenido de la colección */
            this.vista.verRegistros(this.modelo.leer());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorArma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorArma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}