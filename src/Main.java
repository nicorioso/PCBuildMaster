import modelo.*;
import vista.*;
import controlador.*;

public class Main {
    public static void main(String[] args) {
        /*ProductoDAO modelo = new ProductoDAO();
        VistaProductos vista = new VistaProductos();
        ControladorProducto controlador = new ControladorProducto(modelo, vista);

        controlador.mostrarProductosEnVista();*/

        VistaMenu vista = new VistaMenu();
        ControladorMenu menu = new ControladorMenu(vista);

        menu.MostrarMenu();

    }
}