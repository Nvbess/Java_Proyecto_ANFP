
package Controlador;

import Modelo.JugadorClub;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DaoContrato {
    private Connection cone;

    public DaoContrato() {
        cone = new Conexion().getConexion();
    }
    public boolean agregarContrato(JugadorClub jc){
        try {
            String sql="insert into jugador_club values(?,?,?,?,?,?,?)";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, jc.getIdJugador_Club());
            pstm.setDate(2, Date.valueOf(jc.getFecha_contrato()));
            pstm.setInt(3, jc.getValor_contrato());
            pstm.setInt(4, jc.getNum_camiseta());
            pstm.setString(5, jc.getVigente());
            pstm.setInt(6, jc.getIdJugador());
            pstm.setInt(7, jc.getIdClub());
            int fa=pstm.executeUpdate();
            return fa>0;
        } catch (Exception e) {
            System.out.println("error ingresar contrato:"+e.getMessage());
            return false;
        }
    }
    public boolean modificarContrato(JugadorClub nvo_jc){
        try {
            String sql="update jugador_club set valorcontrato=? ,numerocamiseta=?,vigente=? where idjugadorclub=?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, nvo_jc.getValor_contrato());
            pstm.setInt(2, nvo_jc.getNum_camiseta());
            pstm.setString(3, nvo_jc.getVigente());
            pstm.setInt(4, nvo_jc.getIdJugador_Club());
            int fa=pstm.executeUpdate();
            return fa>0;
        } catch (Exception e) {
            System.out.println("error modificar contrato:"+e.getMessage());
            return false;
        }
    }
    public JugadorClub filtrarcontrato(int idjc){
        try {
            String sql="select * from jugador_club where idjugadorclub = ?";
            PreparedStatement pstm=cone.prepareCall(sql);
            pstm.setInt(1, idjc);
            ResultSet regi=pstm.executeQuery();
            JugadorClub jc=null;
            while (regi.next()) {                
                jc=new JugadorClub();
                jc.setIdJugador_Club(regi.getInt("idjugadorclub"));
                jc.setFecha_contrato(regi.getDate("fechacontrato").toLocalDate());
                jc.setValor_contrato(regi.getInt("valorcontrato"));
                jc.setNum_camiseta(regi.getInt("numerocamiseta"));
                jc.setVigente(regi.getString("vigente"));
                jc.setIdJugador(regi.getInt("jugador_idjugador"));
                jc.setIdClub(regi.getInt("club_idclub"));
            }
            return jc;
        } catch (Exception e) {
            System.out.println("error filtrar contrato:"+e.getMessage());
            return null;
        }
    }
}
