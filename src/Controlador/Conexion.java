/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Conexion {

    private Connection conn = null;
    private String mensaje = "";

    public Connection CrearBD() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:derby:.\\DB\\CENTAUROPOS.DB;create=true");
            if (conn != null) {
                mensaje = "Base de datos lista\n";

                String createTableClientes = "CREATE TABLE CLIENTES("
                        + "CELULAR VARCHAR (10) PRIMARY KEY,"
                        + "NOMBRE VARCHAR (30),"
                        + "APELLIDO VARCHAR (30),"
                        + "CORREO VARCHAR (30),"
                        + "NCOMPRAS INT NOT NULL"
                        + ")";

                String createTableVentas = "CREATE TABLE VENTAS("
                        + "FOLIO INT NOT NULL PRIMARY KEY,"
                        + "FECHA VARCHAR (30),"
                        + "HORA VARCHAR (30),"
                        + "CLIENTE VARCHAR(10) REFERENCES CLIENTES(CELULAR),"
                        + "NPRODUCTOS INT NOT NULL"
                        + ")";
                
                String createTableProveedores = "CREATE TABLE PROVEEDORES("
                        + "CELULAR VARCHAR (10) PRIMARY KEY,"
                        + "CORREO VARCHAR (30),"
                        + "NOMBRE VARCHAR (30),"
                        + "NPRODUCTOS INT NOT NULL DEFAULT 0,"
                        + ")";

                String createTableInventario = "CREATE TABLE INVENTARIO("
                        + "CODIGO VARCHAR (30) PRIMARY KEY,"
                        + "FECHA VARCHAR (30),"
                        + "CANTIDAD INT NOT NULL,"
                        + "NOMBRE VARCHAR (30),"
                        + "PROVEEDOR VARCHAR(10) REFERENCES PROVEEDORES (CELULAR)"
                        + ")";

                String desc = "disconnect";

                try {
                    if (!isTableExist("CLIENTES")) {
                        PreparedStatement tClientes = conn.prepareStatement(createTableClientes);
                        tClientes.execute();
                        tClientes.close();
                        mensaje = mensaje+"\nTabla de clientes ha sido creada correctamente";
                    }

                    if (!isTableExist("VENTAS")) {
                        PreparedStatement tVentas = conn.prepareStatement(createTableVentas);
                        tVentas.execute();
                        tVentas.close();
                        mensaje = mensaje+"\nTabla de ventas ha sido creada correctamente";
                    }

                    if (!isTableExist("PROVEEDORES")) {
                        PreparedStatement tProveedores = conn.prepareStatement(createTableProveedores);
                        tProveedores.execute();
                        tProveedores.close();
                        mensaje = mensaje+"\nTabla de proveedores ha sido creada correctamente";
                    }

                    if (!isTableExist("INVENTARIO")) {
                        PreparedStatement tInventario = conn.prepareStatement(createTableInventario);
                        tInventario.execute();
                        tInventario.close();
                        mensaje = mensaje+"\nTabla de inventario ha sido creada correctamente";
                    }

                    mensaje = mensaje +"\n\nSe ha iniciado la base de datos";
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    public boolean isTableExist(String sTablename) throws SQLException {
        if (conn != null) {
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, sTablename.toUpperCase(), null);
            if (rs.next()) {
                mensaje = mensaje + "\nTabla "+rs.getString("TABLE_NAME")+" Ha sido cargada exitosamente";
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Connection AccederBD() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:derby:.\\DB\\CENTAUROPOS.DB");
            if (conn != null) {
                mensaje = mensaje + "\nAcceso a la base de datos exitoso!";
                JOptionPane.showMessageDialog(null, mensaje + "\n\nEstado de los datos: La"
                        + " Base de datos ha sido cargada exitosamente!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

   
    
    public Connection getConnection(){
        try {
            //obtenemos el driver de para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //obtenemos la conexión
            conn = DriverManager.getConnection("jdbc:derby:.\\DB\\CENTAUROPOS.DB");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

}
