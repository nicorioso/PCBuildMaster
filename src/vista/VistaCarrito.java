package vista;

import modelo.Producto;
import java.util.List;
import modelo.Conexion;
import java.util.Scanner;

public class VistaCarrito {

    public List<Producto> items;

    public int VistaCarrito() {
        System.out.println("-------------------------------------");
        System.out.println("Carrito de Productos");
        System.out.println("0. salir");
        System.out.println("1. Ingresar productos");
        System.out.println("2. Ver productos");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese una opcion: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }

    public int subVistaCarrito() {
        System.out.println("-------------------------------------");
        System.out.println("0. salir");
        System.out.println("1. Ingresar productos");
        System.out.println("2. Ver productos");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese una opcion: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }

    public int InsertarProductos() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el id de un producto");
        int producto = lectura.nextInt();
        System.out.println("-------------------------------------");
        return producto;
    }

    public void MostrarProductosCarrito(List<Producto> productos) {
        short cont = 1;
        for (Producto producto : productos) {
            System.out.println(cont + ". " + producto.getNombre());
            cont++;
        }
    }
}
