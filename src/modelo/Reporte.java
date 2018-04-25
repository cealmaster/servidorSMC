package modelo;

import java.util.ArrayList;

/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:28 a. m.
 */
public class Reporte {

    private ArrayList<DetalleReporte> detallesReporte;

    public Reporte() {

    }

    public Reporte(ArrayList<DetalleReporte> detallesReporte) {
        this.detallesReporte = detallesReporte;
    }

    public ArrayList<DetalleReporte> getDetallesReporte() {
        return detallesReporte;
    }

    public void setDetallesReporte(ArrayList<DetalleReporte> detallesReporte) {
        this.detallesReporte = detallesReporte;
    }

}
