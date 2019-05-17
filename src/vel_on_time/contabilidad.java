/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author jose noel mantilla
 */
public class contabilidad {
    
     void archCli(int id, String name, int pres, int numI, String fecha) {
         
        String dato; 
        String cadena; 
        String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        
        try{
            fichero = new FileWriter("src\\archivos\\Datos Cliente.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+id+ ";"+name+ ";"+pres+ ";"+numI+";"+fecha +";";
            
            linea.println(cadena); //escribiendo en el archivo
            
      }catch(IOException e){
           System.out.print("Error creando archivo");
        }
        finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch(IOException e1){
                System.out.print("Error cerrando archivo");
            }
        }
        Sockets ob36 = new Sockets();
       ob36.setVisible(true); 
    
    }
     
     
    
    
}
