
package Modelo;

import java.time.LocalDate;


public class JugadorClub {
    private int idJugador_Club;
    private LocalDate fecha_contrato;
    private int valor_contrato;
    private int num_camiseta;
    private String vigente;
    private int idClub;
    private int idJugador;
    
    public JugadorClub() {
    }

    public JugadorClub(int idJugador_Club, LocalDate fecha_contrato, int valor_contrato, int num_camiseta, String vigente, int idClub, int idJugador) {
        this.idJugador_Club = idJugador_Club;
        this.fecha_contrato = fecha_contrato;
        setValor_contrato(valor_contrato);
        setNum_camiseta(num_camiseta);
        setVigente(vigente);
        this.idClub = idClub;
        this.idJugador = idJugador;       
    }

    public int getIdJugador_Club() {
        return idJugador_Club;
    }

    public void setIdJugador_Club(int idJugador_Club) {
        this.idJugador_Club = idJugador_Club;
    }

    public LocalDate getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(LocalDate fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public int getValor_contrato() {
        return valor_contrato;
    }

    public void setValor_contrato(int valor_contrato) {
        if (valor_contrato>=100000 && valor_contrato<=65000000) {
            this.valor_contrato = valor_contrato;
        } else {
            throw new
                IllegalArgumentException("valor de contrato entre 100000 a 65000000");
        }
        
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        if (num_camiseta>=1 && num_camiseta<=120) {
            this.num_camiseta = num_camiseta;
        } else {
            throw new
                IllegalArgumentException("num. de camiseta entre 1 a 120");
        }
        
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        if (vigente.equalsIgnoreCase("si") || vigente.equalsIgnoreCase("no")) {
            this.vigente = vigente;
        } else {
            throw new
                IllegalArgumentException("vigente solo puede ser si o no");
        }
        
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }


    @Override
    public String toString() {
        return "JugadorClub{" + "idJugador_Club=" + idJugador_Club + ", fecha_contrato=" + fecha_contrato + ", valor_contrato=" + valor_contrato + ", num_camiseta=" + num_camiseta + ", vigente=" + vigente + ", idClub=" + idClub + ", idJugador=" + idJugador + '}';
    }

    
    
}
