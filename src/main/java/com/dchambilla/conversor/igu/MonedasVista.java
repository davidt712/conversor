package com.dchambilla.conversor.igu;

import com.dchambilla.conversor.logica.Monedas.MonedaController;

public class MonedasVista extends javax.swing.JFrame {

        MonedaController monedaControl = null;

        public MonedasVista() {
                monedaControl = new MonedaController();
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                cmbMonedaEntrada = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                txtCantidad = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txtResult = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                cmbMonedaSalida = new javax.swing.JComboBox<>();
                btnConvertir = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
                jLabel1.setText("CONVERSOR DE MONEDAS");

                jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                jLabel2.setText("Convertir");

                cmbMonedaEntrada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                cmbMonedaEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Soles", "Dólar", "Euros", "Libra esterlina", "Yen japonés",
                                                "Won surcoreano" }));

                jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                jLabel3.setText("Ingrese la cantidad:");

                txtCantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

                jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                jLabel4.setText("Resultado");

                txtResult.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

                jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                jLabel5.setText("a");

                cmbMonedaSalida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                cmbMonedaSalida.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Soles", "Dólar", "Euros", "Libra esterlina", "Yen japonés",
                                                "Won surcoreano" }));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtCantidad)
                                                                                .addComponent(txtResult)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel4))
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(cmbMonedaEntrada,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                211,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                28,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel5)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(cmbMonedaSalida,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                211,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(cmbMonedaEntrada,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(cmbMonedaSalida,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtCantidad,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtResult,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(47, Short.MAX_VALUE)));

                btnConvertir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                btnConvertir.setText("CONVERTIR");
                btnConvertir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnConvertirActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(193, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(37, 37, 37)
                                                                .addComponent(btnConvertir)
                                                                .addGap(34, 34, 34)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                26,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(24, 24, 24))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(btnConvertir)
                                                                                                                .addGap(144, 144,
                                                                                                                                144)))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConvertirActionPerformed
                try {
                        if (txtCantidad.getText().equals("")) {
                                txtResult.setText("No se ingresó la cantidad");
                        }
                        int mEntrada = cmbMonedaEntrada.getSelectedIndex();
                        int mSalida = cmbMonedaSalida.getSelectedIndex();
                        Double cantidad = Double.valueOf(txtCantidad.getText());

                        String resultado = monedaControl.conversor(mEntrada, mSalida, cantidad);

                        txtResult.setText(resultado);
                } catch (NumberFormatException numberFormatException) {
                }
        }// GEN-LAST:event_btnConvertirActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnConvertir;
        private javax.swing.JComboBox<String> cmbMonedaEntrada;
        private javax.swing.JComboBox<String> cmbMonedaSalida;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField txtCantidad;
        private javax.swing.JTextField txtResult;
        // End of variables declaration//GEN-END:variables
}
