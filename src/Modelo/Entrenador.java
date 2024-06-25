
package Modelo;


public class Entrenador {
    private int idEntrenador;
    private String rundni;
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Entrenador() {
    }

    public Entrenador(int idEntrenador, String rundni, String nombre, int edad, String nacionalidad) {
        this.idEntrenador = idEntrenador;
        this.rundni = rundni;
        this.nombre = nombre;
        setEdad(edad);
        this.nacionalidad = nacionalidad;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getRundni() {
        return rundni;
    }

    public void setRundni(String rundni) {
        this.rundni = rundni;
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
        if (edad>25) {
            this.edad = edad;
        } else {
            throw new
                IllegalArgumentException("edad debe ser mayor a 25");
        }
        
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idEntrenador=" + idEntrenador + ", rundni=" + rundni + ", nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}
