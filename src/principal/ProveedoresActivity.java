package principal;

import Controlador.Operaciones;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class ProveedoresActivity extends javax.swing.JInternalFrame {

    Operaciones operaciones;
    String[] titulos;

    public ProveedoresActivity() {
        initComponents();

        tabla.getTableHeader().setFont(new Font("Liberation Sans", Font.BOLD, 20));

        tabla.setShowGrid(true);
        tabla.setGridColor(Color.RED);

        operaciones = new Operaciones();
        titulos = new String[]{"Celular", "Correo", "Nombre", "Productos en Inventario"};
        desabilitar();
        operaciones.vaciarTabla(tabla, titulos);
        operaciones.readDatos(tabla, "PROVEEDORES", 4);

        productosText.setEnabled(false);

        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
    }

    private void habilitar() {
        celularText.setEnabled(true);
        correoText.setEnabled(true);
        nombreText.setEnabled(true);
    }

    private void desabilitar() {
        celularText.setEnabled(false);
        correoText.setEnabled(false);
        nombreText.setEnabled(false);
    }

    private void limpiar() {
        celularText.setText("");
        correoText.setText("");
        nombreText.setText("");
    }

    private boolean isTextsEmpty() {
        if (celularText.getText().isEmpty()) {
            celularText.requestFocus();
            JOptionPane.showMessageDialog(null, "Falta introducir el celular");
            return true;
        } else if (correoText.getText().isEmpty()) {
            correoText.requestFocus();
            JOptionPane.showMessageDialog(null, "Falta introducir el correo");
            return true;
        } else if (nombreText.getText().isEmpty()) {
            nombreText.requestFocus();
            JOptionPane.showMessageDialog(null, "Falta introducir el nombre");
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        celularText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        correoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productosText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        editar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        editar.setText("Actualizar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Celular");

        nuevo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        celularText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo");

        correoText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        nombreText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("# Productos en Inventario");

        productosText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        productosText.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correoText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularText))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(productosText)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celularText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(nuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar)
                    .addComponent(eliminar))
                .addGap(18, 18, 18))
        );

        tabla.setBackground(new java.awt.Color(0, 0, 0));
        tabla.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Celular", "Correo", "Nombre", "Productos en inventario"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        try {

            int fila = tabla.getSelectedRow();
            String cel = tabla.getValueAt(fila, 0).toString();

            celularText.setText(tabla.getValueAt(fila, 0).toString());
            correoText.setText(tabla.getValueAt(fila, 1).toString());
            nombreText.setText(tabla.getValueAt(fila, 2).toString());
            productosText.setText(tabla.getValueAt(fila, 3).toString());

            nuevo.setEnabled(false);
            guardar.setEnabled(false);
            editar.setEnabled(true);
            eliminar.setEnabled(true);
            habilitar();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL SELECCIONAR UN CLIENTE: " + ex.getMessage());
        }


    }//GEN-LAST:event_tablaMouseClicked

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (!isTextsEmpty()) {
            String[] textos = new String[]{celularText.getText(), correoText.getText(),
                nombreText.getText(), productosText.getText()};

            operaciones.createDatos("PROVEEDORES", textos);

            operaciones.vaciarTabla(tabla, titulos);
            operaciones.readDatos(tabla, "PROVEEDORES", 4);

            nuevo.setEnabled(true);
            guardar.setEnabled(false);
            editar.setEnabled(false);
            eliminar.setEnabled(false);
            limpiar();
            desabilitar();
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        operaciones.vaciarTabla(tabla, titulos);
        operaciones.readDatos(tabla, "PROVEEDORES", 4);
        productosText.setText("0");
    }//GEN-LAST:event_nuevoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        int fila = tabla.getSelectedRow();
        String[] textos = new String[]{celularText.getText(), correoText.getText(),
            nombreText.getText(), productosText.getText()};

        operaciones.updateFromProveedores(textos, tabla.getValueAt(fila, 0).toString());

        limpiar();
        desabilitar();
        operaciones.vaciarTabla(tabla, titulos);
        operaciones.readDatos(tabla, "PROVEEDORES", 4);
        editar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        nuevo.setEnabled(true);

    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN REGISTRO");
        } else {
            int opc = JOptionPane.showConfirmDialog(this,
                    "¿ESTA SEGURO QUE DESEA ELIMINAR ESTE REGISTRO?",
                    "Pregunta", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION) {
                operaciones.deleteFromProveedores(celularText.getText());
                limpiar();
                operaciones.vaciarTabla(tabla, titulos);
                operaciones.readDatos(tabla, "PROVEEDORES", 4);
                nuevo.setEnabled(true);
                guardar.setEnabled(false);
                editar.setEnabled(false);
                eliminar.setEnabled(false);
                desabilitar();
            }
        }

    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celularText;
    private javax.swing.JTextField correoText;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField productosText;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
