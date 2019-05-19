/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author jose noel mantilla
 */
public class contabilidad {
     int total_gastroa2=0;
     private        int total_decoa2=0;
            private int total_serva2=0;
      private       int total_lugara2=0;
      private       int total_desc_gastro2=0;
      private       int total_desc_deco2=0;
     private        int total_desc_serv2=0;
   private          int total_desc_lug2=0;
          private   int cont_gastro2=0;
      private       int cont_deco2=0;
     private        int cont_serv2=0;
    private         int cont_lug2=0;
   private          int cont_gastro_art2=0;
          private   int cont_deco_art2=0;
    private         int cont_serv_art2=0;
           private  int cont_lug_art2=0;
  private           float cont_gastro_tot2=0;
         private    float cont_deco_tot2=0;
    private         float cont_serv_tot2=0;
    private         float cont_lug_tot2=0;
   private          float as=0;
   private          float a2s=0;
   private          float a3s=0;
   private          float a4s=0;
   private          int numIn2s;
   private          float sas=0;
   private         float sa2s=0;
   private         float sa3s=0;
   private         float sa4s=0;
    private        int bands=0;
    private  int prec2;
    private  int cont2 = 0;
    
   void archCli2(){
 
            
         File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("src\\archivos\\cot_finales2.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String cadena = ""; //variable captura los datos del archivo
            
             // 11,12,13,14=total por proveedor
             //6=total evento
             //4=numero de invitados
            // total gastronomia=7;total deco=8;totoal serv=9;total lug=10
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                cont2=cont2+1;
                 String total_gastro2[]= cadena.split(";");
                 String total_deco2[]=cadena.split(";");
                 String total_serv2[]= cadena.split(";");
                 String total_lug2[]=cadena.split(";");
                String desc_gastro2[]=cadena.split(";");
                String desc_deco2[]=cadena.split(";");
                String desc_serv2[]=cadena.split(";");
                String desc_lug2[]=cadena.split(";");
                String numIn22[]=cadena.split(";");
                String band2[]=cadena.split(";");
                 
                 total_gastroa2 = Integer.parseInt(total_gastro2[7]);
                 total_decoa2 = Integer.parseInt(total_deco2[8]);
                 total_serva2 = Integer.parseInt(total_serv2[9]);
                 total_lugara2 = Integer.parseInt(total_lug2[10]);
                 
                 total_desc_gastro2 = Integer.parseInt(desc_gastro2[11]);
                 total_desc_deco2 = Integer.parseInt(desc_deco2[12]);
                 total_desc_serv2 = Integer.parseInt(desc_serv2[13]);
                 total_desc_lug2 = Integer.parseInt(desc_lug2[14]);
                 
                 numIn2s = Integer.parseInt(numIn22[4]);
                 
              
                
              //////////////////////////////////////////////////////////////
              
               cont_gastro_art2=cont_gastro_art2+(total_desc_gastro2*numIn2s);
               cont_gastro2=cont_gastro2+total_gastroa2;
                as=(cont_gastro2-cont_gastro_art2);
                cont_gastro_tot2=(float) (as/1.30);
                
               sas=as-cont_gastro_tot2;
               
               ////////////////////////////////////////////////////////////////////////////////////// 
            cont_deco_art2=cont_deco_art2+(total_desc_serv2*numIn2s);
               cont_deco2=cont_deco2+total_decoa2;
                a2s=(cont_deco2-cont_deco_art2);
                cont_deco_tot2=(float) (a2s/1.52);
                   
               sa2s=a2s-cont_deco_tot2;
               
                ////////////////////////////////////////////////////////////////////////////////////
                  cont_serv_art2=cont_serv_art2+(total_desc_deco2*numIn2s);
               cont_serv2=cont_serv2+total_serva2;
                a3s=(cont_serv2-cont_serv_art2);
                cont_serv_tot2=(float) (a3s/1.60);
                   
               sa3s=a3s-cont_serv_tot2;
                
                //////////////////////////////////////////////////////////////////////////////////
                 cont_lug_art2=cont_lug_art2+(total_desc_lug2*numIn2s);
               cont_lug2=cont_lug2+total_lugara2;
                a4s=(cont_lug2-cont_lug_art2);
                cont_lug_tot2=(float) (a4s/1.20);
                   
               sa4s=a4s-cont_lug_tot2;
               
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
         this.as=as;
         this.a2s=a2s;
         this.a3s=a3s;
         this.a4s=a4s;
          this.sas=sas;
         this.sa2s=sa2s;
         this.sa3s=sa3s;
         this.sa4s=sa4s;
         this.cont_deco_tot2=cont_deco_tot2;
          this.cont_gastro_tot2=cont_gastro_tot2;
           this.cont_serv_tot2=cont_serv_tot2; 
           this.cont_lug_tot2=cont_lug_tot2;
           this.cont2=cont2;
           
        
        archCli(); 
         
    }
     
     
     void archCli() {
             int cont = 0;
             int total_gastroa=0;
             int total_decoa=0;
             int total_serva=0;
             int total_lugara=0;
             int total_desc_gastro=0;
             int total_desc_deco=0;
             int total_desc_serv=0;
             int total_desc_lug=0;
             int cont_gastro=0;
             int cont_deco=0;
             int cont_serv=0;
             int cont_lug=0;
             int cont_gastro_art=0;
             int cont_deco_art=0;
             int cont_serv_art=0;
             int cont_lug_art=0;
             float cont_gastro_tot=0;
             float cont_deco_tot=0;
             float cont_serv_tot=0;
             float cont_lug_tot=0;
             float a=0;
             float a2=0;
             float a3=0;
             float a4=0;
             int numIn2;
             float sa=0;
            float sa2=0;
            float sa3=0;
            float sa4=0;
            int band=0;
         File archivo = null; 
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
            try {
            archivo = new File("src\\archivos\\cot_finales.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            String cadena = ""; //variable captura los datos del archivo
            
            
            
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                cont=cont+1;
                 String total_gastro[]= cadena.split(";");
                 String total_deco[]=cadena.split(";");
                 String total_serv[]=cadena.split(";");
                 String total_lug[]=cadena.split(";");
                 String desc_gastro[]=cadena.split(";");
                String desc_deco[]=cadena.split(";");
                String desc_serv[]=cadena.split(";");
                String desc_lug[]=cadena.split(";");
                String numer_inv[]=cadena.split(";");
                 String band2[]=cadena.split(";");
                 total_gastroa = Integer.parseInt(total_gastro[7]);
                 total_decoa = Integer.parseInt(total_deco[8]);
                 total_serva = Integer.parseInt(total_serv[9]);
                 total_lugara = Integer.parseInt(total_lug[10]);
              
                total_desc_gastro = Integer.parseInt(desc_gastro[15]);
                total_desc_deco = Integer.parseInt(desc_deco[16]);
                total_desc_serv = Integer.parseInt(desc_serv[17]);
                total_desc_lug = Integer.parseInt(desc_lug[18]);
                numIn2 = Integer.parseInt(numer_inv[4]);
             
                
              
                
              //////////////////////////////////////////////////////////////
              
               cont_gastro_art=cont_gastro_art+(total_desc_gastro*numIn2);
               cont_gastro=cont_gastro+total_gastroa;
                a=(cont_gastro-cont_gastro_art);
                cont_gastro_tot=(float) (a/1.30);
                
               sa=a-cont_gastro_tot;
                
               ////////////////////////////////////////////////////////////////////////////////////// 
                cont_deco_art=cont_deco_art+(total_desc_deco*numIn2);
               cont_deco=cont_deco+total_decoa;
                a2=(cont_deco-cont_deco_art);
                cont_deco_tot=(float) (a2/1.52);
                   
               sa2=a2-cont_deco_tot;
              
                ////////////////////////////////////////////////////////////////////////////////////
                  cont_serv_art=cont_serv_art+(total_desc_serv*numIn2);
               cont_serv=cont_serv+total_serva;
                a3=(cont_serv-cont_serv_art);
                cont_serv_tot=(float) (a3/1.60);
                   
               sa3=a3-cont_serv_tot;
               
                //////////////////////////////////////////////////////////////////////////////////
                 cont_lug_art=cont_lug_art+(total_desc_lug*numIn2);
               cont_lug=cont_lug+total_lugara;
                a4=(cont_lug-cont_lug_art);
                cont_lug_tot=(float) (a4/1.20);
                   
               sa4=a4-cont_lug_tot;
                
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
          
          cont_gastro_tot=cont_gastro_tot+cont_gastro_tot2;
           cont_deco_tot=cont_deco_tot+cont_deco_tot2;
           cont_serv_tot=cont_serv_tot+cont_serv_tot2;
           cont_lug_tot=cont_lug_tot+cont_lug_tot2;
            
            
            
          sa=sa+sas;
          sa2=sa2+sa2s;
          sa3=sa3+sa3s;
          sa4=sa4+sa4s;
          
          a=a+as;
          a2=a2+a2s;
          a3=a3+a3s;
          a4=a4+a4s;
          cont=cont+cont2;
               
         Sockets ob46 = new Sockets();
         ob46.llegada(cont,cont_gastro_tot,cont_deco_tot,cont_serv_tot,cont_lug_tot,sa,sa2,sa3,sa4,a,a2,a3,a4);
         ob46.setVisible(true);
    }
     
    
}
