
package Controlador;

import Modelo.Posicion;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoPosicion {
    private Connection cone;

    public DaoPosicion() {
        cone=new Conexion().getConexion();
    }
    public ArrayList<Posicion> listar(){
        try {
            String sql = "SELECT * FROM POSICION";
            ResultSet reg = cone.createStatement().executeQuery(sql);
            ArrayList<Posicion> lista_pos = new ArrayList<>();
            while (reg.next()) {
                Posicion pos = new Posicion();
                pos.setIdPosicion(reg.getInt("IDPOSICION"));
                pos.setDescripcion(reg.getString("DESCRIPCION"));
                lista_pos.add(pos);
            }
            return lista_pos;
        } catch (Exception e) {
            System.out.println("Error al listar posiciones : "+e.getMessage());
            return null;
        }
    }

    public ArrayList<Posicion> buscar(String nombre){
        ArrayList<Posicion> lista_pos = new ArrayList<>();
        for (Posicion pos : lista_pos) {
            if (pos.getDescripcion().equalsIgnoreCase(nombre)) {
                lista_pos.add(pos);
            }
        }
        return lista_pos;
    }
    public Posicion filtrarposicion(int idposi){
        try {
            String sql="select * from posicion where idposicion=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, idposi);
            ResultSet regi=pstm.executeQuery();
            Posicion posi=null;
            while (regi.next()) {                
                posi=new Posicion();
                posi.setIdPosicion(regi.getInt("IDPOSICION"));
                posi.setDescripcion(regi.getString("DESCRIPCION"));
            }
            return posi;
        } catch (Exception e) {
            System.out.println("error filtrar posicion:"+e.getMessage());
            return null;
        }
    }
}
