package Proyecto;

import java.awt.Color;
import java.sql.Connection;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GenerarReporteVenta extends javax.swing.JFrame {

    /**
     * Creates new form RetiroEfectivo
     */
    public GenerarReporteVenta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public String Actual_Nombre_Usuario, Actual_Apellido_Usuario, Actual_Cargo;

    public String sql;

    private ConeccionBD CBD = new ConeccionBD();
    Connection conectar = CBD.conectar();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarReporteVenta().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlClaro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteVentas = new javax.swing.JTable();
        rbFiltro = new javax.swing.JRadioButton();
        lblDia1 = new javax.swing.JLabel();
        lblDia2 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        tel_Cliente = new javax.swing.JTextField();
        pnlNaranja = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        txt_Nombre = new javax.swing.JTextField();
        fecha1 = new javax.swing.JTextField();
        fecha2 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1270, 583));
        setMinimumSize(new java.awt.Dimension(1270, 583));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1270, 583));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlClaro.setBackground(new java.awt.Color(244, 241, 222));
        pnlClaro.setMaximumSize(new java.awt.Dimension(1270, 583));
        pnlClaro.setMinimumSize(new java.awt.Dimension(1270, 583));
        pnlClaro.setPreferredSize(new java.awt.Dimension(1270, 583));
        pnlClaro.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Generar reporte de ventas");
        pnlClaro.add(jLabel7);
        jLabel7.setBounds(-1, 90, 1270, 58);

        tblReporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num_Venta", "Usuario", "Fecha", "Cliente", "Monto total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporteVentas);
        if (tblReporteVentas.getColumnModel().getColumnCount() > 0) {
            tblReporteVentas.getColumnModel().getColumn(0).setResizable(false);
            tblReporteVentas.getColumnModel().getColumn(1).setResizable(false);
            tblReporteVentas.getColumnModel().getColumn(2).setResizable(false);
            tblReporteVentas.getColumnModel().getColumn(3).setResizable(false);
            tblReporteVentas.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlClaro.add(jScrollPane1);
        jScrollPane1.setBounds(230, 250, 780, 210);

        rbFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbFiltro.setText("Filtrar por fecha");
        rbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFiltroActionPerformed(evt);
            }
        });
        pnlClaro.add(rbFiltro);
        rbFiltro.setBounds(230, 160, 149, 31);

        lblDia1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDia1.setText("Filtrar del día:");
        pnlClaro.add(lblDia1);
        lblDia1.setBounds(430, 160, 110, 30);

        lblDia2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDia2.setText("Al dia:");
        pnlClaro.add(lblDia2);
        lblDia2.setBounds(770, 160, 60, 30);

        btnImprimir.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        pnlClaro.add(btnImprimir);
        btnImprimir.setBounds(540, 470, 170, 70);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setActionCommand("Registrar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlClaro.add(btnConsultar);
        btnConsultar.setBounds(230, 470, 170, 70);

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setActionCommand("Registrar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlClaro.add(btnRegresar);
        btnRegresar.setBounds(840, 470, 170, 70);

        tel_Cliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tel_Cliente.setForeground(new java.awt.Color(102, 102, 102));
        tel_Cliente.setText("Telefono del cliente.");
        tel_Cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tel_ClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tel_ClienteFocusLost(evt);
            }
        });
        tel_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_ClienteActionPerformed(evt);
            }
        });
        pnlClaro.add(tel_Cliente);
        tel_Cliente.setBounds(800, 210, 202, 28);

        pnlNaranja.setBackground(new java.awt.Color(224, 122, 95));
        pnlNaranja.setMaximumSize(new java.awt.Dimension(1270, 66));
        pnlNaranja.setMinimumSize(new java.awt.Dimension(1270, 66));
        pnlNaranja.setPreferredSize(new java.awt.Dimension(1270, 66));
        pnlNaranja.setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Administrador: Nombre_Usuario");
        pnlNaranja.add(lblUsuario);
        lblUsuario.setBounds(10, 15, 680, 30);

        btnCerrarSesion.setBackground(new java.awt.Color(224, 122, 95));
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
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
        pnlNaranja.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(1080, 15, 160, 40);

        pnlClaro.add(pnlNaranja);
        pnlNaranja.setBounds(0, 0, 1270, 66);

        txt_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_Nombre.setText("Nombre del Usuario");
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });
        pnlClaro.add(txt_Nombre);
        txt_Nombre.setBounds(230, 210, 202, 28);

        fecha1.setText("YYYY-MM-DD");
        fecha1.setEnabled(false);
        pnlClaro.add(fecha1);
        fecha1.setBounds(550, 160, 170, 30);

        fecha2.setText("YYYY-MM-DD");
        fecha2.setEnabled(false);
        pnlClaro.add(fecha2);
        fecha2.setBounds(840, 160, 170, 30);

        getContentPane().add(pnlClaro);
        pnlClaro.setBounds(0, 0, 1270, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Escritorio/ReporteVentas.pdf"));
            documento.open();

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Num. Venta");
            tabla.addCell("Usuario");
            tabla.addCell("Fecha");
            tabla.addCell("Cliente");
            tabla.addCell("Monto Total");

            try {
                Connection conectar = CBD.conectar();
                Statement st = conectar.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                }
                documento.add(tabla);
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        Ventana_Acceso VA = new Ventana_Acceso();
        VA.setVisible(true);

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void rbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFiltroActionPerformed
        if (rbFiltro.isSelected()){
            fecha1.setEnabled(true);
            fecha2.setEnabled(true);
        }else{
            fecha1.setEnabled(false);
            fecha2.setEnabled(false);
        }
    }//GEN-LAST:event_rbFiltroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MandaInfoIP();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tel_ClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tel_ClienteFocusGained
        if(tel_Cliente.getText().equals("Telefono del cliente.")){
            tel_Cliente.setText("");
            tel_Cliente.setForeground(Color.black);
        }
    }//GEN-LAST:event_tel_ClienteFocusGained

    private void tel_ClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tel_ClienteFocusLost
        if(tel_Cliente.getText().equals("")){
            tel_Cliente.setText("Telefono del cliente.");
            tel_Cliente.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_tel_ClienteFocusLost

    private void tel_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_ClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblUsuario.setText(Actual_Cargo+": "+Actual_Nombre_Usuario+" "+Actual_Apellido_Usuario);
    }//GEN-LAST:event_formWindowOpened

    private void txt_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusGained
        if(txt_Nombre.getText().equals("Nombre del Usuario")){
            txt_Nombre.setText("");
            txt_Nombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_NombreFocusGained

    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        if(txt_Nombre.getText().equals("")){
            txt_Nombre.setText("Nombre del Usuario");
            txt_Nombre.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txt_NombreFocusLost

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String usuario = txt_Nombre.getText();
        String tel = tel_Cliente.getText();
        if (rbFiltro.isSelected()) {
            if (ValidaFecha(fecha1.getText()) && ValidaFecha(fecha1.getText())) {
                String fec_Inicio = fecha1.getText();
                String fec_Fin = fecha2.getText();
                if (!usuario.equals("Nombre del Usuario") && tel.equals("Telefono del cliente.")) {
                    sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where (p.Fecha between '" + fec_Inicio + "'" + " AND " + "'" + fec_Fin + "') AND u.Nombre = '" + usuario + "'";
                } else if (usuario.equals("Nombre del Usuario") && !tel.equals("Telefono del cliente.")) {
                    sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where (p.Fecha between '" + fec_Inicio + "'" + " AND " + "'" + fec_Fin + "') AND c.Tel_Cliente = '" + tel + "'";
                } else if (!usuario.equals("Nombre del Usuario") && !tel.equals("Telefono del cliente.")) {
                    sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where (p.Fecha between '" + fec_Inicio + "'" + " AND " + "'" + fec_Fin + "') AND u.Nombre = '" + usuario + "' AND c.Tel_Cliente = '" + tel + "'";
                } else {
                    sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where p.Fecha between '" + fec_Inicio + "'" + " AND " + "'" + fec_Fin + "'";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha invalida. Formato[YYYY-MM-dd]");
            }
        } else if (!usuario.equals("Nombre del Usuario") && tel.equals("Telefono del cliente.")) {
            sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where u.Nombre = '" + usuario + "'";
        } else if (usuario.equals("Nombre del Usuario") && !tel.equals("Telefono del cliente.")) {
            sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where c.Tel_Cliente = '" + tel + "'";
        } else if (!usuario.equals("Nombre del Usuario") && !tel.equals("Telefono del cliente.")) {
            sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente) where u.Nombre = '" + usuario + "' AND c.Tel_Cliente = '" + tel + "'";
        } else {
            sql = "SELECT p.ID_Pedido, u.Nombre, p.Fecha, c.Nom_Cliente, p.Total FROM pedido p INNER JOIN usuarios u ON (p.Usuarios_ID_Usuario = u.ID_Usuario) INNER JOIN cliente c ON (p.cliente_Tel_Cliente = c.Tel_Cliente)";
        }

        try {
            limpiarTabla();
            DefaultTableModel mod = (DefaultTableModel) tblReporteVentas.getModel();
            tblReporteVentas.setModel(mod);
            String[] Datos = new String[5];
            try {
                Connection conectar = CBD.conectar();
                Statement st = conectar.createStatement();
                ResultSet rs = st.executeQuery(sql);
                System.out.println(sql);
                while (rs.next()) {
                    Datos[0] = rs.getString(1);
                    Datos[1] = rs.getString(2);
                    Datos[2] = rs.getString(3);
                    Datos[3] = rs.getString(4);
                    Datos[4] = rs.getString(5);

                    mod.addRow(Datos);
                }
                btnImprimir.setEnabled(true);
                conectar.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla." + e);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla1." + e);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * Metodo para eliminar todas las filas de la tabla
     */
    public void limpiarTabla() {
        try {
            //System.out.println("Limpiando tabla");
            DefaultTableModel mod = (DefaultTableModel) tblReporteVentas.getModel();
            int a = tblReporteVentas.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                mod.removeRow(mod.getRowCount() - 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    /**
     * Metodo para validar si una fecha es correcta
     * @param fecha
     * @return true si la fecha que se valido es correcta
     */
    private boolean ValidaFecha(String fecha) {
        if (fecha == null || !fecha.matches("\\d{4}-[01]\\d-[0-3]\\d")) {
            return false;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(false);
        try {
            df.parse(fecha);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    
    /**
     * Metodo para mandar el nombre del usuario actual en el sistema
     */
    private void MandaInfoIP(){
        Interfaz_Principal IP = new Interfaz_Principal();
            IP.Actual_Nombre_Usuario=Actual_Nombre_Usuario;
            IP.Actual_Apellido_Usuario=Actual_Apellido_Usuario;
            IP.Actual_Cargo=Actual_Cargo;
            this.dispose();
            IP.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField fecha1;
    private javax.swing.JTextField fecha2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia1;
    private javax.swing.JLabel lblDia2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlClaro;
    private javax.swing.JPanel pnlNaranja;
    private javax.swing.JRadioButton rbFiltro;
    private javax.swing.JTable tblReporteVentas;
    private javax.swing.JTextField tel_Cliente;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}