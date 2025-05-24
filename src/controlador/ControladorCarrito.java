package controlador;
import java.io.IOException;
import modelo.Carrito;
import modelo.ProductoDAO;
import modelo.Producto;
import vista.VistaCarrito;

public class ControladorCarrito {

    private VistaCarrito vista;
    private Carrito carrito;

    public ControladorCarrito(VistaCarrito vista, Carrito carrito) {
        this.vista = vista;
        this.carrito = carrito;
    }

    public int cargarCarrito() {
        return vista.VistaCarrito();
    }

    public int cargarSubCarrito() {
        return vista.subVistaCarrito();
    }

    public void insertarProducto() {
        int opcion = cargarCarrito();
        do {
            switch (opcion) {
                case 1:
                    carrito.agregarProducto(vista.InsertarProductos());
                    break;
                case 2:
                    for (Producto p : carrito.getProductos()) {
                        System.out.println("ID: " + p.getId() + " - " + p.getNombre());
                    }
                    break;
            }
            opcion = cargarSubCarrito();
        }while (opcion != 0);
    }

}
