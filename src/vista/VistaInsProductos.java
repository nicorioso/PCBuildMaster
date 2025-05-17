package vista;

import java.util.Scanner;
import java.util.*;

public class VistaInsProductos {
    public static Map<String, Object> mostarInsertar() {
        Map<String, Object> datos = new HashMap<>();
        System.out.println("-------------------------------------");
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        datos.put("nombre", lectura.nextLine());
        System.out.print("Ingrese la categoria: ");
        datos.put("categoria", lectura.nextLine());
        System.out.print("Ingrese la marca: ");
        datos.put("marca", lectura.nextLine());
        System.out.print("Ingrese el precio: ");
        datos.put("precio", lectura.nextDouble());
        System.out.print("Ingrese el stock: ");
        datos.put("stock", lectura.nextInt());
        System.out.println("-------------------------------------");
        return datos;
    }
}
