/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import com.itextpdf.text.pdf.qrcode.QRCode;
import java.awt.Desktop;
import java.io.File;

/**
 *
 * @author Sebastian
 */
public class Codigo_qr extends javax.swing.JFrame {

    int udm=0, resol=1080, rot=0;
    float mi=0.000f, md =0.000f, ms=0.000f, min=0.000f, tam=25.00f;
    
    
    /**
     * Creates new form Codigo_qr
     */
    public Codigo_qr() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void generarQr(String dato){
    try{
        
        com.barcodelib.barcode.QRCode c=new com.barcodelib.barcode.QRCode();
        c.setData(dato);
        c.setDataMode(com.barcodelib.barcode.QRCode.MODE_BYTE);
        c.setUOM(udm);
        c.setLeftMargin(mi);
        c.setRightMargin(md);
        c.setTopMargin(ms);
        c.setBottomMargin(min);
        c.setResolution(resol);
        c.setRotate(rot);
        c.setModuleSize(tam);
        
        String archivo= System.getProperty("user.home")+"/qrsistemas.gif";
        c.renderBarcode(archivo);
        
        Desktop d = Desktop.getDesktop();
        d.open(new File(archivo));
        
        
        
    
    }catch(Exception e){
        System.out.println("Error " + e);
    }
    
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
        gen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ir a la pagina web");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, 52));

        gen.setFont(new java.awt.Font("SFNS Display", 0, 18)); // NOI18N
        gen.setText("Generar codigo QR");
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        getContentPane().add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 270, 55));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, 30));

        txt.setText("https://velontime.000webhostapp.com/");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
       String campo= txt.getText();
       generarQr(campo);        // TODO add your handling code here:
    }//GEN-LAST:event_genActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       Quien ob48 = new Quien();
       ob48.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Codigo_qr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codigo_qr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codigo_qr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codigo_qr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigo_qr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
