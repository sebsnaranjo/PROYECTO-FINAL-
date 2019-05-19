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
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Modificar_archivo_clien extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_archivo_clien
     */
    public Modificar_archivo_clien() {
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

        jPanel1 = new javax.swing.JPanel();
        nombre_cliente = new javax.swing.JLabel();
        MES = new javax.swing.JLabel();
        numero_invitados = new javax.swing.JLabel();
        id_cliente = new javax.swing.JLabel();
        presupuesto1 = new javax.swing.JLabel();
        ANO = new javax.swing.JLabel();
        DIA = new javax.swing.JLabel();
        rev_dia = new javax.swing.JTextField();
        rev_mes = new javax.swing.JTextField();
        rev_ano = new javax.swing.JTextField();
        rev_id = new javax.swing.JTextField();
        rev_nombre = new javax.swing.JTextField();
        rev_presupuesto = new javax.swing.JTextField();
        rev_invitados = new javax.swing.JTextField();
        selec_mod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        deseo = new javax.swing.JLabel();
        REV_CLIEN = new javax.swing.JTextField();
        buscar_re = new javax.swing.JButton();
        MES1 = new javax.swing.JLabel();
        ANO1 = new javax.swing.JLabel();
        DIA1 = new javax.swing.JLabel();
        rev_dia1 = new javax.swing.JTextField();
        rev_mes1 = new javax.swing.JTextField();
        rev_ano1 = new javax.swing.JTextField();
        rev_horiI = new javax.swing.JTextField();
        rev_horaf = new javax.swing.JTextField();
        rev_horiI1 = new javax.swing.JTextField();
        rev_horaf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        nombre_cliente.setText("Nombre cliente:");
        getContentPane().add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 119, 34));

        MES.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        MES.setText("MES:");
        getContentPane().add(MES, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 34));

        numero_invitados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        numero_invitados.setText("Numero de invitados:");
        getContentPane().add(numero_invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 129, 34));

        id_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        id_cliente.setText("Id del cliente:");
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 85, 34));

        presupuesto1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        presupuesto1.setText("Presupuesto:");
        getContentPane().add(presupuesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 85, 34));

        ANO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ANO.setText("AÑO:");
        getContentPane().add(ANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 39, 34));

        DIA.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DIA.setText("DIA:");
        getContentPane().add(DIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 36, 34));

        rev_dia.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_diaKeyTyped(evt);
            }
        });
        getContentPane().add(rev_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, -1));

        rev_mes.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_mesKeyTyped(evt);
            }
        });
        getContentPane().add(rev_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 61, -1));

        rev_ano.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_ano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_anoKeyTyped(evt);
            }
        });
        getContentPane().add(rev_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 68, -1));

        rev_id.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rev_idActionPerformed(evt);
            }
        });
        rev_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_idKeyTyped(evt);
            }
        });
        getContentPane().add(rev_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 103, -1));

        rev_nombre.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(rev_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 160, -1));

        rev_presupuesto.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_presupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_presupuestoKeyTyped(evt);
            }
        });
        getContentPane().add(rev_presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 103, -1));

        rev_invitados.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_invitados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_invitadosKeyTyped(evt);
            }
        });
        getContentPane().add(rev_invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 130, -1));

        selec_mod.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        selec_mod.setText("Modificar");
        selec_mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selec_mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selec_modMouseClicked(evt);
            }
        });
        getContentPane().add(selec_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 100, 30));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO  A MODIFICAR CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 50));

        volver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        volver.setText("Volver");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 70, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 560, 10));

        deseo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        deseo.setText("Ingrese el nombre del cliente y la fecha del evento a modificar");
        getContentPane().add(deseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        REV_CLIEN.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        REV_CLIEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                REV_CLIENKeyTyped(evt);
            }
        });
        getContentPane().add(REV_CLIEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, -1));

        buscar_re.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        buscar_re.setText("Buscar");
        buscar_re.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_reMouseClicked(evt);
            }
        });
        buscar_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_reActionPerformed(evt);
            }
        });
        getContentPane().add(buscar_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        MES1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        MES1.setText("MES:");
        getContentPane().add(MES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 34));

        ANO1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ANO1.setText("AÑO:");
        getContentPane().add(ANO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 39, 34));

        DIA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DIA1.setText("DIA:");
        getContentPane().add(DIA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 36, 34));

        rev_dia1.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_dia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_dia1KeyTyped(evt);
            }
        });
        getContentPane().add(rev_dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 60, -1));

        rev_mes1.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_mes1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_mes1KeyTyped(evt);
            }
        });
        getContentPane().add(rev_mes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 61, -1));

        rev_ano1.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rev_ano1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_ano1KeyTyped(evt);
            }
        });
        getContentPane().add(rev_ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 68, -1));

        rev_horiI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_horiIKeyTyped(evt);
            }
        });
        getContentPane().add(rev_horiI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 40, 19));

        rev_horaf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_horafKeyTyped(evt);
            }
        });
        getContentPane().add(rev_horaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 40, 19));

        rev_horiI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_horiI1KeyTyped(evt);
            }
        });
        getContentPane().add(rev_horiI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 40, 19));

        rev_horaf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rev_horaf1KeyTyped(evt);
            }
        });
        getContentPane().add(rev_horaf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 40, 19));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setText("Hora de inicio:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setText("Hora de fin:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel4.setText("Hora de inicio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("Hora de fin:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rev_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rev_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rev_idActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Mod_selec ob24 = new Mod_selec();
        ob24.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void selec_modMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selec_modMouseClicked
            archivoos obj39 = new archivoos();
            String id;
            String nombre;
            String prest;
            String numI;
          
            String date;
            id=rev_id.getText();
            nombre= rev_nombre.getText();
            prest=rev_presupuesto.getText();
            numI=rev_invitados.getText();
           int dia= Integer.parseInt(rev_dia.getText());
           int mes= Integer.parseInt(rev_mes.getText());
           int ano= Integer.parseInt(rev_ano.getText());
           int horai=Integer.parseInt(rev_horiI.getText());
           int horaf=Integer.parseInt(rev_horaf.getText()); 
            int pres= Integer.parseInt(rev_presupuesto.getText());
             int numInv= Integer.parseInt(rev_invitados.getText());
            
            
           if(ano<2019|| ano>3000 ){
            JOptionPane.showMessageDialog(null, "No es valido");
        }
        else{
            if(mes>=13 || mes<=0){
               JOptionPane.showMessageDialog(null, "No es valido"); 
            }else{

             if((mes==1 && dia>31 ||dia<=0) || (mes==2 && dia>28||dia<=0) || (mes==3 && dia>31||dia<=0)||(mes==4 && dia>30||dia<=0)||(mes==5 && dia>31||dia<=0)||(mes==6 && dia>30||dia<=0)||(mes==7 && dia>31||dia<=0)||(mes==8 && dia>31||dia<=0)||(mes==9 && dia>30||dia<=0)||(mes==10 && dia>31||dia<=0)||(mes==11 && dia>30||dia<=0)||(mes==12 && dia>31||dia<=0) ){
                 JOptionPane.showMessageDialog(null, "No es valido");
             }
             else{
                 if(horai>24 || horaf>24 ||horai<=0 ||horaf<=0 ){
                    JOptionPane.showMessageDialog(null, "No es valido");
                 }else{

                     if(dia==31 && mes==12){
                        JOptionPane.showMessageDialog(null, "Este dia no trabajamos"); 
                     }
                     else{
                          if(pres<=0){
                          JOptionPane.showMessageDialog(null, "Presupuesto invalido");   
                        }
                        else{
                              if(numInv<=0){
                                JOptionPane.showMessageDialog(null, "Invitados invalidos");  
                            }
                            else{
                               File fNuevo = new File("src\\archivos\\Cotizaciones Realizadas.txt");
                               date= rev_dia1.getText()+"/"+rev_mes1.getText()+"/"+rev_ano1.getText()+"/"+rev_horiI.getText()+"/"+rev_horaf.getText();
                               String cadbus;
                               String cadcam;
                               cadbus=REV_CLIEN.getText()+";"+rev_dia.getText()+"/"+rev_mes.getText()+"/"+rev_ano.getText()+"/"+rev_horiI1.getText()+"/"+rev_horaf1.getText();
                               System.out.println(cadbus);
                               cadcam=id+";"+nombre+";"+prest+";"+numI+";"+date;
                               obj39.clientemodf(fNuevo, cadbus, cadcam);
                          }
                          }
                     }

                 }
             }
            }
        }
           
           
            
           
            
                    
    }//GEN-LAST:event_selec_modMouseClicked

    private void buscar_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_reActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_reActionPerformed

    private void buscar_reMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_reMouseClicked
        String a;
       
       
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido

        try {
            
            archivo = new File("src\\archivos\\Cotizaciones Realizadas.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String dateobtanin;
            dateobtanin= rev_dia.getText()+"/"+rev_mes.getText()+"/"+rev_ano.getText()+"/"+rev_horiI1.getText()+"/"+rev_horaf1.getText();
            System.out.println(dateobtanin);
            String cadena = ""; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                    String id[]= cadena.split(";");
                    String nombre[]= cadena.split(";");
                    String prestu[]= cadena.split(";");
                    String numI[]= cadena.split(";");
                    String date[]= cadena.split(";");
                    System.out.println(REV_CLIEN);
                    System.out.println(nombre[3]);
                    
                    
                    if(REV_CLIEN.getText().equals(nombre[3])&& dateobtanin.equals(date[5])){
                       rev_id.setText(id[2]);
                       rev_nombre.setText(nombre[3]);
                       rev_presupuesto.setText(prestu[15]);
                       rev_invitados.setText(numI[4]);
                       String dia[]= date[5].split("/");
                       String mes[]= date[5].split("/");
                       String anio[]= date[5].split("/");
                       String horai[]= date[5].split("/");
                       String horaf[]= date[5].split("/");
                       rev_dia1.setText(dia[0]);
                       rev_mes1.setText(mes[1]);
                       rev_ano1.setText(anio[2]);
                       rev_horaf.setText(horai[3]);
                       rev_horaf.setText(horaf[4]);
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
    }//GEN-LAST:event_buscar_reMouseClicked

    private void REV_CLIENKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_REV_CLIENKeyTyped
     char c=evt.getKeyChar();
        if(c<'a'|| c>'z')evt.consume();
    }//GEN-LAST:event_REV_CLIENKeyTyped

    private void rev_diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_diaKeyTyped
         char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_diaKeyTyped

    private void rev_mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_mesKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_mesKeyTyped

    private void rev_anoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_anoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_anoKeyTyped

    private void rev_horiI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_horiI1KeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_horiI1KeyTyped

    private void rev_horaf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_horaf1KeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_horaf1KeyTyped

    private void rev_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_idKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_idKeyTyped

    private void rev_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_nombreKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'a'|| c>'z')evt.consume();
    }//GEN-LAST:event_rev_nombreKeyTyped

    private void rev_presupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_presupuestoKeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_presupuestoKeyTyped

    private void rev_invitadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_invitadosKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_invitadosKeyTyped

    private void rev_dia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_dia1KeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_dia1KeyTyped

    private void rev_mes1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_mes1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_mes1KeyTyped

    private void rev_ano1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_ano1KeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_ano1KeyTyped

    private void rev_horiIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_horiIKeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_horiIKeyTyped

    private void rev_horafKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rev_horafKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_rev_horafKeyTyped

    /**
     * @param args the command line arguments
     */
    void cliente(){
        
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
            java.util.logging.Logger.getLogger(Modificar_archivo_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_archivo_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_archivo_clien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANO;
    private javax.swing.JLabel ANO1;
    private javax.swing.JLabel DIA;
    private javax.swing.JLabel DIA1;
    private javax.swing.JLabel MES;
    private javax.swing.JLabel MES1;
    private javax.swing.JTextField REV_CLIEN;
    private javax.swing.JButton buscar_re;
    private javax.swing.JLabel deseo;
    private javax.swing.JLabel id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre_cliente;
    private javax.swing.JLabel numero_invitados;
    private javax.swing.JLabel presupuesto1;
    private javax.swing.JTextField rev_ano;
    private javax.swing.JTextField rev_ano1;
    private javax.swing.JTextField rev_dia;
    private javax.swing.JTextField rev_dia1;
    private javax.swing.JTextField rev_horaf;
    private javax.swing.JTextField rev_horaf1;
    private javax.swing.JTextField rev_horiI;
    private javax.swing.JTextField rev_horiI1;
    private javax.swing.JTextField rev_id;
    private javax.swing.JTextField rev_invitados;
    private javax.swing.JTextField rev_mes;
    private javax.swing.JTextField rev_mes1;
    private javax.swing.JTextField rev_nombre;
    private javax.swing.JTextField rev_presupuesto;
    private javax.swing.JButton selec_mod;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
