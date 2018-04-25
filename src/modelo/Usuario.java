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
 * @created 23-abr.-2018 9:23:30 a. m.
 */
public class Usuario {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private String contrasenaUsuario;
    private String correoUsuario;
    private String nickNameUsuario;
    private String nombreUsuario;
    private ArrayList<Reporte> reporte;

    public Usuario() {}

    public Usuario(String contrasenaUsuario, String correoUsuario, String nickNameUsuario, String nombreUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
        this.correoUsuario = correoUsuario;
        this.nickNameUsuario = nickNameUsuario;
        this.nombreUsuario = nombreUsuario;
    }
    
    public ArrayList<Usuario> ListarTodosUsuarios(){
        ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
        String consulta = "select * from usuario";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                
                usuario.setNombreUsuario(rs.getString("nombreusuario"));
                usuario.setCorreoUsuario(rs.getString("correousuario"));
                usuario.setNickNameUsuario(rs.getString("nicknameusuario"));
                usuario.setContrasenaUsuario(rs.getString("contrasenausuario"));
                misUsuarios.add(usuario);
               
                
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return misUsuarios;
    }
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getNickNameUsuario() {
        return nickNameUsuario;
    }

    public void setNickNameUsuario(String nickNameUsuario) {
        this.nickNameUsuario = nickNameUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public ArrayList<Reporte> getReporte() {
        return reporte;
    }

    public void setReporte(ArrayList<Reporte> reporte) {
        this.reporte = reporte;
    }
}
