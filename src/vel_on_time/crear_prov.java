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
public class crear_prov extends javax.swing.JFrame {
    boolean gastronomia = false;
    boolean decoracion = false;
    boolean servicios = false;
    boolean lugar = false;
    boolean gastropol = false;
    boolean decopol = false;
    boolean servpol = false;
    boolean lugarpol = false;
    
    /**
     * Creates new form mod_prov
     */
    public crear_prov() {
        initComponents();
        transparenciaBotones();
        selec_estado.add(rev_activo);
        selec_estado.add(rev_inactivo);
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

        selec_estado = new javax.swing.ButtonGroup();
        rev_nomb_art = new javax.swing.JTextField();
        ESTADO = new javax.swing.JLabel();
        PRECIO_BASE = new javax.swing.JLabel();
        NOMBRE_ARTICULO = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TITULO_GASTRO = new javax.swing.JLabel();
        NOMBRE_PROVEEDOR = new javax.swing.JLabel();
        PRECIO_UNITARIO = new javax.swing.JLabel();
        ARTICULO_EXTRA = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        enviar_repeat = new javax.swing.JButton();
        rev_id = new javax.swing.JTextField();
        rev_nom_prov = new javax.swing.JTextField();
        rev_prec_base = new javax.swing.JTextField();
        rev_prec_uni = new javax.swing.JTextField();
        rev_activo = new javax.swing.JRadioButton();
        rev_inactivo = new javax.swing.JRadioButton();
        SERICIOS = new javax.swing.JLabel();
        rev_servicio = new javax.swing.JTextField();
        obj_proveedor = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        rev_nomb_art2 = new javax.swing.JTextField();
        NOMBRE_ARTICULO2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        PRECIO_UNITARIO2 = new javax.swing.JLabel();
        ARTICULO_EXTRA2 = new javax.swing.JLabel();
        rev_prec_uni2 = new javax.swing.JTextField();
        enviar_all1 = new javax.swing.JButton();
        AY = new javax.swing.JTextField();
        tit_val_to_clien = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rev_nomb_art.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_nomb_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rev_nomb_artActionPerformed(evt);
            }
        });
        getContentPane().add(rev_nomb_art, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 100, -1));

        ESTADO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ESTADO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ESTADO.setText("Estado del proveedor");
        getContentPane().add(ESTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 620, -1));

        PRECIO_BASE.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        PRECIO_BASE.setText("Precio base: ");
        getContentPane().add(PRECIO_BASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        NOMBRE_ARTICULO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        NOMBRE_ARTICULO.setText("Nombre del articulo:");
        getContentPane().add(NOMBRE_ARTICULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        ID.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ID.setText("ID:");
        ID.setToolTipText("");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 640, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 640, 10));

        TITULO_GASTRO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        TITULO_GASTRO.setText("PROVEEDOR :");
        getContentPane().add(TITULO_GASTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 40));

        NOMBRE_PROVEEDOR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        NOMBRE_PROVEEDOR.setText("Nombre del proveedor: ");
        getContentPane().add(NOMBRE_PROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        PRECIO_UNITARIO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        PRECIO_UNITARIO.setText("Precio unitario: ");
        getContentPane().add(PRECIO_UNITARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        ARTICULO_EXTRA.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ARTICULO_EXTRA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ARTICULO_EXTRA.setText("Articulo extra");
        getContentPane().add(ARTICULO_EXTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, 630, 28));

        volver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
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
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        enviar_repeat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        enviar_repeat.setText("Enviar");
        enviar_repeat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_repeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_repeatMouseClicked(evt);
            }
        });
        enviar_repeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_repeatActionPerformed(evt);
            }
        });
        getContentPane().add(enviar_repeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, -1, -1));

        rev_id.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        rev_nom_prov.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_nom_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, -1));

        rev_prec_base.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_prec_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, -1));

        rev_prec_uni.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_prec_uni, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 106, -1));

        rev_activo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rev_activo.setText("Activo");
        getContentPane().add(rev_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        rev_inactivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rev_inactivo.setText("Inactivo");
        getContentPane().add(rev_inactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        SERICIOS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        SERICIOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SERICIOS.setText("Servicios");
        getContentPane().add(SERICIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 240, -1));

        rev_servicio.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 240, 100));

        obj_proveedor.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        getContentPane().add(obj_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 520, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 640, 10));

        rev_nomb_art2.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_nomb_art2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rev_nomb_art2ActionPerformed(evt);
            }
        });
        getContentPane().add(rev_nomb_art2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 130, -1));

        NOMBRE_ARTICULO2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        NOMBRE_ARTICULO2.setText("Nombre del articulo:");
        getContentPane().add(NOMBRE_ARTICULO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 120, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 640, 10));

        PRECIO_UNITARIO2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        PRECIO_UNITARIO2.setText("Precio unitario:");
        getContentPane().add(PRECIO_UNITARIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 120, -1));

        ARTICULO_EXTRA2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ARTICULO_EXTRA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ARTICULO_EXTRA2.setText("¿Desea agregar más articulos del mismo proveedor?");
        getContentPane().add(ARTICULO_EXTRA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 640, 28));

        rev_prec_uni2.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        getContentPane().add(rev_prec_uni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 150, -1));

        enviar_all1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
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
        getContentPane().add(enviar_all1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));
        getContentPane().add(AY, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 150, -1));

        tit_val_to_clien.setText("VALOR AL CLIENTE CALCULADO");
        getContentPane().add(tit_val_to_clien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 542, 670, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 560));

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
    
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void enviar_repeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_repeatMouseClicked
           if(gastropol == true){
               gastronomiapol();
           }
            if(decopol == true){
               decopol();
           }
            if(servpol == true){
               servpol();
           }
            if(lugarpol == true){
               lugarpol();
           }
       
    }//GEN-LAST:event_enviar_repeatMouseClicked

    private void enviar_repeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_repeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar_repeatActionPerformed

    private void rev_nomb_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rev_nomb_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rev_nomb_artActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Admon ob15 = new Admon();
        ob15.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void rev_nomb_art2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rev_nomb_art2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rev_nomb_art2ActionPerformed

    private void enviar_all1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_all1MouseClicked
        
        if(gastronomia == true){
            
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

    /**
     * @param args the command line arguments
     */
    void gastronomia(){
        gastronomia = true;
        obj_proveedor.setText("GASTRONOMIA            VALOR AL CLIENTE SE SUMA EL 30% DEL VALOR BASE");
     
  
    }
    
    void gastronomia2(){   
         
        archivoos ob14 = new archivoos();
        boolean provedor_gastro = true;
        int id;
        String nombre;
        int prec;
        String serv;
        String art;
        int precart;
         
        
        if(rev_activo.isSelected()){
           provedor_gastro = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_gastro = false;
        }
        
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
    
        int prec2;
        prec= Integer.parseInt(rev_prec_base.getText());
        prec2=/*(float)*/prec+((prec*30)/100) ;
        /*prec+((prec*60)/100)*/
        String numI2 = Integer.toString(prec2);
       AY.setText(numI2);
        
        
        serv=rev_servicio.getText();
        art=rev_nomb_art.getText();
        precart=Integer.parseInt(rev_prec_uni.getText());
        ob14.arcprovcom(id,nombre,prec2,serv,provedor_gastro);
        ob14.artch(id,art,precart,provedor_gastro);
        gastropol = true;
    }
    
     void gastronomiapol(){ 
        
        archivoos ob14 = new archivoos();
        boolean provedor_gastro = true;
        String nombre;
        int id;
        int prec;
        String serv;
        String art;
        int precart;
      
         
        if(rev_activo.isSelected()){
           provedor_gastro = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_gastro = false;
        }
        
         
         id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec=0;
        serv=" ";
        art=rev_nomb_art2.getText();
        precart=Integer.parseInt(rev_prec_uni2.getText());
        ob14.arcprovcompol(id,nombre,prec,serv,provedor_gastro);
        ob14.artch(id,art,precart,provedor_gastro);
    }
    
    void decoracion(){
        decoracion=true;
        obj_proveedor.setText("DECORACIÓN Y ACONDICIONAMIENTO           VALOR AL CLIENTE SE SUMA EL 52% DEL VALOR BASE");
    }
    
    
    void decoracion2(){
        
         archivoos ob14 = new archivoos();
        
        
        boolean provedor_deco = true;
        int id;
        String nombre;
        int prec;
        String serv;
        String art;
        int precart;
         
        if(rev_activo.isSelected()){
           provedor_deco = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_deco = false;
        }
        int prec2;
        prec= Integer.parseInt(rev_prec_base.getText());
        prec2=/*(float)*/prec+((prec*52)/100) ;
        /*prec+((prec*60)/100)*/
        String numI2 = Integer.toString(prec2);
       AY.setText(numI2);
        
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec= Integer.parseInt(rev_prec_base.getText());
        serv=rev_servicio.getText();
        art=rev_nomb_art.getText();
        precart=Integer.parseInt(rev_prec_uni.getText());
        
        ob14.arcprovdeco(id, nombre, prec2, serv, provedor_deco);
        ob14.artdeco(id,art, precart, provedor_deco);
        decopol=true;
    }
    void decopol(){   
        archivoos ob14 = new archivoos();
        boolean provedor_gastro = true;
        String nombre;
        int id;
        int prec;
        String serv;
        String art;
        int precart;
      
         
        if(rev_activo.isSelected()){
           provedor_gastro = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_gastro = false;
        }
        
         
       id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec=0;
        serv=" ";
        art=rev_nomb_art2.getText();
        precart=Integer.parseInt(rev_prec_uni2.getText());
        ob14.arcprovdecopol(id,nombre,prec,serv,provedor_gastro);
        ob14.artdeco(id,art,precart,provedor_gastro);
    }
    
    void servicios(){
        servicios = true;
        obj_proveedor.setText("SERVICIOS           VALOR AL CLIENTE SE SUMA EL 60% DEL VALOR BASE");
    }
    void servicios2(){
        archivoos ob14 = new archivoos();
        
        
        boolean provedor_deco = true;
        int id;
        String nombre;
        int prec;
        String serv;
        String art;
        int precart;
         
        if(rev_activo.isSelected()){
           provedor_deco = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_deco = false;
        }
         int prec2;
        prec= Integer.parseInt(rev_prec_base.getText());
        prec2=/*(float)*/prec+((prec*60)/100) ;
        /*prec+((prec*60)/100)*/
        String numI2 = Integer.toString(prec2);
       AY.setText(numI2);
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec= Integer.parseInt(rev_prec_base.getText());
        serv=rev_servicio.getText();
        art=rev_nomb_art.getText();
        precart=Integer.parseInt(rev_prec_uni.getText());
        
        ob14.arcprovserv(id, nombre, prec2, serv, provedor_deco);
        ob14.artserv(id,art, precart, provedor_deco);
        servpol=true;
    }
    void servpol(){   
        archivoos ob14 = new archivoos();
        boolean provedor_gastro = true;
        String nombre;
        int id;
        int prec;
        String serv;
        String art;
        int precart;
      
         
        if(rev_activo.isSelected()){
           provedor_gastro = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_gastro = false;
        }
        
         
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec=0;
        serv=" ";
        art=rev_nomb_art2.getText();
        precart=Integer.parseInt(rev_prec_uni2.getText());
        ob14.arcprovservpol(id,nombre,prec,serv,provedor_gastro);
        ob14.artserv(id,art,precart,provedor_gastro);
    }
    
    void lugar(){
        lugar=true;
        obj_proveedor.setText("LUGAR           VALOR AL CLIENTE SE SUMA EL 20% DEL VALOR BASE");
    }
    void lugar2(){
        archivoos ob14 = new archivoos();
        
        
        boolean provedor_deco = true;
        int id;
        String nombre;
        int prec;
        String serv;
        String art;
        int precart;
         
        if(rev_activo.isSelected()){
           provedor_deco = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_deco = false;
        }
        int prec2;
        prec= Integer.parseInt(rev_prec_base.getText());
        prec2=/*(float)*/prec+((prec*20)/100) ;
        /*prec+((prec*60)/100)*/
        String numI2 = Integer.toString(prec2);
       AY.setText(numI2);
        
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec= Integer.parseInt(rev_prec_base.getText());
        serv=rev_servicio.getText();
        art=rev_nomb_art.getText();
        precart=Integer.parseInt(rev_prec_uni.getText());
        
        ob14.arcprovlug(id, nombre, prec2, serv, provedor_deco);
        ob14.artlug(id,art, precart, provedor_deco);
        lugarpol=true;
    }
    void lugarpol(){   
        archivoos ob14 = new archivoos();
        boolean provedor_gastro = true;
        String nombre;
        int id;
        int prec;
        String serv;
        String art;
        int precart;
      
         
        if(rev_activo.isSelected()){
           provedor_gastro = true;
        }
         if(rev_inactivo.isSelected()){
           provedor_gastro = false;
        }
        
         
        id= Integer.parseInt(rev_id.getText());
        nombre= rev_nom_prov.getText();
        prec=0;
        serv=" ";
        art=rev_nomb_art2.getText();
        precart=Integer.parseInt(rev_prec_uni2.getText());
        ob14.arcprovlugarpol(id,nombre,prec,serv,provedor_gastro);
        ob14.artlug(id,art,precart,provedor_gastro);
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
            java.util.logging.Logger.getLogger(crear_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_prov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_prov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARTICULO_EXTRA;
    private javax.swing.JLabel ARTICULO_EXTRA2;
    private javax.swing.JTextField AY;
    private javax.swing.JLabel ESTADO;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NOMBRE_ARTICULO;
    private javax.swing.JLabel NOMBRE_ARTICULO2;
    private javax.swing.JLabel NOMBRE_PROVEEDOR;
    private javax.swing.JLabel PRECIO_BASE;
    private javax.swing.JLabel PRECIO_UNITARIO;
    private javax.swing.JLabel PRECIO_UNITARIO2;
    private javax.swing.JLabel SERICIOS;
    private javax.swing.JLabel TITULO_GASTRO;
    private javax.swing.JButton enviar_all1;
    private javax.swing.JButton enviar_repeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel obj_proveedor;
    private javax.swing.JRadioButton rev_activo;
    private javax.swing.JTextField rev_id;
    private javax.swing.JRadioButton rev_inactivo;
    private javax.swing.JTextField rev_nom_prov;
    private javax.swing.JTextField rev_nomb_art;
    private javax.swing.JTextField rev_nomb_art2;
    private javax.swing.JTextField rev_prec_base;
    private javax.swing.JTextField rev_prec_uni;
    private javax.swing.JTextField rev_prec_uni2;
    private javax.swing.JTextField rev_servicio;
    private javax.swing.ButtonGroup selec_estado;
    private javax.swing.JLabel tit_val_to_clien;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
