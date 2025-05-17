package vista;

import modelo.Producto;
import java.util.List;

public class VistaProductos {
    public void mostrarProductos(List<Producto> productos) {
        for (Producto p : productos) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Categoría: " + p.getCategoria());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Stock: " + p.getStock() + " unidades");
            System.out.println("-------------------------------------");
        }
    }
}
