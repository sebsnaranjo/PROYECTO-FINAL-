/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vel_on_time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jose noel mantilla
 */
public class todas_cot extends javax.swing.JFrame {
private int id2;
private String nombre2;
private int presupuesto2;
private int numIn2;
private String fecha2;   
    
    /** Creates new form todas_cot */
    public todas_cot() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscar_id = new javax.swing.JButton();
        combo_cotizacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ver = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        rev_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 104, 37));

        buscar_id.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        buscar_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        buscar_id.setText("Buscar");
        buscar_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_idMouseClicked(evt);
            }
        });
        buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_idActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 38));
        getContentPane().add(combo_cotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 290, 32));

        jLabel2.setFont(new java.awt.Font("SFNS Display", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Que cotizacion desea ver:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 660, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("El primer valor representa el número de cotización y el segundo el valor final de la cotización");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 660, 60));

        ver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ver.setText("Ver");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

        VOLVER.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        VOLVER.setText("Volver");
        VOLVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVERMouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 30));

        rev_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_idKeyTyped(evt);
            }
        });
        getContentPane().add(rev_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 247, 38));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        mostrar_cot ob32 = new mostrar_cot();
        String cotizacion = (String) combo_cotizacion.getSelectedItem();
        String id_cot[] = cotizacion.split(",");
        int randomico= Integer.parseInt(id_cot[0]);
        String precio_final[] = cotizacion.split(",");
        int precio= Integer.parseInt(precio_final[1]);
        ob32.mostrar2(randomico,precio,nombre2,presupuesto2,numIn2,fecha2);
        ob32.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_verMouseClicked

    private void VOLVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVERMouseClicked
       cotizacion_finalll ob33 = new cotizacion_finalll();
       ob33.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_VOLVERMouseClicked

    private void buscar_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_idMouseClicked
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
        String a;
        try {
            archivo = new File("src\\archivos\\Cotizaciones Realizadas.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                int largo = cadena.length();
                String info;
                int prec;
                boolean op;
                String c;
                String nombre[] = cadena.split(";");
                info = nombre[3];
                String value[] = cadena.split(";");
             
                String vlrt[]= cadena.split(";");
                if (value[2].equals(rev_id.getText())){
                  a=nombre[1]+","+vlrt[10];
                   combo_cotizacion.addItem(a);
                }
               
               
            }

        } catch (IOException e) {
            System.out.print("Error consultando archivo");
        } finally {
            try {
                if (contenido != null) {
                    contenido.close();
                }
            } catch (IOException e1) {
                System.out.print("Error cerrando archivo");
            }
        }
    
    }//GEN-LAST:event_buscar_idMouseClicked

    private void buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_idActionPerformed

    private void rev_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_idKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_idKeyTyped

    /**
     * @param args the command line arguments
     */
    void buscar(int id,String nombre,int presupuesto,int numIn,String fecha){
        
        id2=id;
        nombre2=nombre;
        presupuesto2=presupuesto;
        numIn2=numIn;
        fecha2=fecha;
        
        this.id2=id2;
        this.nombre2=nombre2;
        this.presupuesto2=presupuesto2;
        this.numIn2=numIn2;
        this.fecha2=fecha2;
        String id3;
        String presupuesto3;
        String numIn3;
        
        id3 = Integer.toString(id2);
        presupuesto3=Integer.toString(presupuesto2);
        numIn3=Integer.toString(numIn2);
        
        rev_id.setText(id3);
        /*rev_nom.setText(nombre2);
        rev_pres.setText(presupuesto3);
        rev_numIN.setText(numIn3);
        rev_fecha.setText(fecha2);*/
        
        System.out.println(id3+"x");
    }
    
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
            java.util.logging.Logger.getLogger(todas_cot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(todas_cot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(todas_cot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(todas_cot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new todas_cot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLVER;
    private javax.swing.JButton buscar_id;
    private javax.swing.JComboBox<String> combo_cotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField rev_id;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables

}
