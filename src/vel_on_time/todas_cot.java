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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO:");

        buscar_id.setText("BUSCAR");
        buscar_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_idMouseClicked(evt);
            }
        });

        jLabel2.setText("QUE COTIZACION DESEA VER:");

        jLabel3.setText("EL PRIMER VALOR REPRESENTA EL NUMERO DE LA COTIZACION Y EL SEGUNDO EL VALOR FINAL DE LA COTIZACION");

        ver.setText("VER");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        VOLVER.setText("VOLVER");
        VOLVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rev_id, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(buscar_id))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(VOLVER)
                        .addGap(137, 137, 137)
                        .addComponent(ver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(combo_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscar_id)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rev_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(combo_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver)
                    .addComponent(VOLVER))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        mostrar_cot ob32 = new mostrar_cot();
        String cotizacion = (String) combo_cotizacion.getSelectedItem();
        String id_cot[] = cotizacion.split(",");
        int randomico= Integer.parseInt(id_cot[0]);
        String precio_final[] = cotizacion.split(",");
        int precio= Integer.parseInt(precio_final[1]);
        ob32.mostrar2(randomico,precio);
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
    private javax.swing.JTextField rev_id;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables

}
