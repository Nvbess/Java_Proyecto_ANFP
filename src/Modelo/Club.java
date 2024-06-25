
package Modelo;

import java.time.LocalDate;



public class Club {
    private int idClub;
    private String nombre;
    private LocalDate fecha_fundacion;
    private String presidente;
    private String estadio;
    private int idEntrenador;

    public Club() {
    }

    public Club(int idClub, String nombre, LocalDate fecha_fundacion, String presidente, String estadio, int idEntrenador) {
        this.idClub = idClub;
        this.nombre = nombre;
        setFecha_fundacion(fecha_fundacion);
        this.presidente = presidente;
        this.estadio = estadio;
        this.idEntrenador = idEntrenador;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(LocalDate fecha_fundacion) {
        LocalDate fecha_actual=LocalDate.now();
        if (fecha_fundacion.isBefore(fecha_actual)) {
            this.fecha_fundacion = fecha_fundacion;
        } else {
            throw new
                IllegalArgumentException("fecha de fundacion no puede ser despues de fecha actual");
        }
        
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    @Override
    public String toString() {
        return "Club{" + "idClub=" + idClub + ", nombre=" + nombre + ", fecha_fundacion=" + fecha_fundacion + ", presidente=" + presidente + ", estadio=" + estadio + ", idEntrenador=" + idEntrenador + '}';
    }
    
    
}
