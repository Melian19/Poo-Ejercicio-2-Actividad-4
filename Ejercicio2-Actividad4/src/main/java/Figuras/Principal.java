
package Figuras;

/**
 *
 * @author Laura
 */

public class Principal {
    //Método main que sirve de punto de entrada al programa
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal; //Define la ventana principal
        miVentanaPrincipal = new VentanaPrincipal(); // Crea la ventana principal
        miVentanaPrincipal.setVisible(true); //Establece la ventana como visible
        miVentanaPrincipal.setResizable(false); //Estable que la ventana no se le puede cambiar de tamaño
    }
}
