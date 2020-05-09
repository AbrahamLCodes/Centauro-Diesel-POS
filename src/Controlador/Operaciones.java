package Controlador;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Operaciones {

    public void vaciarTabla(javax.swing.JTable tabla, String titulos[]) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
    }

    public void readDatos(javax.swing.JTable tabla, String nombreTabla, int nDatos) {

        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();
            String dts[] = new String[nDatos];
            String sql = "SELECT * FROM " + nombreTabla;

            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            switch (nombreTabla) {
                case "CLIENTES":
                    while (rs.next()) {
                        dts[0] = rs.getString("CELULAR");
                        dts[1] = rs.getString("NOMBRE");
                        dts[2] = rs.getString("APELLIDO");
                        dts[3] = rs.getString("CORREO");
                        dts[4] = String.valueOf(rs.getInt("NCOMPRAS"));
                        miModelo.addRow(dts);
                    }
                    break;
                case "VENTAS":
                    while (rs.next()) {
                        dts[0] = String.valueOf(rs.getInt("FOLIO"));
                        dts[1] = rs.getString("FECHA");
                        dts[2] = rs.getString("HORA");
                        dts[3] = rs.getString("CLIENTE");
                        dts[4] = String.valueOf(rs.getInt("NPRODUCTOS"));
                        miModelo.addRow(dts);
                    }
                    break;
                case "PROVEEDORES":
                    while (rs.next()) {
                        dts[0] = rs.getString("CELULAR");
                        dts[1] = rs.getString("CORREO");
                        dts[2] = rs.getString("NOMBRE");
                        dts[3] = String.valueOf(rs.getInt("NPRODUCTOS"));
                        miModelo.addRow(dts);
                    }
                    break;
                case "INVENTARIO":
                    while (rs.next()) {
                        dts[0] = rs.getString("CODIGO");
                        dts[1] = rs.getString("FECHA");
                        dts[2] = String.valueOf(rs.getInt("CANTIDAD"));
                        dts[3] = rs.getString("NOMBRE");
                        dts[4] = rs.getString("PROVEEDOR");
                        miModelo.addRow(dts);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tabla no encontrada");
                    break;
            }
            tabla.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDEN VISUALIZAR LOS DATOS:     " + ex.getMessage());
        }

    }

    public void createDatos(String tablaNombre, String[] textos) {

        switch (tablaNombre) {
            case "CLIENTES":
                insertIntoClientes(textos);
                break;
            case "VENTAS":
                break;
            case "PROVEEDORES":
                insertIntoProveedores(textos);
                break;
            case "INVENTARIO":
                insertIntoInventario(textos);
                break;
        }

    }

    private void changeDataBase() {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "ALTER TABLE PROVEEDORES DROP APELLIDO";

            PreparedStatement pst = con.prepareStatement(sql);
            int n = pst.executeUpdate();

            if (n > 0) {
                System.out.println("YA CHINGASTE MIJO");
            }
        } catch (SQLException ex) {
            System.out.println("NAAAA YA VALIO VRG:  " + ex.getMessage());
        }
    }

    public void addNProductos() {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "ALTER TABLE PROVEEDORES ADD NPRODUCTOS INT NOT NULL DEFAULT 0";

            PreparedStatement pst = con.prepareStatement(sql);
            int n = pst.executeUpdate();

            if (n > 0) {
                System.out.println("YA CHINGASTE MIJO");
            }
        } catch (SQLException ex) {
            System.out.println("NAAAA YA VALIO VRG:  " + ex.getMessage());
        }
    }

    private void insertIntoClientes(String[] textos) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "INSERT INTO CLIENTES (CELULAR, NOMBRE, APELLIDO, CORREO, NCOMPRAS)"
                    + " VALUES (?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setString(3, textos[2]);
            pst.setString(4, textos[3]);
            pst.setInt(5, Integer.parseInt(textos[4]));

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateFromClientes(String[] textos, String celular) {

        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "UPDATE CLIENTES SET CELULAR = ?, NOMBRE = ?, APELLIDO = ?, "
                    + "CORREO = ?, NCOMPRAS = ? WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setString(3, textos[2]);
            pst.setString(4, textos[3]);
            pst.setInt(5, Integer.parseInt(textos[4]));
            pst.setString(6, celular);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS: " + ex.getMessage());
        }
    }

    public void deleteFromClientes(String celuar) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            String sql = "DELETE FROM CLIENTES WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, celuar);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE: " + ex.getMessage());
        }
    }

    private void insertIntoVentas() {

    }

    private void updateFromVentas() {

    }

    private void deleteFromVentas() {

    }

    private void insertIntoProveedores(String[] textos) {

        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "INSERT INTO PROVEEDORES (CELULAR, CORREO, NOMBRE, NPRODUCTOS)"
                    + " VALUES (?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setString(3, textos[2]);
            pst.setInt(4, Integer.parseInt(textos[3]));

            int n = pst.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR DATOS: " + ex.getMessage());
        }

    }

    public void updateFromProveedores(String[] textos, String celular) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "UPDATE PROVEEDORES SET CELULAR = ?, CORREO = ?, NOMBRE = ?, "
                    + "NPRODUCTOS = ? WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setString(3, textos[2]);
            pst.setInt(4, Integer.parseInt(textos[3]));
            pst.setString(5, celular);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS: " + ex.getMessage());
        }
    }

    public void deleteFromProveedores(String celular) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            String sql = "DELETE FROM PROVEEDORES WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, celular);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE: " + ex.getMessage());
        }
    }

    private void insertIntoInventario(String[] textos) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "INSERT INTO INVENTARIO (CODIGO, FECHA, CANTIDAD, NOMBRE, PROVEEDOR) "
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setInt(3, Integer.parseInt(textos[2]));
            pst.setString(4, textos[3]);
            pst.setString(5, textos[4]);

            int n = pst.executeUpdate();

            if (n > 0) {
                aumentarProveedor(textos[4]);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE GUARDARON LOS DATOS: " + ex.getMessage());
            
        }
    }

    private void aumentarProveedor(String celular) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();
            
            String sql = "UPDATE PROVEEDORES SET NPRODUCTOS = NPRODUCTOS + 1 WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, celular);
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE\n"
                        + "SE HA AGREGADO UN PRODUCTO AL PROVEEDOR "+celular);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO SE GUARDARON\n"
                    + "ES POSIBLE QUE HALLA ESCRITO MAL EL PROVEEDOR:\n"+ex.getMessage());
        }
    }

    public void updateFromInventario(String[] textos, String codigo) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "UPDATE INVENTARIO SET CODIGO = ?, FECHA = ?, CANTIDAD = ?, "
                    + "NOMBRE = ?, PROVEEDOR = ? WHERE CODIGO = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, textos[0]);
            pst.setString(2, textos[1]);
            pst.setInt(3, Integer.parseInt(textos[2]));
            pst.setString(4, textos[3]);
            pst.setString(5, textos[4]);
            pst.setString(6, codigo);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS: " + ex.getMessage());
        }

    }

    public void deleteFromInventario(String codigo, String celular) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            String sql = "DELETE FROM INVENTARIO WHERE CODIGO = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codigo);
            int n = pst.executeUpdate();
            if (n > 0) {
                quitarFromProveedores(celular);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO ELIMINADOS CORRECTAMENTE: " + ex.getMessage());
        }
        
        
    }
    
    private void quitarFromProveedores(String celular){
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();
            
            String sql = "UPDATE PROVEEDORES SET NPRODUCTOS = NPRODUCTOS - 1 WHERE CELULAR = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, celular);
            int n = pst.executeUpdate();
            if(n > 0){
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE\n"
                        + "SE HA ELIMINADO UN PRODUCTO AL PROVEEDOR "+celular);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LOS DATOS NO SE ELIMINARON\n"
                    + "ES POSIBLE QUE HALLA ESCRITO EL PROVEEDOR MAL:\n "+ex.getMessage());
        }
    }

}
