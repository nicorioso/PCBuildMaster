package controlador;

import modelo.ProductoDAO;
import vista.VistaProductos;

public class ControladorProducto {
    private final ProductoDAO modelo;
    private final VistaProductos vista;

    public ControladorProducto(ProductoDAO modelo, VistaProductos vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarProductosEnVista() {
        vista.mostrarProductos(modelo.obtenerTodosLosProductos());
    }
}

