package vista;
import Contenido.*;
import tda1.*;

/**
 *
 * @author alexander
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private RegistroExpedientes registroExpediente;
    private Lista<Empleado> registroEmpleados;
    private Lista<NodoHistorial<String>> historial;
    private Lista<Expediente> expedientes;
    private Historial<String> historialEmp;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        registroExpediente = new RegistroExpedientes();
        registroEmpleados = new Lista<>();
        historial = new Lista<>();
        expedientes = new Lista<>();
        historialEmp = new Historial<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNuevoDocumento = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemHistorialDocumentos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemRegistroEmpleados = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemRegistroGeneral = new javax.swing.JMenuItem();
        jMenuItemRegPorEmpleado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Registro de Documentos");

        jLabel1.setFont(new java.awt.Font("Cantarell", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Sistema de Registro de Documentos");

        jLabel2.setText("@Universidad de Lima");

        jMenu1.setText("Archivo");

        jMenuItemNuevoDocumento.setText("Nuevo documento");
        jMenuItemNuevoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoDocumentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNuevoDocumento);
        jMenu1.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Procesos");

        jMenuItemHistorialDocumentos.setText("Historial de documentos");
        jMenuItemHistorialDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHistorialDocumentosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemHistorialDocumentos);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Registro");

        jMenuItemRegistroEmpleados.setText("Registro de empleados");
        jMenuItemRegistroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroEmpleadosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRegistroEmpleados);

        jMenu5.setText("Registro de documentos");

        jMenuItemRegistroGeneral.setText("Reg. General");
        jMenuItemRegistroGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroGeneralActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRegistroGeneral);

        jMenuItemRegPorEmpleado.setText("Reg. por Empleado");
        jMenuItemRegPorEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegPorEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRegPorEmpleado);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ayuda");

        jMenuItemAcercaDe.setText("AcercaDe");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAcercaDe);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        AcercaDe oAcercaDe = new AcercaDe();
        oAcercaDe.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemHistorialDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHistorialDocumentosActionPerformed
        FrmHistorialDocumentos oFrmHistorialDocumentos = new FrmHistorialDocumentos(historial);
        oFrmHistorialDocumentos.setVisible(true);
    }//GEN-LAST:event_jMenuItemHistorialDocumentosActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemNuevoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoDocumentoActionPerformed
        FrmNuevoDocumento oFrmNuevoDocumento = new FrmNuevoDocumento(registroExpediente, historial, registroEmpleados, expedientes, historialEmp);
        oFrmNuevoDocumento.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoDocumentoActionPerformed

    private void jMenuItemRegistroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroEmpleadosActionPerformed
        FrmRegistroEmpleados oFrmRegistroEmpleados = new FrmRegistroEmpleados(registroEmpleados);
        oFrmRegistroEmpleados.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroEmpleadosActionPerformed

    private void jMenuItemRegPorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegPorEmpleadoActionPerformed
        FrmRegistroDocumPorEmpleado oFrmRegistroDocumPorEmpleado = new FrmRegistroDocumPorEmpleado(registroEmpleados, registroExpediente, historialEmp);
        oFrmRegistroDocumPorEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegPorEmpleadoActionPerformed

    private void jMenuItemRegistroGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroGeneralActionPerformed
        FrmRegistroGeneral oFrmRegistroGeneral = new FrmRegistroGeneral(expedientes, registroEmpleados);
        oFrmRegistroGeneral.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroGeneralActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemHistorialDocumentos;
    private javax.swing.JMenuItem jMenuItemNuevoDocumento;
    private javax.swing.JMenuItem jMenuItemRegPorEmpleado;
    private javax.swing.JMenuItem jMenuItemRegistroEmpleados;
    private javax.swing.JMenuItem jMenuItemRegistroGeneral;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
