package principal;

import Controlador.Conexion;
import Controlador.Operaciones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import java.sql.Connection;
//Usuario, ventas, inventario, proveedores, clientes

public class MainActivity extends javax.swing.JFrame {

    private Timer timer;
    private static String fecha;

    private Connection con;
    Conexion conexion;

    private static ClientesActivity clientesObjeto;
    private static InventarioActivity inventarioObjeto;
    private static ProveedoresActivity proveedoresObjeto;
    private static VentasActivity ventasObjeto;

    private static ClientesInternal clientesInternal;
    private static InventarioInternal inventarioInternal;
    private static ProveedoresInternal proveedoresInternal;
    private static VentasInternal ventasInternal;

    public MainActivity() {
        initComponents();

        conexion = new Conexion();
        conexion.CrearBD();
        con = conexion.AccederBD();


        setLocationRelativeTo(null);
        setTitle("Centauro Diesel POS");
        setSize(1200, 720);
        setResizable(false);

        Calendar cal = Calendar.getInstance();

         fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.fechal.setText(fecha);

        ventasMenu.setBorderPainted(true);
        probarMenu.setBorderPainted(true);
        inventarioMenu.setBorderPainted(true);
        clientesMenu.setBorderPainted(true);
        proveedoresMenu.setBorderPainted(true);
        informacionMenu.setBorderPainted(true);

        UIManager.put("MenuBar.background", new java.awt.Color(255, 102, 0));
        UIManager.put("MenuBar.opaque", true);
        menuBar.setBackground(Color.yellow);

        inicializarInternals();

    }

    private void inicializarInternals() {
        clientesObjeto = new ClientesActivity();
        proveedoresObjeto = new ProveedoresActivity();
        ventasObjeto = new VentasActivity();
        inventarioObjeto = new InventarioActivity();

        clientesInternal = new ClientesInternal();
        proveedoresInternal = new ProveedoresInternal();
        ventasInternal = new VentasInternal();
        inventarioInternal = new InventarioInternal();

        desktopPane.add(clientesObjeto);
        desktopPane.add(proveedoresObjeto);
        desktopPane.add(ventasObjeto);
        desktopPane.add(inventarioObjeto);

        desktopPane.add(clientesInternal);
        desktopPane.add(proveedoresInternal);
        desktopPane.add(ventasInternal);
        desktopPane.add(inventarioInternal);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        horaLabel = new javax.swing.JLabel();
        horal = new javax.swing.JLabel();
        minl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        segl = new javax.swing.JLabel();
        ampmTextField = new javax.swing.JLabel();
        fechaLabel1 = new javax.swing.JLabel();
        fechal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        probarMenu = new javax.swing.JMenu();
        ventasMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        clientesMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        proveedoresMenu = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        inventarioMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        informacionMenu = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        horaLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(255, 255, 255));
        horaLabel.setText("Hora:");

        horal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        horal.setForeground(new java.awt.Color(255, 255, 255));
        horal.setText("00");

        minl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        minl.setForeground(new java.awt.Color(255, 255, 255));
        minl.setText("00");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        segl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        segl.setForeground(new java.awt.Color(255, 255, 255));
        segl.setText("00");

        ampmTextField.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ampmTextField.setForeground(new java.awt.Color(255, 255, 255));
        ampmTextField.setText("AM");

        fechaLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fechaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel1.setText("Fecha:");

        fechal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fechal.setForeground(new java.awt.Color(255, 255, 255));
        fechal.setText("00/00/00");

        desktopPane.setLayer(horaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(horal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(minl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(segl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(ampmTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(fechaLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(fechal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechaLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(horaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ampmTextField)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap(646, Short.MAX_VALUE)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ampmTextField)
                    .addComponent(segl)
                    .addComponent(jLabel7)
                    .addComponent(minl)
                    .addComponent(jLabel4)
                    .addComponent(horal)
                    .addComponent(fechaLabel1)
                    .addComponent(fechal)
                    .addComponent(horaLabel))
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(255, 102, 0));

        probarMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        probarMenu.setText("Probar Conexion");
        probarMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        menuBar.add(probarMenu);

        ventasMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ventasMenu.setText("Ventas");
        ventasMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        jMenuItem3.setText("Abrir ventas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        ventasMenu.add(jMenuItem3);

        jMenuItem4.setText("Buscar en ventas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ventasMenu.add(jMenuItem4);

        menuBar.add(ventasMenu);

        clientesMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        clientesMenu.setText("Clientes");
        clientesMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        jMenuItem7.setText("Abrir clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        clientesMenu.add(jMenuItem7);

        jMenuItem8.setText(" Buscar en clientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        clientesMenu.add(jMenuItem8);

        menuBar.add(clientesMenu);

        proveedoresMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        proveedoresMenu.setText("Proveedores");
        proveedoresMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        jMenuItem9.setText("Abrir proveedores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        proveedoresMenu.add(jMenuItem9);

        jMenuItem10.setText("Buscar en proveedores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        proveedoresMenu.add(jMenuItem10);

        menuBar.add(proveedoresMenu);

        inventarioMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        inventarioMenu.setText("Inventario");
        inventarioMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        jMenuItem5.setText("Abrir inventario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        inventarioMenu.add(jMenuItem5);

        jMenuItem6.setText("Buscar en inventario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        inventarioMenu.add(jMenuItem6);

        menuBar.add(inventarioMenu);

        informacionMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        informacionMenu.setText("Información");
        informacionMenu.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        jMenuItem11.setText("Información sobre el Software");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        informacionMenu.add(jMenuItem11);

        jMenu7.setText("Acerca de los desarrolladores");
        informacionMenu.add(jMenu7);

        menuBar.add(informacionMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirInternal(JInternalFrame obj) {
        desktopPane.add(obj);
        obj.toFront();
        obj.setLocation(desktopPane.getWidth() / 2 - obj.getWidth() / 2, desktopPane.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
        }

        obj.setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ventasObjeto = new VentasActivity();

        destruirInternal(proveedoresObjeto);
        destruirInternal(clientesObjeto);
        destruirInternal(inventarioObjeto);

        destruirInternal(clientesInternal);
        destruirInternal(proveedoresInternal);
        destruirInternal(ventasInternal);
        destruirInternal(inventarioInternal);

        abrirInternal(ventasObjeto);
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        inventarioObjeto = new InventarioActivity();

        destruirInternal(ventasObjeto);
        destruirInternal(proveedoresObjeto);
        destruirInternal(clientesObjeto);

        destruirInternal(clientesInternal);
        destruirInternal(proveedoresInternal);
        destruirInternal(ventasInternal);
        destruirInternal(inventarioInternal);

        abrirInternal(inventarioObjeto);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        clientesObjeto = new ClientesActivity();

        destruirInternal(ventasObjeto);
        destruirInternal(proveedoresObjeto);
        destruirInternal(inventarioObjeto);

        destruirInternal(clientesInternal);
        destruirInternal(proveedoresInternal);
        destruirInternal(ventasInternal);
        destruirInternal(inventarioInternal);

        abrirInternal(clientesObjeto);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        proveedoresObjeto = new ProveedoresActivity();

        destruirInternal(ventasObjeto);
        destruirInternal(inventarioObjeto);
        destruirInternal(clientesObjeto);

        destruirInternal(clientesInternal);
        destruirInternal(proveedoresInternal);
        destruirInternal(ventasInternal);
        destruirInternal(inventarioInternal);

        abrirInternal(proveedoresObjeto);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        InfoActivity obj = new InfoActivity();
        abrirInternal(obj);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        //Buscar Ventas
        ventasInternal = new VentasInternal();

        destruirInternal(ventasObjeto);
        destruirInternal(inventarioObjeto);
        destruirInternal(clientesObjeto);
        destruirInternal(proveedoresObjeto);

        destruirInternal(inventarioInternal);
        destruirInternal(clientesInternal);
        destruirInternal(proveedoresInternal);

        abrirInternal(ventasInternal);


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        //Buscar Clientes
        clientesInternal = new ClientesInternal();

        destruirInternal(ventasObjeto);
        destruirInternal(inventarioObjeto);
        destruirInternal(clientesObjeto);
        destruirInternal(proveedoresObjeto);

        destruirInternal(inventarioInternal);
        destruirInternal(ventasInternal);
        destruirInternal(proveedoresInternal);

        abrirInternal(clientesInternal);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // Buscar Proveedores

        proveedoresInternal = new ProveedoresInternal();

        destruirInternal(ventasObjeto);
        destruirInternal(inventarioObjeto);
        destruirInternal(clientesObjeto);
        destruirInternal(proveedoresObjeto);

        destruirInternal(inventarioInternal);
        destruirInternal(clientesInternal);
        destruirInternal(ventasInternal);

        abrirInternal(proveedoresInternal);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Buscar Inventario

        inventarioInternal = new InventarioInternal();

        destruirInternal(ventasObjeto);
        destruirInternal(inventarioObjeto);
        destruirInternal(clientesObjeto);
        destruirInternal(proveedoresObjeto);

        destruirInternal(proveedoresInternal);
        destruirInternal(clientesInternal);
        destruirInternal(ventasInternal);

        abrirInternal(inventarioInternal);


    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    private void destruirInternal(JInternalFrame interno) {
        interno.toBack();
        interno.setVisible(false);
    }

    public class cronometro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos, am_pm;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            am_pm = tiempo.get(Calendar.AM_PM);

            if (hora < 10) {
                horal.setText("0" + String.valueOf(hora));
            } else {
                horal.setText(String.valueOf(hora));
            }
            if (minutos < 10) {
                minl.setText("0" + String.valueOf(minutos));
            } else {
                minl.setText(String.valueOf(minutos));
            }
            if (segundos < 10) {
                segl.setText("0" + String.valueOf(segundos));
            } else {
                segl.setText(String.valueOf(segundos));
            }
            if (am_pm == 0) {
                ampmTextField.setText("AM");
            } else {
                ampmTextField.setText("PM");
            }

        }
    }

    public static String getFecha() {
        return fecha;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ampmTextField;
    private javax.swing.JMenu clientesMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel fechaLabel1;
    private static javax.swing.JLabel fechal;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JLabel horal;
    private javax.swing.JMenu informacionMenu;
    private javax.swing.JMenu inventarioMenu;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel minl;
    private javax.swing.JMenu probarMenu;
    private javax.swing.JMenu proveedoresMenu;
    private javax.swing.JLabel segl;
    private javax.swing.JMenu ventasMenu;
    // End of variables declaration//GEN-END:variables
}
