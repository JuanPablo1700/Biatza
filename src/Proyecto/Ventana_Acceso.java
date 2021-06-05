/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ventana_Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Acceso
     */
    public Ventana_Acceso() {
        initComponents();
    }
    private String sql;
    private final ConeccionBD CBD = new ConeccionBD();
    
    public String Actual_Nombre_Usuario,Actual_Apellido_Usuario,Actual_Telefono,Actual_U,Actual_C,
            Actual_Correo,Actual_Direccion,Actual_Cargo,Actual_Fecha,Actual_Status;
    private Interfaz_Principal IP = new Interfaz_Principal();
    
    private void ValidaUsuario(){
        String usuario = txtUsuario.getText();
        String contraseña=String.valueOf(txtContraseña.getPassword());
        int res=0;
            sql = "select * from usuarios where Nom_Usuario='"+usuario+"' and Contraseña='"+contraseña+"'";
            try {
                Connection conectar = CBD.conectar();
                Statement st = conectar.createStatement();
                ResultSet rs = st.executeQuery(sql);
                try {
                    while (rs.next()){
                        res=1;
                        Actual_Nombre_Usuario = rs.getString(2);
                        Actual_Apellido_Usuario = rs.getString(3);
                        Actual_Telefono= rs.getString(4);
                        Actual_U = rs.getString(5);
                        Actual_C = rs.getString(6);
                        Actual_Correo= rs.getString(7);
                        Actual_Direccion= rs.getString(8);
                        Actual_Cargo= rs.getString(9);
                        Actual_Fecha= rs.getString(10);
                        Actual_Status= rs.getString(11);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana_Acceso.class.getName()).log(Level.SEVERE, null, ex);
                }
              conectar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error.");
        }
           
            //System.out.println(Nombre_Usuario+" "+Apellido_Usuario+" "+Telefono+" "+U+" "+C+" "+Correo+" "+Direccion+" "+Cargo+" "+Fecha+" "+Status);
            if(res==1){
                MandaInfoIP();                
                this.dispose();
                IP.setVisible(true);
                //JOptionPane.showMessageDialog(null, "Bienvenido: " +Nombre_Usuario+ " " + Apellido_Usuario+" "
                //+Cargo+" "+Status);
            }else
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        
    }
    
    private void MandaInfoIP(){
        
            IP.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
            IP.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
            IP.Actual_Telefono=Actual_Telefono;
            IP.Actual_U=Actual_U;
            IP.Actual_C=Actual_C;
            IP.Actual_Correo=Actual_Correo;
            IP.Actual_Direccion=Actual_Direccion;
            IP.Actual_Cargo=Actual_Cargo;
            IP.Actual_Fecha=Actual_Fecha;
            IP.Actual_Status=Actual_Status;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setPreferredSize(new java.awt.Dimension(530, 500));
        pnlFondo.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Biatza");
        lblTitulo.setNextFocusableComponent(txtUsuario);
        pnlFondo.add(lblTitulo);
        lblTitulo.setBounds(0, 40, 350, 50);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setText("Usuario.");
        txtUsuario.setToolTipText("Usuario");
        txtUsuario.setName("Usuario"); // NOI18N
        txtUsuario.setNextFocusableComponent(txtContraseña);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        pnlFondo.add(txtUsuario);
        txtUsuario.setBounds(40, 170, 270, 40);

        btnAcceder.setBackground(new java.awt.Color(204, 204, 204));
        btnAcceder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAcceder);
        btnAcceder.setBounds(200, 320, 110, 40);

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSalir);
        btnSalir.setBounds(40, 320, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RebanadaPizza50x50.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        pnlFondo.add(jLabel2);
        jLabel2.setBounds(140, 90, 60, 70);

        txtContraseña.setText("Contraseña.");
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        pnlFondo.add(txtContraseña);
        txtContraseña.setBounds(40, 240, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        pnlFondo.add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 400);

        getContentPane().add(pnlFondo);
        pnlFondo.setBounds(0, 0, 350, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        try {
            ValidaUsuario();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if(txtUsuario.getText().equals("Usuario.")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().equals("")){
            txtUsuario.setText("Usuario.");
            txtUsuario.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        String C=String.valueOf(txtContraseña.getPassword());
        if(C.equals("Contraseña.")){
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
            ValidaUsuario();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        String C=String.valueOf(txtContraseña.getPassword());
        if(C.equals("")){
            txtContraseña.setText("Contraseña.");
            txtContraseña.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Ventana_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Acceso().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
