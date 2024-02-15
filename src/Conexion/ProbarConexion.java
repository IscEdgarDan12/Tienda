package Conexion;
import java.sql.*;
public class ProbarConexion {
    public static void main(String[] args) {
        NuevaConexion cc = new NuevaConexion();
        Connection cn =cc.conexion();   
        if (cn==null) {
            System.out.println("no conectado");
        }else{
            System.out.println("conectado ");
        }
    }
}
