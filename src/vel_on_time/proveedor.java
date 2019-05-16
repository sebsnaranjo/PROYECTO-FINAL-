/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

/**
 *
 * @author jose noel mantilla
 */
public class proveedor extends javax.swing.JFrame {

    /**
     * Creates new form proveedor
     */
    public proveedor() {
        initComponents();
        transparenciaBotones();
        this.setLocationRelativeTo(null);
        ELEC_DESEOS.add(SELEC_CREAR);
        ELEC_DESEOS.add(SELEC_MODIFI);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ELEC_DESEOS = new javax.swing.ButtonGroup();
        SELEC_MODIFI = new javax.swing.JRadioButton();
        SELEC_CREAR = new javax.swing.JRadioButton();
        MAKE = new javax.swing.JButton();
        DESEO = new javax.swing.JLabel();
        VOLVER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SELEC_MODIFI.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        SELEC_MODIFI.setText("Modificar");
        SELEC_MODIFI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SELEC_MODIFI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/databaseprocess_basededatos_12922.png"))); // NOI18N
        getContentPane().add(SELEC_MODIFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, -1));

        SELEC_CREAR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        SELEC_CREAR.setText("Crear");
        SELEC_CREAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SELEC_CREAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/database_add_12927.png"))); // NOI18N
        getContentPane().add(SELEC_CREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, -1));

        MAKE.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        MAKE.setText("Aceptar");
        MAKE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MAKE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAKEMouseClicked(evt);
            }
        });
        MAKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAKEActionPerformed(evt);
            }
        });
        getContentPane().add(MAKE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 90, 30));

        DESEO.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DESEO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESEO.setText("¿QUE DESEA HACER CON LOS PROVEEDORES?");
        getContentPane().add(DESEO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 50));

        VOLVER.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        VOLVER.setText("Volver");
        VOLVER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOLVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVERMouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparenciaBotones(){
    
        SELEC_MODIFI.setOpaque(false);
        SELEC_MODIFI.setContentAreaFilled(false);
        SELEC_MODIFI.setBorderPainted(true);
        SELEC_CREAR.setOpaque(false);
        SELEC_CREAR.setContentAreaFilled(false);
        SELEC_CREAR.setBorderPainted(true);
    }
    
    private void MAKEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKEMouseClicked
        Mod_selec ob16 = new Mod_selec();
        Admon ob17 = new Admon();
        if(SELEC_MODIFI.isSelected()){
            ob16.setVisible(true);
            this.setVisible(false);
                          
        }
        if(SELEC_CREAR.isSelected()){
            ob17.setVisible(true);
            this.setVisible(false);
                          
        }
    }//GEN-LAST:event_MAKEMouseClicked

    private void VOLVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVERMouseClicked
        Empleado ob19 = new Empleado();
        ob19.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VOLVERMouseClicked

    private void MAKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAKEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAKEActionPerformed

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
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DESEO;
    private javax.swing.ButtonGroup ELEC_DESEOS;
    private javax.swing.JButton MAKE;
    private javax.swing.JRadioButton SELEC_CREAR;
    private javax.swing.JRadioButton SELEC_MODIFI;
    private javax.swing.JButton VOLVER;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
