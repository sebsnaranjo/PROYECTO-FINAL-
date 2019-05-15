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
public final class Admon extends javax.swing.JFrame {

    /**
     * Creates new form Admon
     */
    public Admon() {
        initComponents();
        transparenciaBotones();
        this.setLocationRelativeTo(null);
        selec_mod.add(mod_gastro);
        selec_mod.add(mod_deco);
        selec_mod.add(mod_servi);
        selec_mod.add(mod_lugar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selec_mod = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        VOLVER_SELEC1 = new javax.swing.JButton();
        mod_gastro = new javax.swing.JRadioButton();
        mod_deco = new javax.swing.JRadioButton();
        mod_servi = new javax.swing.JRadioButton();
        mod_lugar = new javax.swing.JRadioButton();
        HACER_SELEC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVEEDOR DE:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 39));

        VOLVER_SELEC1.setText("Volver");
        VOLVER_SELEC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOLVER_SELEC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVER_SELEC1MouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER_SELEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 70, 30));

        mod_gastro.setText("Gastronomia");
        mod_gastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mod_gastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32395greensalad_98843.png"))); // NOI18N
        getContentPane().add(mod_gastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));

        mod_deco.setText("Decoración");
        mod_deco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mod_deco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4_balloon_decoration_christmas_xmas_celebration_party_icon-icons.com_77039.png"))); // NOI18N
        getContentPane().add(mod_deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        mod_servi.setText("Servicios");
        mod_servi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mod_servi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        getContentPane().add(mod_servi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 150, 60));

        mod_lugar.setText("Lugar");
        mod_lugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mod_lugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/location_map_directions_geography_gps_icon-icons.com_55988.png"))); // NOI18N
        getContentPane().add(mod_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, -1));

        HACER_SELEC.setText("Aceptar");
        HACER_SELEC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HACER_SELEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HACER_SELECMouseClicked(evt);
            }
        });
        getContentPane().add(HACER_SELEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparenciaBotones(){
    
        mod_gastro.setOpaque(false);
        mod_gastro.setContentAreaFilled(false);
        mod_gastro.setBorderPainted(true);
        
        mod_deco.setOpaque(false);
        mod_deco.setContentAreaFilled(false);
        mod_deco.setBorderPainted(true);
        
        mod_servi.setOpaque(false);
        mod_servi.setContentAreaFilled(false);
        mod_servi.setBorderPainted(true);
        
        mod_lugar.setOpaque(false);
        mod_lugar.setContentAreaFilled(false);
        mod_lugar.setBorderPainted(true);
        
        
    }
    
    
    private void VOLVER_SELEC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVER_SELEC1MouseClicked
        proveedor ob13 = new proveedor();
        ob13.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VOLVER_SELEC1MouseClicked

    private void HACER_SELECMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HACER_SELECMouseClicked
        
          crear_prov ob13 = new crear_prov();
        
        if(mod_gastro.isSelected()){
            ob13.setVisible(true);
            this.setVisible(false);
            ob13.gastronomia();
        }
         if(mod_deco.isSelected()){
            ob13.setVisible(true);
            this.setVisible(false);
            ob13.decoracion();
        }
        if(mod_servi.isSelected()){
            ob13.setVisible(true);
            this.setVisible(false);
            ob13.servicios();
        }
        if(mod_lugar.isSelected()){
            ob13.setVisible(true);
            this.setVisible(false);
            ob13.lugar();
        }
    }//GEN-LAST:event_HACER_SELECMouseClicked

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
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HACER_SELEC;
    private javax.swing.JButton VOLVER_SELEC1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton mod_deco;
    private javax.swing.JRadioButton mod_gastro;
    private javax.swing.JRadioButton mod_lugar;
    private javax.swing.JRadioButton mod_servi;
    private javax.swing.ButtonGroup selec_mod;
    // End of variables declaration//GEN-END:variables
}