package modelo;

/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:32 a. m.
 */
public class Estacion {

    private int coordenadaX;
    private int coordenadaY;
    private String nombreEstacion;

    public Estacion() {

    }

    public Estacion(int coordenadaX, int coordenadaY, String nombreEstacion) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.nombreEstacion = nombreEstacion;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

}
