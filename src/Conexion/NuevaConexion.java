package Conexion;
import java.sql.*;
public class NuevaConexion {
    Connection conectar = null;
    public Connection conexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TIENDA;user=sa;password=123");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
            System.out.println("Error en la conexion: " + e);
        }
        return conectar;
    }
}
