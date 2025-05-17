package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //private static final String URL = "jdbc:sqlite:D:/proyectos/javaWeb/DBsuperBuildMaster/DBsuperBuildMaster.db";
    private static final String URL = "jdbc:sqlite:C:/Users/Admin/Desktop/SENA/java/DBpcbuildMaster/DBsuperBuildMaster.db";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}
