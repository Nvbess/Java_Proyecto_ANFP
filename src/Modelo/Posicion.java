
package Modelo;


public class Posicion {
   private int idPosicion;
   private String descripcion;

    public Posicion() {
    }

    public Posicion(int idPosicion, String descripcion) {
        this.idPosicion = idPosicion;
        this.descripcion = descripcion;
    }

    public int getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Posicion{" + "idPosicion=" + idPosicion + ", descripcion=" + descripcion + '}';
    }
   
   
}
