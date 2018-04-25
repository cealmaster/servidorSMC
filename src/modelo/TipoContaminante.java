package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author v_ani
 * @version 1.0
 * @created 23-abr.-2018 9:23:29 a. m.
 */
public class TipoContaminante {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private String tipoContaminante;

    public TipoContaminante() {

    }

    public TipoContaminante(String tipoContaminante) {
        this.tipoContaminante = tipoContaminante;
    }

    public String getTipoContaminante() {
        return tipoContaminante;
    }

    public void setTipoContaminante(String tipoContaminante) {
        this.tipoContaminante = tipoContaminante;
    }
    public ArrayList<TipoContaminante> ListarTodosUsuarios(){
        ArrayList<TipoContaminante> misTipos = new ArrayList<TipoContaminante>();
        String consulta = "select * from usuario";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                TipoContaminante tipo = new TipoContaminante();
                tipo.setTipoContaminante(rs.getString("nombretipocontaminante"));
                misTipos.add(tipo);
               
                
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return misTipos;
    }
}
