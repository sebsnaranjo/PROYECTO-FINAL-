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
    
    private  int prec2;
    void llegada_falsa(String gastro,String deco,String serv,String lug){
      
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
             int a=0;
              int a2=0;
               int a3=0;
                int a4=0;
             int numIn2;
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
               ////////////////////////////////////////////////////////////////////////////////////// 
                cont_deco_art=cont_deco_art+(total_desc_deco*numIn2);
               cont_deco=cont_deco+total_decoa;
                a2=(cont_deco-cont_deco_art);
                cont_deco_tot=(float) (a2/1.52);
                ////////////////////////////////////////////////////////////////////////////////////
                  cont_serv_art=cont_serv_art+(total_desc_serv*numIn2);
               cont_serv=cont_serv+total_serva;
                a3=(cont_serv-cont_serv_art);
                cont_serv_tot=(float) (a3/1.60);
                //////////////////////////////////////////////////////////////////////////////////
                 cont_lug_art=cont_lug_art+(total_desc_lug*numIn2);
               cont_lug=cont_lug+total_lugara;
                a4=(cont_lug-cont_lug_art);
                cont_lug_tot=(float) (a4/1.20);
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
           System.out.println( cont_gastro_art+" cont_gastro_art");
            System.out.println( cont_gastro+" cont_gastro");
            System.out.println(a+"a");
         System.out.println(cont_gastro_tot+"cont gastro");
         
          System.out.println( cont_deco_art+" cont_deco_art");
            System.out.println( cont_deco+" cont_deco");
            System.out.println(a2+"a");
         System.out.println(cont_deco_tot+"cont deco");
         
          System.out.println( cont_serv_art+" cont_serv_art");
            System.out.println( cont_serv+" cont_serv");
            System.out.println(a3+"a");
         System.out.println(cont_serv_tot+"cont serv");
         
          System.out.println( cont_lug_art+" cont_lug_art");
            System.out.println( cont_lug+" cont_lug");
            System.out.println(a4+"a");
         System.out.println(cont_lug_tot+"cont lug");
         Sockets ob46 = new Sockets();
         ob46.llegada(cont,cont_gastro_tot,cont_deco_tot,cont_serv_tot,cont_lug_tot);
         ob46.setVisible(true);
    }
     
     
    
    
}
