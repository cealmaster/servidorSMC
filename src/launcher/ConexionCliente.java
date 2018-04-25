package launcher;

import gestores.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import conexion.*;
/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:14 a. m.
 */
public class ConexionCliente {

    /**
     * puerto para escuchar por medio del servidor
     */
    private final static int port = 5000;
    
    /**
     * peticion entrante del servidor con la cual se escoge el tipo de gestor que respondera a esa peticion 
     */
    
    public Peticion m_Peticion;
    
    /** Para entrada de datos en el socket */
    private DataInputStream dataInput;

    /** Para escritura de datos en el socket */
    private DataOutputStream dataOutput;
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Consultas consulta = new Consultas();
        consulta.insertarDatos("oli");
        ConexionCliente conexionCS = new ConexionCliente();
        conexionCS.conexionServidor();
    }
   
    /**
     * metodo en el cual se genera la conxion al cliente
     */
    public void conexionServidor() {
        FactoryPeticion fc = new FactoryPeticion();
        try {
            ServerSocket socketServidor = new ServerSocket(port);
            while (true) {                
                Socket cliente = socketServidor.accept();
                dataInput = new DataInputStream(cliente.getInputStream());
                dataOutput = new DataOutputStream(cliente.getOutputStream());
            }
        } catch (IOException ex) {
            Logger.getLogger(ConexionCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en el servidor");           
        }
        
    }

    public int get() {
        return port;
    }

}
