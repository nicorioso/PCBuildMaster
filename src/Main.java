import modelo.ProductoDAO;
import vista.VistaProductos;
import controlador.ControladorProducto;

public class Main {
    public static void main(String[] args) {
        ProductoDAO modelo = new ProductoDAO();
        VistaProductos vista = new VistaProductos();
        ControladorProducto controlador = new ControladorProducto(modelo, vista);

        controlador.mostrarProductosEnVista();
    }
}