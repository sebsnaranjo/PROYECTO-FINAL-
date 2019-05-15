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
public final class Modificar_archivo_prov extends javax.swing.JFrame {
boolean gastronomia;
boolean decoracion;
boolean servicios;
boolean lugar;
    /**
     * Creates new form Modificar_archivo
     */
    public Modificar_archivo_prov() {
        initComponents();
        transparenciaBotones();
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

        selec_op = new javax.swing.ButtonGroup();
        PRECIO_BASE = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TITULO_GASTRO = new javax.swing.JLabel();
        NOMBRE_PROVEEDOR = new javax.swing.JLabel();
        rev_id = new javax.swing.JTextField();
        rev_nom_prov = new javax.swing.JTextField();
        rev_prec_base = new javax.swing.JTextField();
        SERICIOS = new javax.swing.JLabel();
        rev_servicio = new javax.swing.JTextField();
        obj_proveedor = new javax.swing.JLabel();
        ESTADO = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        rev_activo = new javax.swing.JRadioButton();
        rev_inactivo = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        enviar_all1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        digite = new javax.swing.JLabel();
        rev_prov = new javax.swing.JTextField();
        met = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRECIO_BASE.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        PRECIO_BASE.setText("Precio base:");
        getContentPane().add(PRECIO_BASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        ID.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ID.setText("ID:");
        ID.setToolTipText("");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 670, 16));

        TITULO_GASTRO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        TITULO_GASTRO.setText("Proveedor:");
        getContentPane().add(TITULO_GASTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        NOMBRE_PROVEEDOR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        NOMBRE_PROVEEDOR.setText("Nombre del proveedor: ");
        getContentPane().add(NOMBRE_PROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        getContentPane().add(rev_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, -1));
        getContentPane().add(rev_nom_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 110, -1));
        getContentPane().add(rev_prec_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 110, -1));

        SERICIOS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        SERICIOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SERICIOS.setText("Servicios");
        getContentPane().add(SERICIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 205, 240, 30));
        getContentPane().add(rev_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 249, 240, 100));

        obj_proveedor.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        getContentPane().add(obj_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 280, 20));

        ESTADO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ESTADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ESTADO.setText("Estado del proveedor");
        getContentPane().add(ESTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 392, 670, 20));

        volver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        volver.setText("Volver");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 70, 30));

        rev_activo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        rev_activo.setText("ACTIVO");
        getContentPane().add(rev_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        rev_inactivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        rev_inactivo.setText("INACTIVO");
        getContentPane().add(rev_inactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 672, 10));

        enviar_all1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        enviar_all1.setText("Aceptar");
        enviar_all1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_all1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_all1MouseClicked(evt);
            }
        });
        enviar_all1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_all1ActionPerformed(evt);
            }
        });
        getContentPane().add(enviar_all1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 90, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, 672, 10));

        digite.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        digite.setText("Digite el nombre del proveedor que desea cambiar: ");
        getContentPane().add(digite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 360, -1));
        getContentPane().add(rev_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 180, -1));

        met.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        met.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        met.setText("Buscar");
        met.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        met.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metMouseClicked(evt);
            }
        });
        met.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metActionPerformed(evt);
            }
        });
        getContentPane().add(met, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparenciaBotones(){
    
        rev_activo.setOpaque(false);
        rev_activo.setContentAreaFilled(false);
        rev_activo.setBorderPainted(false);
        
        rev_inactivo.setOpaque(false);
        rev_inactivo.setContentAreaFilled(false);
        rev_inactivo.setBorderPainted(false);
        
    }
    
    
    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Mod_selec ob23 = new Mod_selec();
        ob23.setVisible(true);
        this.setVisible(false);
        selec_op.add(rev_activo);
        selec_op.add(rev_inactivo);
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void enviar_all1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_all1MouseClicked
              if(gastronomia==true){
                  gastronomia2();
                  
              }
              if(decoracion==true){
                  decoracion2();
              }
              if(servicios==true){
                  servicios2();
              }
              if(lugar==true){
                  lugar2();
              }
   
    }//GEN-LAST:event_enviar_all1MouseClicked

    private void enviar_all1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_all1ActionPerformed

    }//GEN-LAST:event_enviar_all1ActionPerformed

    private void metActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metActionPerformed

    private void metMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metMouseClicked
       
        
        if(obj_proveedor.getText().equals("GASTRONOMIA")){
         File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Comida.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cont = 0;
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                
                 String id[]= cadena.split(";");
                 String nombre[]=cadena.split(";");
                 String precbase[]=cadena.split(";");
                 String serv[]=cadena.split(";");
                
                 if(nombre[2].equals(rev_prov.getText())){
                    cont=cont+1;
                     if(cont==1){
                 rev_id.setText(id[1]);
                 rev_nom_prov.setText(nombre[2]);
                 rev_prec_base.setText(precbase[3]); 
                 rev_servicio.setText(serv[4]);
                     }
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
        }
        /////////////////////////////////////Leyendo y ubidcando archivo de proveedroes Decoracion ///////
        
         if(obj_proveedor.getText().equals("DECORACION Y AMBIENTACION")){
         File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Decoración y ambientación.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cont = 0;
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                
                 String id[]= cadena.split(";");
                 String nombre[]=cadena.split(";");
                 String precbase[]=cadena.split(";");
                 String serv[]=cadena.split(";");
                
                 if(nombre[2].equals(rev_prov.getText())){
                    cont=cont+1;
                     if(cont==1){
                 rev_id.setText(id[1]);
                 rev_nom_prov.setText(nombre[2]);
                 rev_prec_base.setText(precbase[3]); 
                 rev_servicio.setText(serv[4]);
                     }
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
        }
       /////////////////////////////Leyendo archivoos de servicios ///////////////////////////////
       if(obj_proveedor.getText().equals("SERVICIOS")){
          File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores servicios.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cont = 0;
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                
                 String id[]= cadena.split(";");
                 String nombre[]=cadena.split(";");
                 String precbase[]=cadena.split(";");
                 String serv[]=cadena.split(";");
                
                 if(nombre[2].equals(rev_prov.getText())){
                    cont=cont+1;
                     if(cont==1){
                 rev_id.setText(id[1]);
                 rev_nom_prov.setText(nombre[2]);
                 rev_prec_base.setText(precbase[3]); 
                 rev_servicio.setText(serv[4]);
                     }
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
       }
       ///////////////////////////////Leyendo archivo de proveedores de lugares////////////////////////////////////////
       if(obj_proveedor.getText().equals("LUGAR")){
          File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores lugar.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cont = 0;
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                
                 String id[]= cadena.split(";");
                 String nombre[]=cadena.split(";");
                 String precbase[]=cadena.split(";");
                 String serv[]=cadena.split(";");
                
                 if(nombre[2].equals(rev_prov.getText())){
                    cont=cont+1;
                     if(cont==1){
                 rev_id.setText(id[1]);
                 rev_nom_prov.setText(nombre[2]);
                 rev_prec_base.setText(precbase[3]); 
                 rev_servicio.setText(serv[4]);
                     }
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
       }
       
        
    }//GEN-LAST:event_metMouseClicked

    /**
     * @param args the command line arguments
     */
    
    void gastronomia(){
        gastronomia=true;
           obj_proveedor.setText("GASTRONOMIA");
    }
    void gastronomia2(){
        int id;
        String nombre;
        String cam;
        String lnew;
        int precBase;
        String cadena1=" ";
        String serv;
        boolean band = false;
        cam=rev_prov.getText();
       id= Integer.parseInt( rev_id.getText());
       nombre=rev_nom_prov.getText();
       precBase= Integer.parseInt(rev_prec_base.getText()); 
       serv= rev_servicio.getText();
       if(rev_activo.isSelected()){
           band=true;
       }
        if(rev_inactivo.isSelected()){
           band=false;
       }
         archivoos obj26 = new archivoos();
        File fNuevo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Comida.txt");
        lnew= cadena1 + ";"+id+ ";"+nombre+ ";"+precBase+ ";"+serv+";"+ band +";";
        obj26.modificar(fNuevo,cam,lnew);
       
       
        
    }
    void decoracion(){
        decoracion=true;
        obj_proveedor.setText("DECORACION Y AMBIENTACION");
        
    }
     void decoracion2(){
         int id;
        String nombre;
        String cam;
        String lnew;
        int precBase;
        String cadena1=" ";
        String serv;
        boolean band = false;
        cam=rev_prov.getText();
       id= Integer.parseInt( rev_id.getText());
       nombre=rev_nom_prov.getText();
       precBase= Integer.parseInt(rev_prec_base.getText()); 
       serv= rev_servicio.getText();
       if(rev_activo.isSelected()){
           band=true;
       }
        if(rev_inactivo.isSelected()){
           band=false;
       }
         archivoos obj26 = new archivoos();
        File fNuevo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Decoración y ambientación.txt");
        lnew= cadena1 + ";"+id+ ";"+nombre+ ";"+precBase+ ";"+serv+";"+ band +";";
        obj26.modificar(fNuevo,cam,lnew);
        
    }
    void servicios(){
        servicios=true;
        obj_proveedor.setText("SERVICIOS");
    }
     void servicios2(){
          int id;
        String nombre;
        String cam;
        String lnew;
        int precBase;
        String cadena1=" ";
        String serv;
        boolean band = false;
        cam=rev_prov.getText();
       id= Integer.parseInt( rev_id.getText());
       nombre=rev_nom_prov.getText();
       precBase= Integer.parseInt(rev_prec_base.getText()); 
       serv= rev_servicio.getText();
       if(rev_activo.isSelected()){
           band=true;
       }
        if(rev_inactivo.isSelected()){
           band=false;
       }
         archivoos obj26 = new archivoos();
        File fNuevo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores servicios.txt");
        lnew= cadena1 + ";"+id+ ";"+nombre+ ";"+precBase+ ";"+serv+";"+ band +";";
        obj26.modificar(fNuevo,cam,lnew);
    }
    void lugar(){
        lugar=true;
        obj_proveedor.setText("LUGAR");
    }
    void lugar2(){
         int id;
        String nombre;
        String cam;
        String lnew;
        int precBase;
        String cadena1=" ";
        String serv;
        boolean band = false;
        cam=rev_prov.getText();
       id= Integer.parseInt( rev_id.getText());
       nombre=rev_nom_prov.getText();
       precBase= Integer.parseInt(rev_prec_base.getText()); 
       serv= rev_servicio.getText();
       if(rev_activo.isSelected()){
           band=true;
       }
        if(rev_inactivo.isSelected()){
           band=false;
       }
         archivoos obj26 = new archivoos();
        File fNuevo = new File("C:\\Users\\jose noel mantilla\\Desktop\\Provedores lugar.txt");
        lnew= cadena1 + ";"+id+ ";"+nombre+ ";"+precBase+ ";"+serv+";"+ band +";";
        obj26.modificar(fNuevo,cam,lnew);
        
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
            java.util.logging.Logger.getLogger(Modificar_archivo_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_archivo_prov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ESTADO;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NOMBRE_PROVEEDOR;
    private javax.swing.JLabel PRECIO_BASE;
    private javax.swing.JLabel SERICIOS;
    private javax.swing.JLabel TITULO_GASTRO;
    private javax.swing.JLabel digite;
    private javax.swing.JButton enviar_all1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton met;
    private javax.swing.JLabel obj_proveedor;
    private javax.swing.JRadioButton rev_activo;
    private javax.swing.JTextField rev_id;
    private javax.swing.JRadioButton rev_inactivo;
    private javax.swing.JTextField rev_nom_prov;
    private javax.swing.JTextField rev_prec_base;
    private javax.swing.JTextField rev_prov;
    private javax.swing.JTextField rev_servicio;
    private javax.swing.ButtonGroup selec_op;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
