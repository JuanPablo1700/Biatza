/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


        

/**
 *
 * @author arlet
 */
public class Ventana_Pedido_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Usuario_Principal
     */
    public String Actual_Nombre_Usuario,Actual_Apellido_Usuario,Actual_Telefono,Actual_U,Actual_C,
            Actual_Correo,Actual_Direccion,Actual_Cargo,Actual_Fecha,Actual_Status;
    private DefaultTableModel m = new DefaultTableModel();
    private ConeccionBD CBD = new ConeccionBD();
    
    
    /**
     * Creates new form Ventana_Usuario_Principal
     */
    private void mandaInfoIPP(Interfaz_Principal vtn){
        vtn.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
        vtn.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
        vtn.Actual_Telefono=Actual_Telefono;
        vtn.Actual_U=Actual_U;
        vtn.Actual_C=Actual_C;
        vtn.Actual_Correo=Actual_Correo;
        vtn.Actual_Direccion=Actual_Direccion;
        vtn.Actual_Cargo=Actual_Cargo;
        vtn.Actual_Fecha=Actual_Fecha;
        vtn.Actual_Status=Actual_Status;
        this.dispose();
        vtn.setVisible(true);
    }
    private void mandaInfoIPR(Ventana_Pedido_Registrar vtn){
        vtn.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
        vtn.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
        vtn.Actual_Telefono=Actual_Telefono;
        vtn.Actual_U=Actual_U;
        vtn.Actual_C=Actual_C;
        vtn.Actual_Correo=Actual_Correo;
        vtn.Actual_Direccion=Actual_Direccion;
        vtn.Actual_Cargo=Actual_Cargo;
        vtn.Actual_Fecha=Actual_Fecha;
        vtn.Actual_Status=Actual_Status;
        this.dispose();
        vtn.setVisible(true);
    }
    
    private void mandaInfoVPB(Ventana_Pedido_Eliminar vtn){
        vtn.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
        vtn.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
        vtn.Actual_Telefono=Actual_Telefono;
        vtn.Actual_U=Actual_U;
        vtn.Actual_C=Actual_C;
        vtn.Actual_Correo=Actual_Correo;
        vtn.Actual_Direccion=Actual_Direccion;
        vtn.Actual_Cargo=Actual_Cargo;
        vtn.Actual_Fecha=Actual_Fecha;
        vtn.Actual_Status=Actual_Status;
        this.dispose();
        vtn.setVisible(true);
    }
    
    private void mandaInfoVPC(Ventana_Pedido_Consultar vtn){
        vtn.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
        vtn.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
        vtn.Actual_Telefono=Actual_Telefono;
        vtn.Actual_U=Actual_U;
        vtn.Actual_C=Actual_C;
        vtn.Actual_Correo=Actual_Correo;
        vtn.Actual_Direccion=Actual_Direccion;
        vtn.Actual_Cargo=Actual_Cargo;
        vtn.Actual_Fecha=Actual_Fecha;
        vtn.Actual_Status=Actual_Status;
        this.dispose();
        vtn.setVisible(true);
    }
    private void mandaInfoVCS(Ventana_Pedido_Cambiar_Status vtn,int id){
        vtn.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
        vtn.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
        vtn.Actual_Telefono=Actual_Telefono;
        vtn.Actual_U=Actual_U;
        vtn.Actual_C=Actual_C;
        vtn.Actual_Correo=Actual_Correo;
        vtn.Actual_Direccion=Actual_Direccion;
        vtn.Actual_Cargo=Actual_Cargo;
        vtn.Actual_Fecha=Actual_Fecha;
        vtn.Actual_Status=Actual_Status;
        vtn.Actual_ID=id;
        this.dispose();
        vtn.setVisible(true);
    }
    
    public Ventana_Pedido_Principal() {
        initComponents();
    }

    public void inicializarVentana(){
        lblUsuario.setText(Actual_Cargo+": "+Actual_Nombre_Usuario+" "+Actual_Apellido_Usuario);
        
        m = (DefaultTableModel) tblPedidos.getModel();
        tblPedidos.setModel(m);
        String sql = "select p.ID_Pedido,u.nombre,p.Cliente_Tel_Cliente,p.Fecha,p.Hora,p.Total from pedido p inner join usuarios u on p.Usuarios_ID_Usuario=u.ID_Usuario where p.Status ='Activo';";
        Connection conectar = CBD.conectar();
        try{
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] O = new String[6];
            while(rs.next()){
                O[0] = rs.getString(1);
                O[1] = rs.getString(2);
                O[2] = rs.getString(3);
                O[3] = rs.getString(4);
                O[4] = rs.getString(5);
                O[5] = rs.getString(6);
                m.addRow(O);
            }
            conectar.close(); 
        }catch(Exception e){}
    }//En este metodo se inicializa la tabla y el label con los datos
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarUsuario = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCabezera = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        btnRegistrarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnConsultarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 583));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnEliminarUsuario.setBackground(new java.awt.Color(244, 241, 222));
        btnEliminarUsuario.setMaximumSize(new java.awt.Dimension(1270, 583));
        btnEliminarUsuario.setMinimumSize(new java.awt.Dimension(1270, 583));
        btnEliminarUsuario.setPreferredSize(new java.awt.Dimension(1270, 583));
        btnEliminarUsuario.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Pedidos pendientes de pago");
        btnEliminarUsuario.add(lblTitulo);
        lblTitulo.setBounds(0, 120, 1270, 58);

        pnlCabezera.setBackground(new java.awt.Color(224, 122, 95));
        pnlCabezera.setMaximumSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setMinimumSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setPreferredSize(new java.awt.Dimension(1270, 66));
        pnlCabezera.setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Administrador: Nombre_Usuario");
        pnlCabezera.add(lblUsuario);
        lblUsuario.setBounds(10, 20, 720, 30);

        btnCerrarSesion.setBackground(new java.awt.Color(224, 122, 95));
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesi??n");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(160, 40));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(160, 40));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(160, 40));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlCabezera.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(1080, 15, 160, 40);

        btnEliminarUsuario.add(pnlCabezera);
        pnlCabezera.setBounds(0, 0, 1270, 60);

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setActionCommand("Registrar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegresarMouseReleased(evt);
            }
        });
        btnEliminarUsuario.add(btnRegresar);
        btnRegresar.setBounds(880, 480, 170, 70);

        btnEliminarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarPedido.setText("Reclamaci??n de pedido");
        btnEliminarPedido.setActionCommand("Registrar");
        btnEliminarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });
        btnEliminarUsuario.add(btnEliminarPedido);
        btnEliminarPedido.setBounds(490, 480, 170, 70);

        btnRegistrarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarPedido.setText("Registrar Pedido");
        btnRegistrarPedido.setActionCommand("Registrar");
        btnRegistrarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidoActionPerformed(evt);
            }
        });
        btnEliminarUsuario.add(btnRegistrarPedido);
        btnRegistrarPedido.setBounds(290, 480, 170, 70);

        tblPedidos.setBackground(new java.awt.Color(244, 241, 222));
        tblPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPedido", "idUsuario", "Cliente Telefono", "Fecha", "Hora", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPedidos.getTableHeader().setReorderingAllowed(false);
        tblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPedidosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setResizable(false);
            tblPedidos.getColumnModel().getColumn(1).setResizable(false);
            tblPedidos.getColumnModel().getColumn(2).setResizable(false);
            tblPedidos.getColumnModel().getColumn(3).setResizable(false);
            tblPedidos.getColumnModel().getColumn(4).setResizable(false);
            tblPedidos.getColumnModel().getColumn(5).setResizable(false);
        }

        btnEliminarUsuario.add(jScrollPane1);
        jScrollPane1.setBounds(290, 210, 760, 250);

        btnConsultarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarPedido.setText("Consultar Pedido");
        btnConsultarPedido.setActionCommand("Registrar");
        btnConsultarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });
        btnEliminarUsuario.add(btnConsultarPedido);
        btnConsultarPedido.setBounds(690, 480, 170, 70);

        getContentPane().add(btnEliminarUsuario);
        btnEliminarUsuario.setBounds(0, 0, 1270, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidoActionPerformed
        Ventana_Pedido_Registrar vtn = new Ventana_Pedido_Registrar();
        mandaInfoIPR(vtn);
        
    }//GEN-LAST:event_btnRegistrarPedidoActionPerformed

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
        Ventana_Pedido_Eliminar vtn = new Ventana_Pedido_Eliminar();
        mandaInfoVPB(vtn);
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        Ventana_Acceso VA = new Ventana_Acceso();
        VA.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarVentana();
    }//GEN-LAST:event_formWindowOpened

    private void btnRegresarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseReleased
        Interfaz_Principal IA = new Interfaz_Principal();
        mandaInfoIPP(IA);
    }//GEN-LAST:event_btnRegresarMouseReleased

    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
        Ventana_Pedido_Consultar vtn = new Ventana_Pedido_Consultar();
        mandaInfoVPC(vtn);
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed

    private void tblPedidosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidosMouseReleased
        Ventana_Pedido_Cambiar_Status vtn = new Ventana_Pedido_Cambiar_Status();
        int r = Integer.parseInt(m.getValueAt(tblPedidos.getSelectedRow(), 0)+"");
        mandaInfoVCS(vtn,r);
    }//GEN-LAST:event_tblPedidosMouseReleased

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
            java.util.logging.Logger.getLogger(Ventana_Pedido_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedido_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Ventana_Pedido_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JPanel btnEliminarUsuario;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCabezera;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
