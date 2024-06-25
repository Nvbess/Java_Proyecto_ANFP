
package Controlador;

import Modelo.Club;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class DaoClub {
    private Connection cone;

    public DaoClub() {
        cone= new Conexion().getConexion();
    }
    public boolean agregarClub(Club clu){
        try {
            String sql="insert into club values(?,?,?,?,?,?)";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, clu.getIdClub());
            pstm.setString(2, clu.getNombre());
            pstm.setDate(3,Date.valueOf(clu.getFecha_fundacion()));
            pstm.setString(4, clu.getPresidente());
            pstm.setString(5, clu.getEstadio());
            pstm.setInt(6, clu.getIdEntrenador());
            int af=pstm.executeUpdate();
            return af>0;
        } catch (Exception e) {
            System.out.println("error almacenar club:"+e.getMessage());
            return false;
        }
    }
    public boolean modificarClub(Club nvo_club) {
    try {
        String sql = "UPDATE club SET  presidente=?, entrenador_identrenador=? WHERE idclub=?";
        PreparedStatement pstm = cone.prepareStatement(sql); 
        pstm.setString(1, nvo_club.getPresidente());
        pstm.setInt(2, nvo_club.getIdEntrenador());
        pstm.setInt(3, nvo_club.getIdClub());
        
        int af = pstm.executeUpdate();
        return af > 0;
    } catch (Exception e) {
        System.out.println("error modificar club: " + e.getMessage());
        return false;
    }
}
    public ArrayList<Club> listarClub(){
        try {
            String sql="select * from club";
            ResultSet registros=cone.createStatement().executeQuery(sql);
            ArrayList<Club> lista_club = new ArrayList<>();
            while (registros.next()) {                
                Club clu=new Club();
                clu.setIdClub(registros.getInt("idclub"));
                clu.setNombre(registros.getString("nombre"));
                clu.setFecha_fundacion(registros.getDate("fechafundacion").toLocalDate());
                clu.setPresidente(registros.getString("presidente"));
                clu.setEstadio(registros.getString("estadio"));
                clu.setIdEntrenador(registros.getInt("entrenador_identrenador"));
                lista_club.add(clu);
            }
            return lista_club;
        } catch (Exception e) {
            System.out.println("error listar club:"+e.getMessage());
            return null;
        }
    }
    public Club filtrarNombre(String name){
        try {
            String sql="select * from club where nombre=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setString(1, name);
            ResultSet reg=pstm.executeQuery();
            Club clu=null;
            while (reg.next()) {                
               clu=new Club();
               clu.setIdClub(reg.getInt("idclub"));
               clu.setNombre(reg.getString("nombre"));
               clu.setFecha_fundacion(reg.getDate("fechafundacion").toLocalDate());
               clu.setPresidente(reg.getString("presidente"));
               clu.setEstadio(reg.getString("estadio"));
               clu.setIdEntrenador(reg.getInt("entrenador_identrenador"));
            }
            return clu;
        } catch (Exception e) {
            System.out.println("error filtrar por nombre:"+e.getMessage());
            return null;
        }
    }
    public ArrayList<Club> filtrarFecha(int anio){
        try {
            String sql="select * from club where extract (year from fechafundacion)=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, anio);
            ResultSet reg=pstm.executeQuery();
            ArrayList<Club> lista_club = new ArrayList<>();            
            while (reg.next()) {                
                Club clu=new Club();
                clu.setIdClub(reg.getInt("idclub"));
                clu.setNombre(reg.getString("nombre"));
                clu.setFecha_fundacion(reg.getDate("fechafundacion").toLocalDate());
                clu.setPresidente(reg.getString("presidente"));
                clu.setEstadio(reg.getString("estadio"));
                clu.setIdEntrenador(reg.getInt("entrenador_identrenador"));
                lista_club.add(clu);
            }
            return lista_club;
        } catch (Exception e) {
            System.out.println("Error filtrar por año"+e.getMessage());
            return null;
        }
        
    }
    public Club buscarid(int idclu){
        try {
            String sql="select * from club where idclub=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, idclu);
            ResultSet regi=pstm.executeQuery();
            Club clu=null;
            while (regi.next()) {                
                clu=new Club();
                clu.setIdClub(regi.getInt("idclub"));
                clu.setNombre(regi.getString("nombre"));
                clu.setFecha_fundacion(regi.getDate("fechafundacion").toLocalDate());
                clu.setPresidente(regi.getString("presidente"));
                clu.setEstadio(regi.getString("estadio"));
                clu.setIdEntrenador(regi.getInt("entrenador_identrenador"));
            }
            return clu;
        } catch (Exception e) {
            System.out.println("error buscar id club:"+e.getMessage());
            return null;
        }
    }
}
