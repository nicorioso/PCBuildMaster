package controlador;

import controlador.*;
import vista.*;
import modelo.ProductoDAO;

public class ControladorMenu {

    private final VistaMenu vista;
    private boolean cont;

    public ControladorMenu(VistaMenu vista) {
        this.vista = vista;
        cont = true;
    }

    public void MostrarMenu() {
        vista.mostrarMenu();
        do {
            int opcion = vista.mostrarSubMenu();
            switch (opcion) {
                case 0:
                    cont = false;
                    break;
                case 1:
                    ProductoDAO modelo = new ProductoDAO();
                    VistaProductos vista = new VistaProductos();
                    ControladorProducto control = new ControladorProducto(modelo, vista);
                    control.mostrarProductosEnVista();
                    break;
                default:
                    System.out.println("ingrese un numero valido");
                    break;
            }
        }while (cont);
    }
}
