package modelo;

import java.util.ArrayList;

/**
 * @author David
 * @version 1.0
 * @created 23-abr.-2018 9:23:25 a. m.
 */
public abstract class Contaminante {

    private String fecha;
    private String nombre;
    private ArrayList<PuntoContaminante> puntosContaminante;

    public Contaminante() {}

    public int puntoAlgido() {
        return 0;
    }

    public int puntoMinimo() {
        return 0;
    }

    public Contaminante(String fecha, String nombre, ArrayList<PuntoContaminante> puntosContaminante) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.puntosContaminante = puntosContaminante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<PuntoContaminante> getPuntosContaminante() {
        return puntosContaminante;
    }

    public void setPuntosContaminante(ArrayList<PuntoContaminante> puntosContaminante) {
        this.puntosContaminante = puntosContaminante;
    }

}
