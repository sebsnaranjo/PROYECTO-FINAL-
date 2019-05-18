/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose noel mantilla
 */
public class cotizacion_finalll extends javax.swing.JFrame {

private int gastro2;
private int deco2;
private int serv2;
private int lug2;
private String fecha2;
private int base_gastro;
private int base_deco;
private int base_serv;
private int base_lug;
private int id2;
private  int tot_fin;
private String nombre2;
private int presupuesto2;
private int numIn2;
private String art_gastro;
private String art_deco;
private String art_serv;
private String art_lug;
 String gastro_fin;
 String deco_fin;
 String serv_fin;
 String lug_fin;
 String dia_fin;
 String mes_fin;
 String ano_fin;
 String base_gastro_fin;
 String base_deco_fin;
 String base_serv_fin;
 String base_lug_fin;

private int gastro_desc;
private int deco_desc;
private int serv_desc;
private int lug_desc;



    /**
     * Creates new form cotizacion_final
     */
    public cotizacion_finalll() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tit_cot = new javax.swing.JLabel();
        tit_gastro = new javax.swing.JLabel();
        tit_deco = new javax.swing.JLabel();
        tit_serv = new javax.swing.JLabel();
        tit_lug = new javax.swing.JLabel();
        rev_tot_gastro = new javax.swing.JTextField();
        rev_tot_deco = new javax.swing.JTextField();
        rev_tot_serv = new javax.swing.JTextField();
        rev_tot_lug = new javax.swing.JTextField();
        tit_fecha = new javax.swing.JLabel();
        rev_fecha = new javax.swing.JTextField();
        finalizar_cliente = new javax.swing.JButton();
        otra_cot = new javax.swing.JButton();
        final_cot = new javax.swing.JTextField();
        tit_final = new javax.swing.JLabel();
        ver_cot = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tit_cot.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        tit_cot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit_cot.setText("COTIZACION DEL CLIENTE");
        tit_cot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tit_cot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 540, 60));

        tit_gastro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_gastro.setText("Gastronomia total:");
        getContentPane().add(tit_gastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 20));

        tit_deco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_deco.setText("Decoración total:");
        getContentPane().add(tit_deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        tit_serv.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_serv.setText("Servicios total:");
        getContentPane().add(tit_serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 20));

        tit_lug.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_lug.setText("Lugar total:");
        getContentPane().add(tit_lug, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 20));

        rev_tot_gastro.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        getContentPane().add(rev_tot_gastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 131, -1));

        rev_tot_deco.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        rev_tot_deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rev_tot_decoActionPerformed(evt);
            }
        });
        getContentPane().add(rev_tot_deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 131, -1));

        rev_tot_serv.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        getContentPane().add(rev_tot_serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 131, -1));

        rev_tot_lug.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        getContentPane().add(rev_tot_lug, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 131, -1));

        tit_fecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit_fecha.setText("Fecha del evento");
        getContentPane().add(tit_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 170, 20));

        rev_fecha.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        getContentPane().add(rev_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 178, -1));

        finalizar_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        finalizar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/printer_print_22133.png"))); // NOI18N
        finalizar_cliente.setText("Imprimir contrato de esta");
        finalizar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizar_clienteMouseClicked(evt);
            }
        });
        getContentPane().add(finalizar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 220, 30));

        otra_cot.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        otra_cot.setText("Hacer otra cotización");
        otra_cot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otra_cotMouseClicked(evt);
            }
        });
        getContentPane().add(otra_cot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 30));

        final_cot.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(final_cot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 180, -1));

        tit_final.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tit_final.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit_final.setText("Final");
        getContentPane().add(tit_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 180, -1));

        ver_cot.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ver_cot.setText("Ver cotizaciones");
        ver_cot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_cotMouseClicked(evt);
            }
        });
        getContentPane().add(ver_cot, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 130, 30));

        volver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rev_tot_decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rev_tot_decoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rev_tot_decoActionPerformed

    private void ver_cotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_cotMouseClicked
       todas_cot ob30 = new todas_cot();
        System.out.println(id2 +"a");
       ob30.buscar(id2,nombre2,presupuesto2,numIn2,fecha2);
       ob30.setVisible(true);
       this.setVisible(false);
       archivoos ob32 = new archivoos();
       ob32.atccod(id2, nombre2, numIn2, fecha2, gastro2, deco2, serv2, lug2,tot_fin , art_gastro, art_deco, art_serv, art_lug,presupuesto2);
       
    }//GEN-LAST:event_ver_cotMouseClicked

    private void otra_cotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otra_cotMouseClicked
            archivoos ob32 = new archivoos();
            this.setVisible(false);
            ob32.atccod(id2, nombre2, numIn2, fecha2, gastro2, deco2, serv2, lug2,tot_fin , art_gastro, art_deco, art_serv, art_lug,presupuesto2);
    }//GEN-LAST:event_otra_cotMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void finalizar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizar_clienteMouseClicked
        archivoos ob38 = new archivoos();
        contabilidad ob46 = new contabilidad();
        String pres= Integer.toString(presupuesto2);
        String gastro2p= Integer.toString(gastro2);
        String deco2p= Integer.toString(deco2);
        String serv2p= Integer.toString(serv2);
        String lug2p= Integer.toString(lug2);
        String fin = Integer.toString(tot_fin );
        String id2p= Integer.toString(id2);
        String numIn2p= Integer.toString(numIn2);
      
   ob46.llegada_falsa(art_gastro, art_deco, art_serv, art_lug);
 ob38.cot_totales(id2p,nombre2,pres,numIn2p, fecha2, fin, gastro2p, deco2p, serv2p,lug2p, art_gastro, art_deco, art_serv, art_lug,gastro_desc,deco_desc,lug_desc,serv_desc); 
   
    try {
        ob38.generarPDF(id2p,nombre2,pres,numIn2p, fecha2, fin, gastro2p, deco2p, serv2p,lug2p, art_gastro, art_deco, art_serv, art_lug);
    } catch (DocumentException ex) {
        Logger.getLogger(cotizacion_finalll.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(cotizacion_finalll.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_finalizar_clienteMouseClicked
    public void llegada_oculta(int id,String nombre,int presupuesto,int numIn,String fecha){
        System.out.println(id+"c");
        id2=id;
        nombre2=nombre;
        presupuesto2=presupuesto;
        numIn2=numIn;
        fecha2=fecha;
        System.out.println(id+"b");
        this.id2=id2;
        this.nombre2=nombre2;
        this.presupuesto2=presupuesto2;
        this.numIn2=numIn2;
        this.fecha2=fecha2;
      
    }
    public void llegada_fantasma(String gastro, String deco, String serv, String lugar){
        art_gastro=gastro;
        art_deco=deco;
        art_serv=serv;
        art_lug=lugar;
        
        this.art_deco=art_deco;
        this.art_gastro=art_gastro;
        this.art_lug=art_lug;
        this.art_serv=art_serv;
    }
    public void llegada_final(int prec_gastro, int prec_deco,int prec_serv,int prec_lug,int gastro,int deco,int serv,int lug,int conta,int contb,int contc,int contd){
        
         base_gastro= prec_gastro;
         base_deco=prec_deco;
         base_serv=prec_serv;
         base_lug=prec_lug;
         gastro2= gastro;
         deco2=deco;
         serv2=serv;
         lug2=lug;
         gastro_desc= conta;
         deco_desc=contb;
         serv_desc=contc;
         lug_desc=contd;
         this.base_gastro=base_gastro;
         this.base_deco=base_deco;
         this.base_serv=base_serv;
         this.base_lug=base_lug;
         this.gastro2=gastro2;
         this.deco2=deco2;
         this.serv2=serv2;
         this.lug2=lug2;
       this.gastro_desc=gastro_desc;
         this.deco_desc=deco_desc;
         this.serv_desc=serv_desc;
         this.lug_desc=lug_desc;
         cotizacion();
         
    }
    void cotizacion(){
        
       /* base_gastro_fin = Integer.toString(base_gastro);
        base_deco_fin = Integer.toString(base_deco);
        base_serv_fin = Integer.toString(base_serv);
        base_lug_fin = Integer.toString(base_lug);*/
        System.out.println(base_gastro);
        System.out.println(gastro2);
       gastro2=gastro2+base_gastro;
       deco2=deco2+base_deco;
       serv2=serv2+base_serv;
       lug2=lug2+base_lug;
       
       
        gastro_fin = Integer.toString(gastro2);
        deco_fin = Integer.toString(deco2);
        serv_fin = Integer.toString(serv2);
        lug_fin = Integer.toString(lug2);
 
        
        rev_tot_gastro.setText(gastro_fin);
        rev_tot_deco.setText(deco_fin);
        rev_tot_serv.setText(serv_fin); 
        rev_tot_lug.setText(lug_fin);
        rev_fecha.setText(fecha2);
          
        
      
        String tot_fin2;
        tot_fin=gastro2+deco2+serv2+lug2;
        tot_fin2 = Integer.toString(tot_fin);
        final_cot.setText(tot_fin2);
        this.tot_fin=tot_fin;
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
            java.util.logging.Logger.getLogger(cotizacion_finalll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cotizacion_finalll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cotizacion_finalll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cotizacion_finalll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cotizacion_finalll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField final_cot;
    private javax.swing.JButton finalizar_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton otra_cot;
    private javax.swing.JTextField rev_fecha;
    private javax.swing.JTextField rev_tot_deco;
    private javax.swing.JTextField rev_tot_gastro;
    private javax.swing.JTextField rev_tot_lug;
    private javax.swing.JTextField rev_tot_serv;
    private javax.swing.JLabel tit_cot;
    private javax.swing.JLabel tit_deco;
    private javax.swing.JLabel tit_fecha;
    private javax.swing.JLabel tit_final;
    private javax.swing.JLabel tit_gastro;
    private javax.swing.JLabel tit_lug;
    private javax.swing.JLabel tit_serv;
    private javax.swing.JButton ver_cot;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
