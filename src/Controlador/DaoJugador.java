
package Controlador;

import Modelo.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DaoJugador {
    private Connection cone;

    public DaoJugador() {
        cone = new Conexion().getConexion();
    }
    public boolean agregarJugador(Jugador jug){
        try {
            String sql="insert into jugador values(?,?,?,?,?,?)";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, jug.getIdJugador());
            pstm.setString(2, jug.getNombre());
            pstm.setInt(3, jug.getEdad());
            pstm.setString(4, jug.getNacionalidad());
            pstm.setInt(5, jug.getValorus());
            pstm.setInt(6, jug.getIdPosicion());
            int af=pstm.executeUpdate();
            return af>0;
        } catch (Exception e) {
            System.out.println("error ingresar jugador:"+e.getMessage());
            return false;
        }
    }
    public boolean modificarJugador(Jugador nvo_jug){
        try {
            String sql="update jugador set edad=?,valorus=?,posicion_idposicion=?"
                    +"where idjugador=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, nvo_jug.getEdad());
            pstm.setInt(2, nvo_jug.getValorus());
            pstm.setInt(3, nvo_jug.getIdPosicion());
            pstm.setInt(4, nvo_jug.getIdJugador());
            int af=pstm.executeUpdate();
            return af>0;
        } catch (Exception e) {
            System.out.println("error modificar jugador:"+e.getMessage());
            return false;
        }
    }
    public boolean eliminarJugador(int id_jugador){
        try {
            String sql="delete from jugador where idjugador=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, id_jugador);
            int af=pstm.executeUpdate();
            return af>0; 
        } catch (Exception e) {
            System.out.println("error eliminar jugador:"+e.getMessage());
            return false;
        }
    }
    public ArrayList<Jugador> listarJugador(){
        try {
            String sql="select * from jugador";
            ResultSet regi= cone.createStatement().executeQuery(sql);
            ArrayList<Jugador> lista_jug=new ArrayList<>();
            while (regi.next()) {                
                Jugador jug=new Jugador();
                jug.setIdJugador(regi.getInt("idjugador"));
                jug.setNombre(regi.getString("nombre"));
                jug.setEdad(regi.getInt("edad"));
                jug.setNacionalidad(regi.getString("nacionalidad"));
                jug.setValorus(regi.getInt("valorus"));
                jug.setIdPosicion(regi.getInt("posicion_idposicion"));
                lista_jug.add(jug);
            }
            return lista_jug;
        } catch (Exception e) {
            System.out.println("error listar jugador:"+e.getMessage());
            return null;
        }
    }
    public ArrayList<Jugador> listarJugadorposicion(int id_posicion){
        try {
            String sql="select * from jugador where posicion_idposicion=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1,id_posicion );
            ResultSet regi = pstm.executeQuery();
            ArrayList<Jugador> lista_jug=new ArrayList<>();
            while (regi.next()) {                
                Jugador jug=new Jugador();
                jug.setIdJugador(regi.getInt("idjugador"));
                jug.setNombre(regi.getString("nombre"));
                jug.setEdad(regi.getInt("edad"));
                jug.setNacionalidad(regi.getString("nacionalidad"));
                jug.setValorus(regi.getInt("valorus"));
                jug.setIdPosicion(regi.getInt("posicion_idposicion"));
                lista_jug.add(jug);
            }
            return lista_jug;
        } catch (Exception e) {
            System.out.println("error listar jugador por posicion:"+e.getMessage());
            return null;
        }
    }
    public ArrayList<Jugador> listarJugadoresrango(int edadminima,int edadmaxima){
        try {
            String sql="select * from jugador where edad between ? and ?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, edadminima);
            pstm.setInt(2, edadmaxima);
            ResultSet regi=pstm.executeQuery();
            ArrayList<Jugador> lista_jug=new ArrayList<>();
            while (regi.next()) {                
                Jugador jug=new Jugador();
                jug.setIdJugador(regi.getInt("idjugador"));
                jug.setNombre(regi.getString("nombre"));
                jug.setEdad(regi.getInt("edad"));
                jug.setNacionalidad(regi.getString("nacionalidad"));
                jug.setValorus(regi.getInt("valorus"));
                jug.setIdPosicion(regi.getInt("posicion_idposicion"));
                lista_jug.add(jug);
            }
            return lista_jug;
        } catch (Exception e) {
            System.out.println("error listar jugador por rango edad:"+e.getMessage());
            return null;
        }
    }
    public Jugador buscarporNombre(String name){
        try {
            String sql="select * from jugador where nombre=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setString(1, name);
            ResultSet regi=pstm.executeQuery();
            Jugador jug=null;
            while (regi.next()) {                
                jug=new Jugador();
                jug.setIdJugador(regi.getInt("idjugador"));
                jug.setNombre(regi.getString("nombre"));
                jug.setEdad(regi.getInt("edad"));
                jug.setNacionalidad(regi.getString("nacionalidad"));
                jug.setValorus(regi.getInt("valorus"));
                jug.setIdPosicion(regi.getInt("posicion_idposicion"));
            }
            return jug;
        } catch (Exception e) {
            System.out.println("error buscar jugador por nombre:"+e.getMessage());
            return null;
        }
        
    }
    public Jugador buscarporid(int idJug){
        try {
            String sql="select * from jugador where idjugador=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, idJug);
            ResultSet regi=pstm.executeQuery();
            Jugador jug=null;
            while (regi.next()) {                
                jug=new Jugador();
                jug.setIdJugador(regi.getInt("idjugador"));
                jug.setNombre(regi.getString("nombre"));
                jug.setEdad(regi.getInt("edad"));
                jug.setNacionalidad(regi.getString("nacionalidad"));
                jug.setValorus(regi.getInt("valorus"));
                jug.setIdPosicion(regi.getInt("posicion_idposicion"));
            }
            return jug;
        } catch (Exception e) {
            System.out.println("error buscar jugador por nombre:"+e.getMessage());
            return null;
        }
        
    }
}
