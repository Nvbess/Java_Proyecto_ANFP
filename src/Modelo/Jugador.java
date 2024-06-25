
package Modelo;


public class Jugador {
    private int idJugador;
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int idPosicion;
    private int valorus;

    public Jugador() {
    }

    public Jugador(int idJugador, String nombre, int edad, String nacionalidad, int idPosicion, int valorus) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        setEdad(edad);
        this.nacionalidad = nacionalidad;
        this.idPosicion = idPosicion;
        setValorus(valorus);
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=15 && edad<=42) {
           this.edad = edad; 
        } else {
            throw new
                IllegalArgumentException("edad entre 15 a 42");
        }
        
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

    public int getValorus() {
        return valorus;
    }

    public void setValorus(int valorus) {
        if (valorus>65000) {
           this.valorus = valorus; 
        } else {
            throw new
                IllegalArgumentException("valor superior a $65000");
        }
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", idPosicion=" + idPosicion + ", valorus=" + valorus + '}';
    }
    
    
}
