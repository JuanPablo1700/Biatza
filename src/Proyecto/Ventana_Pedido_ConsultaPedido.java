/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;

/**
 *
 * @author diana
 */
public class Ventana_Pedido_ConsultaPedido extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Usuario_Principal
     */
    public Ventana_Pedido_ConsultaPedido() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCabezera = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        lblUsuario3 = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        rbtnFiltro = new javax.swing.JRadioButton();
        lblDia1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblDia2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lblNomUsuario = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 583));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlCabezera.setBackground(new java.awt.Color(224, 122, 95));
        pnlCabezera.setMaximumSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setMinimumSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setPreferredSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setLayout(null);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesi??n");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlCabezera.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(1090, 10, 160, 40);

        lblUsuario3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario3.setText("Administrador: Nombre_Usuario");
        pnlCabezera.add(lblUsuario3);
        lblUsuario3.setBounds(10, 20, 300, 30);

        getContentPane().add(pnlCabezera);
        pnlCabezera.setBounds(0, 0, 1270, 60);

        pnlFondo.setBackground(new java.awt.Color(244, 241, 222));
        pnlFondo.setMaximumSize(new java.awt.Dimension(1270, 583));
        pnlFondo.setMinimumSize(new java.awt.Dimension(1270, 583));
        pnlFondo.setPreferredSize(new java.awt.Dimension(1270, 583));
        pnlFondo.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Consultar pedido");
        pnlFondo.add(lblTitulo);
        lblTitulo.setBounds(0, 60, 1270, 58);

        rbtnFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnFiltro.setText("Filtrar por fecha");
        rbtnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFiltroActionPerformed(evt);
            }
        });
        pnlFondo.add(rbtnFiltro);
        rbtnFiltro.setBounds(260, 130, 149, 31);

        lblDia1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDia1.setText("Filtrar del d??a:");
        pnlFondo.add(lblDia1);
        lblDia1.setBounds(470, 130, 110, 30);
        pnlFondo.add(jDateChooser1);
        jDateChooser1.setBounds(580, 130, 160, 30);

        lblDia2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDia2.setText("Al dia:");
        pnlFondo.add(lblDia2);
        lblDia2.setBounds(790, 130, 60, 30);
        pnlFondo.add(jDateChooser2);
        jDateChooser2.setBounds(860, 130, 160, 30);

        lblNomUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomUsuario.setText("Nombre Usuario:");
        pnlFondo.add(lblNomUsuario);
        lblNomUsuario.setBounds(260, 180, 140, 30);

        cmbUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        pnlFondo.add(cmbUsuario);
        cmbUsuario.setBounds(400, 180, 220, 30);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setActionCommand("Registrar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        pnlFondo.add(btnConsultar);
        btnConsultar.setBounds(260, 480, 240, 70);

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setActionCommand("Registrar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar);
        btnRegresar.setBounds(780, 480, 240, 70);

        tblUsuarios.setBackground(new java.awt.Color(244, 241, 222));
        tblUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Pedido", "Nombre Producto", "Nombre Usuario", "Numero Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlFondo.add(jScrollPane1);
        jScrollPane1.setBounds(260, 230, 760, 230);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Telefono del cliente.");
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlFondo.add(txtNombre);
        txtNombre.setBounds(810, 180, 202, 28);

        getContentPane().add(pnlFondo);
        pnlFondo.setBounds(0, 0, 1270, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        Ventana_Acceso VA = new Ventana_Acceso();
        VA.setVisible(true);

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void rbtnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFiltroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        Interfaz_Principal IP = new Interfaz_Principal();
        IP.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if(txtNombre.getText().equals("Telefono del cliente.")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Telefono del cliente.");
            txtNombre.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Pedido_ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_ConsultaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Pedido_ConsultaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbUsuario;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia1;
    private javax.swing.JLabel lblDia2;
    private javax.swing.JLabel lblNomUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JPanel pnlCabezera;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JRadioButton rbtnFiltro;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
