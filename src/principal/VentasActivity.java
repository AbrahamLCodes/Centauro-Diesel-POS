package principal;

import Controlador.Operaciones;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class VentasActivity extends javax.swing.JInternalFrame {

    Operaciones operaciones;
    String[] titulos;

    public VentasActivity() {
        initComponents();

        tabla.getTableHeader().setFont(new Font("Liberation Sans", Font.BOLD, 20));

        tabla.setShowGrid(true);
        tabla.setGridColor(Color.RED);

        operaciones = new Operaciones();
        titulos = new String[]{"Folio", "Fecha", "Hora", "Cliente", "N.P. Vendidos", "Precio Tot."};
        desabilitar();
        operaciones.vaciarTabla(tabla, titulos);
        operaciones.readDatos(tabla, "VENTAS", 6);

        fechaText.setText(MainActivity.getFecha());
        horaText.setText(MainActivity.getHora());

        fechaText.setEnabled(false);
        horaText.setEnabled(false);

        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);

    }

    private void habilitar() {
        folioText.setEnabled(true);
        clienteText.setEnabled(true);
        productosText.setEnabled(true);
    }

    private void desabilitar() {
        folioText.setEnabled(false);
        clienteText.setEnabled(false);
        productosText.setEnabled(false);
    }

    private void limpiar() {
        folioText.setText("");
        clienteText.setText("");
        productosText.setText("");

        fechaText.setText(MainActivity.getFecha());
        horaText.setText(MainActivity.getHora());
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
        folioText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        horaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clienteText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productosText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        productosLabel = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

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
        jLabel1.setText("Folio");

        nuevo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        folioText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha");

        fechaText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora");

        horaText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente");

        clienteText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inserte el codigo del Producto");

        productosText.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        productosText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productosTextKeyPressed(evt);
            }
        });

        jLabel10.setText("Presione enter para introducir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(productosText)
                        .addContainerGap())
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
                            .addComponent(clienteText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folioText))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(folioText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productosText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
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
                "Folio", "Fecha", "Hora", "Cliente", "N.P. Vendidos", "Precio"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "Codigo"
            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Precio total:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Productos en venta:");

        totalLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        totalLabel.setText("0");

        productosLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        productosLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(productosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
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

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (!isTextsEmpty()) {
            String[] textos = new String[]{folioText.getText(), fechaText.getText(),
                horaText.getText(), clienteText.getText(), productosLabel.getText(),
                totalLabel.getText()};

            String[][] productos = new String[tablaProductos.getModel().getRowCount()][2];
            for (int i = 0; i < tablaProductos.getModel().getRowCount(); i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        productos[i][j] = String.valueOf(tablaProductos
                                .getValueAt(i, 3));
                    } else if (j == 1) {
                        productos[i][j] = String.valueOf(tablaProductos
                                .getValueAt(i, 2));
                    }
                }
            }
            operaciones.insertIntoVentas(textos, clienteText.getText(), productos);

            nuevo.setEnabled(true);
            guardar.setEnabled(false);
            editar.setEnabled(false);
            eliminar.setEnabled(false);
            limpiar();
            desabilitar();
            operaciones.readDatos(tabla, "VENTAS", 6);
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
        operaciones.readDatos(tabla, "VENTAS", 6);

    }//GEN-LAST:event_nuevoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        String[] textos = new String[]{folioText.getText(), fechaText.getText(),
            horaText.getText(), clienteText.getText(), productosLabel.getText(),
            totalLabel.getText()};
        operaciones.updateFromVentas(textos, String.valueOf(tabla.getValueAt(
                tabla.getSelectedRow(), 0)));

        operaciones.vaciarTabla(tabla, titulos);
        limpiar();
        desabilitar();
        operaciones.readDatos(tabla, "VENTAS", 6);

        editar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        nuevo.setEnabled(true);

    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        operaciones.deleteFromVentas(folioText.getText(), clienteText.getText());
    }//GEN-LAST:event_eliminarActionPerformed

    private void productosTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productosTextKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                    + "la cantidad a vender"));

            operaciones.getProducto(productosText.getText(), tablaProductos, cantidad);
            productosText.setText("");

            int precio = Integer.parseInt(String.valueOf(tablaProductos
                    .getValueAt(tablaProductos.getModel()
                            .getRowCount() - 1, 1)));
            int preciototal = Integer.parseInt(totalLabel.getText()) + (precio * cantidad);

            totalLabel.setText(String.valueOf(preciototal));

            int productosTotal = Integer.parseInt(productosLabel.getText());

            productosLabel.setText(String.valueOf(productosTotal++));
        }

    }//GEN-LAST:event_productosTextKeyPressed

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed


    }//GEN-LAST:event_tablaKeyPressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila = tabla.getSelectedRow();

        //folio, fecha, hora, cliente
        folioText.setText(tabla.getValueAt(fila, 0).toString());
        fechaText.setText(tabla.getValueAt(fila, 1).toString());
        horaText.setText(tabla.getValueAt(fila, 2).toString());
        clienteText.setText(tabla.getValueAt(fila, 3).toString());
        productosLabel.setText(tabla.getValueAt(fila, 4).toString());
        totalLabel.setText(tabla.getValueAt(fila, 5).toString());

        nuevo.setEnabled(false);
        guardar.setEnabled(false);
        editar.setEnabled(true);
        eliminar.setEnabled(true);

        habilitar();
        productosText.setEnabled(false);
        clienteText.setEnabled(false);


    }//GEN-LAST:event_tablaMouseClicked

    private boolean isTextsEmpty() {
        if (folioText.getText().isEmpty()) {
            folioText.requestFocus();
            JOptionPane.showMessageDialog(null, "Introduzca el folio");
            return true;
        } else if (clienteText.getText().isEmpty()) {
            clienteText.requestFocus();
            JOptionPane.showMessageDialog(null, "Introduzca al cliente");
            return true;
        } else if (tablaProductos.getModel().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "");
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clienteText;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fechaText;
    private javax.swing.JTextField folioText;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField horaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nuevo;
    private javax.swing.JLabel productosLabel;
    private javax.swing.JTextField productosText;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
