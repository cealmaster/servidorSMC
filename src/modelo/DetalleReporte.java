package modelo;

/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:27 a. m.
 */
public class DetalleReporte {

    private String descripcionDetalle;
    private String nombreDetalle;

    public DetalleReporte() {

    }

    public DetalleReporte(String descripcionDetalle, String nombreDetalle) {
        this.descripcionDetalle = descripcionDetalle;
        this.nombreDetalle = nombreDetalle;
    }

    public String getDescripcionDetalle() {
        return descripcionDetalle;
    }

    public void setDescripcionDetalle(String descripcionDetalle) {
        this.descripcionDetalle = descripcionDetalle;
    }

    public String getNombreDetalle() {
        return nombreDetalle;
    }

    public void setNombreDetalle(String nombreDetalle) {
        this.nombreDetalle = nombreDetalle;
    }

}
