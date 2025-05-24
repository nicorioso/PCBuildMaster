package vista;

import java.util.Scanner;

public class VistaMenu {
    public void mostrarMenu() {
        System.out.println("-------------------------------------");
        System.out.println("Bienvenido a Super Build Master");
        System.out.println("-------------------------------------");
    }
    public int mostrarSubMenu() {
        System.out.println("-------------------------------------");
        System.out.println("0. Cerrar");
        System.out.println("1. Ver Productos");
        System.out.println("2. Insertar Producto");
        System.out.println("3. carrito");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese el numero de lo que desea hacer: ");
        Scanner lectura = new Scanner(System.in);
        int opcion = lectura.nextInt();
        return opcion;
    }
}

