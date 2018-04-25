/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class Consultas {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private ResultSet ru;
    private Connection co;
    private Statement s;
    private ResultSet r;
    
    public void queryUpdate(String query) {
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            st.executeUpdate(query);
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }
    
    public void consultarTipos (){
        String consulta = "SELECT * FROM tipocontaminacion";
        
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);

                if (rs.next() ){
                    System.out.println(rs.getInt("idtipocontaminacion")); 
                    System.out.println(rs.getInt("nombretipocontaminacion"));
                }
            st.close();
           Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
    }
    public void insertarDatos(String nombreTipo) {
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            String insercion = "INSERT INTO tipocontaminacion (nombretipocontaminacion) VALUES('" + nombreTipo + "')";
            st.executeUpdate(insercion);
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }
    public void eliminarTipo(int id){
        String eliminacion = "DELETE FROM tipocontaminacion WHERE idtipocontaminacion="+id;
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            st.executeUpdate(eliminacion);
            st.close();
            Conexion.desconectar();
            System.out.println("el registro "+id+" ha sido elimindado");
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la eliminacion");
        }
    }
        public void modificarTipo(int id, String nombreModificado) {

        String modificacion = "UPDATE tipocontaminacion SET nombretipocontaminacion='"+nombreModificado+"' WHERE id="+id;
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            st.executeUpdate(modificacion);
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la modificacion");
        }
    }
    
    
}
