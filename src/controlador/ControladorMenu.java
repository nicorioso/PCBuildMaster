package controlador;

import controlador.*;
import modelo.Carrito;
import modelo.ProductoInsert;
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
                case 2:
                    ProductoInsert modelo2 = new ProductoInsert();
                    VistaInsProductos vista2 = new VistaInsProductos();
                    ControladorInsProducto control2 = new ControladorInsProducto(vista2, modelo2);
                    control2.mostrarInsertarProducto();
                    break;
                case 3:
                    Carrito modelo3 = new Carrito();
                    VistaCarrito vista3 = new VistaCarrito();
                    ControladorCarrito control3 = new ControladorCarrito(vista3, modelo3);
                    control3.insertarProducto();
                default:
                    System.out.println("ingrese un numero valido");
                break;
            }
        }while (cont);
    }
}
