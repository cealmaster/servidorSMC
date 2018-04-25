/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JFileChooser;

public class Conexion {
    Properties propiedades= new Properties();
    private static String URLBD;
    private static String usuario;
    private static String contrasena;

    public Conexion() {
        Properties misPropiedades = new Properties();
        misPropiedades = cargar();
    }

    private File f;

    public Properties cargar() {
        try {
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
            fc.showOpenDialog(fc);
            f = fc.getSelectedFile();
            FileInputStream archivo = new FileInputStream(f);
            Properties propiedades = new Properties();
            propiedades.load(archivo);
            archivo.close();
            if (!propiedades.isEmpty()) {
                URLBD = propiedades.getProperty("url");
                usuario = propiedades.getProperty("usuario");
                contrasena = propiedades.getProperty("contrasena");
                return propiedades;
            }
        } catch (HeadlessException e) {
            System.out.println("No se pudo cargar el archivo properties");
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo properties");
        }
        return null;
    }

    private static Connection cn = null;

    public static Connection getConexion() throws SQLException {
        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
               System.out.println(URLBD+usuario+contrasena);
            cn = DriverManager.getConnection(URLBD, usuario, contrasena);
            boolean valid = cn.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
        return cn;
    }

    public static void desconectar() {
        cn = null;
    }

}
