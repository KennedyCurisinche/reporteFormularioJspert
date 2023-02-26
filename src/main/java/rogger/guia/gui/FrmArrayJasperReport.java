package rogger.guia.gui;

import java.util.ArrayList;
import java.util.List;
import rogger.guia.entity.DetalleCompra;
import rogger.guia.service.ReporteJasper;

public class FrmArrayJasperReport extends javax.swing.JFrame {

        //private ReporteJasper reporteJasper = new ReporteJasper();

        private DetalleCompra dll;
        private List<DetalleCompra> listDetalle = new ArrayList<>();

        private Integer idproducto = 1;
        private String nompro = "";
        private Double precmnpro = 0.00;
        private Integer canpro = 0;
        private Double importepro = 0.00;

        /**
         * Creates new form FrmArrayJasperReport
         */
        public FrmArrayJasperReport() {
                initComponents();
                setTitle("Reporte GUI Productos");
                setLocationRelativeTo(null);
                setResizable(false);
                comenzarFormulario();
        }

        private void comenzarFormulario() {
                listDetalle.add(new DetalleCompra(0, "-", 0.00, 0, 0.00));

                txtId.setText(idproducto + "");
                txtNomPro.setText(nompro + "");
                txtPrecPro.setText(precmnpro + "");
                txtCanPro.setText(canpro + "");
                txtImportePro.setText(importepro + "");
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                txtId = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                txtNomPro = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txtPrecPro = new javax.swing.JTextField();
                txtCanPro = new javax.swing.JTextField();
                txtImportePro = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                lblNumLista = new javax.swing.JLabel();
                btnGuardar = new javax.swing.JButton();
                btnHacerReporte = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("REPORTE DE PRODUCTOS VENDIDOS");

                txtId.setEditable(false);

                jLabel2.setText("ID");

                jLabel3.setText("NOMBRE PRODUCTO");

                jLabel4.setText("PRECIO UNITARIO");

                jLabel5.setText("CANTIDAD");

                jLabel6.setText("IMPORTE");

                txtCanPro.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtCanProKeyReleased(evt);
                        }
                });

                txtImportePro.setEditable(false);

                jLabel7.setText("GUARDADOS");

                lblNumLista.setText("0");

                btnGuardar.setBackground(new java.awt.Color(153, 255, 102));
                btnGuardar.setText("GUARDAR");
                btnGuardar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGuardarActionPerformed(evt);
                        }
                });

                btnHacerReporte.setBackground(new java.awt.Color(255, 153, 153));
                btnHacerReporte.setText("HACER REPORTE");
                btnHacerReporte.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHacerReporteActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnHacerReporte)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(lblNumLista))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel6)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(txtCanPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                                                .addComponent(txtPrecPro, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtImportePro, javax.swing.GroupLayout.Alignment.LEADING)))))
                                                .addContainerGap(20, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPrecPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtCanPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtImportePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnGuardar)
                                        .addComponent(btnHacerReporte))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(lblNumLista))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                // TODO add your handling code here:
                cargarDatosNuevos();

                dll = new DetalleCompra(idproducto, nompro, precmnpro, canpro, importepro);
                listDetalle.add(dll);

                automatizarFormulario();
        }//GEN-LAST:event_btnGuardarActionPerformed

        private void txtCanProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCanProKeyReleased
                // TODO add your handling code here:
                try {
                        precmnpro = Double.parseDouble(txtPrecPro.getText());
                        canpro = Integer.parseInt(txtCanPro.getText());

                        importepro = canpro * precmnpro;

                        txtImportePro.setText(importepro + "");
                } catch (Exception e) {
                        //el precio en caso este vacio no avise
                }

        }//GEN-LAST:event_txtCanProKeyReleased

        private void btnHacerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerReporteActionPerformed
                // TODO add your handling code here:
                
                //reporteJasper.generarReporte(listDetalle);
                
                Runnable runnable = new ReporteJasper(listDetalle);
                Thread t = new Thread(runnable);
                t.start();
        }//GEN-LAST:event_btnHacerReporteActionPerformed

        private void cargarDatosNuevos() {
                idproducto = Integer.parseInt(txtId.getText());
                nompro = txtNomPro.getText();
                precmnpro = Double.parseDouble(txtPrecPro.getText());
                canpro = Integer.parseInt(txtCanPro.getText());
                importepro = Double.parseDouble(txtImportePro.getText());
        }

        private void automatizarFormulario() {
                lblNumLista.setText((listDetalle.size() - 1) + "");

                idproducto++;

                txtId.setText(idproducto + "");
                txtNomPro.setText("");
                txtPrecPro.setText("0.00");
                txtCanPro.setText("0");
                txtImportePro.setText("0.00");
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
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
                        java.util.logging.Logger.getLogger(FrmArrayJasperReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmArrayJasperReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmArrayJasperReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmArrayJasperReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmArrayJasperReport().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnGuardar;
        private javax.swing.JButton btnHacerReporte;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel lblNumLista;
        private javax.swing.JTextField txtCanPro;
        private javax.swing.JTextField txtId;
        private javax.swing.JTextField txtImportePro;
        private javax.swing.JTextField txtNomPro;
        private javax.swing.JTextField txtPrecPro;
        // End of variables declaration//GEN-END:variables
}
