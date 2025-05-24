package modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.*;
import modelo.Producto;

public class Carrito {
    private List<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(int id) {
        productos.add(buscarProducto(id));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    private Producto buscarProducto(int id) {
        Producto producto = null;

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos WHERE id = ?")) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                producto = new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getString("marca"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return producto;
    }
}
