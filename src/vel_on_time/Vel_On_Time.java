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
public class Vel_On_Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quien ob1 = new Quien ();
        ob1.setVisible(true);
       archivoos obj48= new archivoos();
       
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
         archivo = new File("src\\archivos\\Phantom.txt");
            archivo.delete();
        
    
}
}
