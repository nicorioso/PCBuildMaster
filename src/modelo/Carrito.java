package modelo;
import java.util.*;
import modelo.Producto;

public class Carrito {
    private List<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
