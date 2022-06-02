/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import javax.swing.JOptionPane;

/**
 *
 * @author mono-
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche objCoche = new Coche();
        objCoche.setMarca(JOptionPane.showInputDialog("Ingrese marca"));
        objCoche.setModelo(JOptionPane.showInputDialog("Ingrese modelo"));
        objCoche.setColor(JOptionPane.showInputDialog("Ingrese color"));
        objCoche.setMatricula(JOptionPane.showInputDialog("Ingrese matricula"));
        objCoche.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio")));
        JOptionPane.showMessageDialog(null, objCoche.toString() + Coche.calcularPrecio(objCoche.getPrecio())
                + "El descuento es: $" + Coche.descuento);
    }
}
