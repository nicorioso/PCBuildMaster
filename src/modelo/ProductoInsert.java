package modelo;

import java.sql.*;
import java.util.*;
import java.util.List;
import modelo.Conexion;
import org.sqlite.ExtendedCommand;
import org.sqlite.SQLiteException;

public class ProductoInsert {

//    private String nombre;
//    private String categoria;
//    private String marca;
//    private double precio;
//    private int stock;
//
//    public ProductoInsert(String nombre, String categoria, String marca, double precio, int stock) {
//        this.nombre = nombre;
//        this.categoria = categoria;
//        this.marca = marca;
//        this.precio = precio;
//        this.stock = stock;
//    }

    public void insertarProducto(Map<String, Object> producto) {
        try {
            Connection conn = Conexion.conectar();
            String sql = "INSERT INTO productos(nombre, categoria, marca, precio, stock) values(?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

//            stmt.setString(nombre);
//            stmt.setString(categoria);
//            stmt.setString(marca);
//            stmt.setDouble(precio);
//            stmt.setInt(stock);

            stmt.setString(1, (String) producto.get("nombre"));
            stmt.setString(2, (String) producto.get("categoria"));
            stmt.setString(3, (String) producto.get("marca"));
            stmt.setDouble(4, (double) producto.get("precio"));
            stmt.setInt(5, (int) producto.get("stock"));

            int filasIntertadas = stmt.executeUpdate();

            if (filasIntertadas > 0) {
                System.out.println("-------------------------------------");
                System.out.println("Se inserto correctamente el producto");
                System.out.println("-------------------------------------");
            }else {
                System.out.println("-------------------------------------");
                System.out.println("Error al insertar");
                System.out.println("-------------------------------------");
            }

            stmt.close();
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
