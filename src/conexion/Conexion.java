package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //variable estática que almacena nuestra conexion
    private static Connection conn = null;

    //constructor privado, unica instancia
    private Conexion(){
        String url = "jdbc:mysql://168.138.149.15:3306/Act_escolar";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "proyecto_minimarket";
        String password = "ProyectoMinimarket__//1";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion existosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " +e);
        }
    }

    public static Connection getConnection(){
        if(conn == null){
            new Conexion();
        }
        return conn;
    }

    public void cerrarConexion() throws SQLException{
        if(conn != null){
            conn.close();
        }
    }
}
