package controlador;

import modelo.ProductoInsert;
import vista.VistaInsProductos;

public class ControladorInsProducto {
    private final VistaInsProductos vistaInsProductos;
    private final ProductoInsert productoInsert;

    public ControladorInsProducto(VistaInsProductos vistaInsProductos, ProductoInsert productoInsert) {
        this.vistaInsProductos = vistaInsProductos;
        this.productoInsert = productoInsert;
    }

    public void mostrarInsertarProducto() {
        productoInsert.insertarProducto(vistaInsProductos.mostarInsertar());
    }

}
