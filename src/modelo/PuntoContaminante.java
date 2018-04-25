package modelo;


/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:22 a. m.
 */
public class PuntoContaminante {

	private int coordenadaX;
	private int coordenaday;
	private Estacion estacion;
	private String fecha;
	private int intensidadContaminante;
	private String tiempoRegistro;
	private TipoContaminante tipoContaminante;

	public PuntoContaminante(){

	}

    public PuntoContaminante(int coordenadaX, int coordenaday, Estacion estacion, String fecha, int intensidadContaminante, String tiempoRegistro, TipoContaminante tipoContaminante) {
        this.coordenadaX = coordenadaX;
        this.coordenaday = coordenaday;
        this.estacion = estacion;
        this.fecha = fecha;
        this.intensidadContaminante = intensidadContaminante;
        this.tiempoRegistro = tiempoRegistro;
        this.tipoContaminante = tipoContaminante;
    }
    
    
}