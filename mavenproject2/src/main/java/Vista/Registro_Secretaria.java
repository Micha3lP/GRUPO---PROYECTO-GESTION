
package Vista;

import Conexion.Conexion;
import Modelo.Secretario;
import Modelo.Usuario;
import java.sql.CallableStatement;
import controlador.CamposController;
import controlador.RegistroSecretariaController;
import controlador.TablasRegistroController;
import controlador.VentanasController;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * Formulario de Registro de Secretario
 * @author User
 */
public class Registro_Secretaria extends javax.swing.JFrame {
    int id_com;
/**
 * Inicializacion de formulario de Registro de Secretario
 */
    public Registro_Secretaria() {
        initComponents();
         this.setLocationRelativeTo(null);
        CamposController.mostrarnombreventana(jblregistrosecretaria,jpanelbackground);
        TablasRegistroController.llenarTablaComunidadByCiudad(tblcomunidad, cbmciudadsecretaria);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jpanelbackground = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbmciudadsecretaria = new javax.swing.JComboBox<>();
        cmbsexosecretaria = new javax.swing.JComboBox<>();
        txtci_secretaria = new javax.swing.JTextField();
        txtnom_secretaria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion_secretaria = new javax.swing.JTextField();
        btnRegistrar_director = new javax.swing.JButton();
        btnCancelar_registro_secretaria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtedadsecretaria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcontactosecretaria = new javax.swing.JTextField();
        txtusuariosecretaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcontraseñasecretaria = new javax.swing.JTextField();
        jblregistrosecretaria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        txtidComunidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setForeground(java.awt.Color.black);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 100, 40));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("PERFIL\n");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 100, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 100, 40));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 195, -1, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("C.I. SECRETARIA:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 302, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("SEXO:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 356, -1, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("CIUDAD:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 423, -1, 20));

        cbmciudadsecretaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayaquil", "machala", "quevedo" }));
        cbmciudadsecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmciudadsecretaria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmciudadsecretariaItemStateChanged(evt);
            }
        });
        jpanelbackground.add(cbmciudadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 424, 140, 20));

        cmbsexosecretaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        cmbsexosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(cmbsexosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 357, 140, 20));

        txtci_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_secretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_secretariaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtci_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 303, 210, 20));

        txtnom_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_secretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnom_secretariaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtnom_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 196, 210, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 248, -1, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("NOMBRE DE USUARIO:");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 302, -1, 20));

        txtDireccion_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtDireccion_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 249, 210, 20));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 730, 170, 40));

        btnCancelar_registro_secretaria.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar_registro_secretaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_secretaria.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_secretaria.setText("CANCELAR");
        btnCancelar_registro_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_secretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_secretariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_secretariaMouseExited(evt);
            }
        });
        btnCancelar_registro_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_secretariaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnCancelar_registro_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 160, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("EDAD:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 249, -1, -1));

        txtedadsecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadsecretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadsecretariaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtedadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 244, 60, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("CONTACTO:");
        jpanelbackground.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 196, -1, -1));

        txtcontactosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtcontactosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 197, 210, -1));

        txtusuariosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtusuariosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 304, 210, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("CONTRASEÑA:");
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 357, -1, -1));

        txtcontraseñasecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtcontraseñasecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 358, 210, -1));

        jblregistrosecretaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistrosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 220, 20));

        tblcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblcomunidad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblcomunidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblcomunidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcomunidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcomunidad);

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 820, 191));

        txtidComunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidComunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidComunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidComunidad.setEnabled(false);
        jpanelbackground.add(txtidComunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 473, 60, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 479, -1, -1));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("REGISTRO SECRETARIO/A");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 86, 660, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 100px.png"))); // NOI18N
        jpanelbackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 100, 90));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 300px.png"))); // NOI18N
        jpanelbackground.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 200px.png"))); // NOI18N
        jpanelbackground.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, -1, -1));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(true);
        Submenu_Registro submenuregistro = new Submenu_Registro();
        submenuregistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCancelar_registro_secretariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaMouseEntered
        CamposController.setColor(btnCancelar_registro_secretaria);
    }//GEN-LAST:event_btnCancelar_registro_secretariaMouseEntered

    private void btnCancelar_registro_secretariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaMouseExited
        CamposController.resetColor(btnCancelar_registro_secretaria);
    }//GEN-LAST:event_btnCancelar_registro_secretariaMouseExited

    private void btnCancelar_registro_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaActionPerformed
    VentanasController.cerrarRegistro_Secretaria();
    VentanasController.abrirInicio();        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_secretariaActionPerformed

    private void btnRegistrar_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_directorActionPerformed
      RegistroSecretariaController.registrarSecretario(new Secretario(txtidComunidad.getText(), txtnom_secretaria.getText(), Integer.parseInt(txtedadsecretaria.getText()), txtci_secretaria.getText(), cmbsexosecretaria.getSelectedItem().toString(), txtcontactosecretaria.getText(), cbmciudadsecretaria.getSelectedItem().toString(), txtDireccion_secretaria.getText()), new Usuario(txtusuariosecretaria.getText(), txtcontraseñasecretaria.getText(), 2));
      CamposController.limpiar(jpanelbackground);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_directorActionPerformed

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
        int row=tblcomunidad.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
            txtidComunidad.setText(String.valueOf(id_com));
        }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void cbmciudadsecretariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmciudadsecretariaItemStateChanged
        TablasRegistroController.llenarTablaComunidadByCiudad(tblcomunidad, cbmciudadsecretaria);       // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudadsecretariaItemStateChanged

    private void txtci_secretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_secretariaKeyTyped
 if(txtci_secretaria.getText().length() >=10 || !Character.isDigit(evt.getKeyChar())){
         evt.consume();
        }        
    }//GEN-LAST:event_txtci_secretariaKeyTyped

    private void txtedadsecretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadsecretariaKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) || txtedadsecretaria.getText().length()>=3){
        evt.consume();
        }
    }//GEN-LAST:event_txtedadsecretariaKeyTyped

    private void txtnom_secretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_secretariaKeyTyped
          if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtnom_secretariaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_secretaria;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_director;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmciudadsecretaria;
    private javax.swing.JComboBox<String> cmbsexosecretaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrosecretaria;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDireccion_secretaria;
    private javax.swing.JTextField txtci_secretaria;
    private javax.swing.JTextField txtcontactosecretaria;
    private javax.swing.JTextField txtcontraseñasecretaria;
    private javax.swing.JTextField txtedadsecretaria;
    private javax.swing.JTextField txtidComunidad;
    private javax.swing.JTextField txtnom_secretaria;
    private javax.swing.JTextField txtusuariosecretaria;
    // End of variables declaration//GEN-END:variables
}
