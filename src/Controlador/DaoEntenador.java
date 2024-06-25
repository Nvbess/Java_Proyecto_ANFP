
package Controlador;

import Modelo.Entrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;


public class DaoEntenador {
   private Connection cone;

    public DaoEntenador() {
        cone = new Conexion().getConexion();
    }
   public boolean agregarEntenador(Entrenador ent){
       try {
           String sql="insert into entrenador values(?,?,?,?,?)";
           PreparedStatement pstm = cone.prepareCall(sql);
           pstm.setInt(1, ent.getIdEntrenador());
           pstm.setString(2, ent.getRundni());
           pstm.setString(3, ent.getNombre());
           pstm.setInt(4, ent.getEdad());
           pstm.setString(5, ent.getNacionalidad());
           int af=pstm.executeUpdate();
           return af>0;
       } catch (Exception e) {
           System.out.println("error ingresar entrenador:"+e.getMessage());
           return false;
       }
   }
   public boolean modificarEntrenador(Entrenador nvo_entrenador){
       try {
           String sql="update entrenador set  edad=?"
                   +"where identrenador=?";
           PreparedStatement pstm = cone.prepareCall(sql);
           pstm.setInt(1, nvo_entrenador.getEdad());           
           pstm.setInt(2, nvo_entrenador.getIdEntrenador());
           int af=pstm.executeUpdate();
           return af>0;
       } catch (Exception e) {
           System.out.println("error modificar entrenador:"+e.getMessage());
           return false;
       }
   }
   
   public ArrayList<Entrenador> listarEntrenador(){
       try {
           String sql="select * from entrenador";
           ResultSet registros=cone.createStatement().executeQuery(sql);
           ArrayList<Entrenador> lista_entrenador = new ArrayList<>();
           while (registros.next()) {               
               Entrenador ent=new Entrenador();
               ent.setIdEntrenador(registros.getInt("identrenador"));
               ent.setRundni(registros.getString("run_dni"));
               ent.setNombre(registros.getString("nombre"));
               ent.setEdad(registros.getInt("edad"));
               ent.setNacionalidad(registros.getString("nacionalidad"));
               lista_entrenador.add(ent);
           }
           return lista_entrenador;
       } catch (Exception e) {
           System.out.println("error listar entrenadores:"+e.getMessage());
           return null;
       }
   }
   public ArrayList<Entrenador> listarEntrenadorrango(int edadminima, int edadmaxima) {
    try {
        String sql = "select * from entrenador where edad between ? and ?";
        PreparedStatement pstm = cone.prepareStatement(sql);
        pstm.setInt(1, edadminima);
        pstm.setInt(2, edadmaxima);
        ResultSet registros = pstm.executeQuery(); 

        ArrayList<Entrenador> lista_entrenador = new ArrayList<>();
        while (registros.next()) {               
            Entrenador ent = new Entrenador();
            ent.setIdEntrenador(registros.getInt("identrenador"));
            ent.setRundni(registros.getString("run_dni"));
            ent.setNombre(registros.getString("nombre"));
            ent.setEdad(registros.getInt("edad"));
            ent.setNacionalidad(registros.getString("nacionalidad"));
            lista_entrenador.add(ent);
        }
        return lista_entrenador;
    } catch (Exception e) {
        System.out.println("Error al listar entrenadores por rango de edad: " + e.getMessage());
        return null;
    }
}
   public Entrenador filtrarid(int ident){
       try {
           String sql="select * from entrenador where identrenador=?";
           PreparedStatement pstm=cone.prepareCall(sql);
           pstm.setInt(1, ident);
           ResultSet registros=pstm.executeQuery();
           Entrenador ent=null;
           while (registros.next()) {
               ent = new Entrenador();
               ent.setIdEntrenador(registros.getInt("identrenador"));
               ent.setRundni(registros.getString("run_dni"));
               ent.setNombre(registros.getString("nombre"));
               ent.setEdad(registros.getInt("edad"));
               ent.setNacionalidad(registros.getString("nacionalidad"));
           }
           return ent;
       } catch (Exception e) {
           System.out.println("error filtrar ent por id:"+e.getMessage());
           return null;
       }
   }
   
}
