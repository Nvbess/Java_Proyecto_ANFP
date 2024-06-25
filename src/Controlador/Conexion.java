
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static Connection cone;

    public Conexion() {
        try {
            if (cone==null) {
            Class.forName("oracle.jdbc.OracleDriver");
            String user="anfp";
            String password="anfp";
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            cone=DriverManager.getConnection(url,user,password);
        }
        } catch (Exception e) {
            System.out.println("error de conexion:"+e.getMessage());
        }
        
    }
    public Connection getConexion(){
        return cone;
    }
}
