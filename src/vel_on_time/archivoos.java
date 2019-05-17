/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;


/**
 *
 * @author jose noel mantilla
 */
public class archivoos {
    
    
///////////////////////////////ARCHIVO CLIENTE/////////////////////////////////////////////////////////////////////////////////
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
        
    
    }
///////////////////////ARCHIVO COMIDA ////////// PROVEDOR BASE DE COMIDA /////////////////////////////////////////////////////////
    void arcprovcom(int id, String nombre, int prec, String serv,boolean t) {
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores Comida.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+id+ ";"+nombre+ ";"+prec+ ";"+serv+";"+ t +";";
            
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
        
    }
    /////////// PROVEDOR DE GASTRONOMIA OTRO ARTICULO////////////////////////////////
     void arcprovcompol(int id,String nombre,int prec,String serv, boolean provedor_gastro) {
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores Comida.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id +";"+nombre+";"+prec+";"+serv+";"+provedor_gastro+";";
            
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
        
    }
////////////////////////ARTICULO DE COMIDA ////////////////////////////////////////////////////////////////////////////////
    void artch(int id,String art, int precart, boolean provedor_gastro) {
           String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Articulos Comida.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id+ ";"+art+ ";"+precart+ ";"+ provedor_gastro +";";
            
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
    }
   
    //////////////////////ARCHIVO DE DECORACION /////////////////////////////////////////////////////////////////////////////

    void arcprovdeco(int id, String nombre, int prec, String serv,boolean provedor_deco) {
       
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores Decoración y ambientación.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+id+ ";"+nombre+ ";"+prec+ ";"+serv+";"+ provedor_deco +";";
            
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
        
    }
    /////////// PROVEDOR DE DECORACION OTRO ARTICULO////////////////////////////////
     void arcprovdecopol(int id,String nombre,int prec,String serv, boolean provedor_gastro) {
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores Decoración y ambientación.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id +";"+nombre+";"+prec+";"+serv+";"+provedor_gastro+";";
            
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
        
    }
///////////////////////////ARTICULO DE DECORACION /////////////////////////////////////////////////////////////////////////////
 
 void artdeco(int id,String art, int precart, boolean provedor_deco) {
     System.out.println("hola");
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Articulos Decoración y ambientación.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id+ ";"+art+ ";"+precart+ ";"+ provedor_deco +";";
            
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
    }

//////////////ARCHIVO SERVICIOS ///////////////////////////////////////////////////////////////////////////////////////////////////


    void arcprovserv(int id, String nombre, int prec, String serv,boolean provedor_deco) {
       
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores servicios.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+id+ ";"+nombre+ ";"+prec+ ";"+serv+";"+ provedor_deco +";";
            
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
        
    }
/////////// PROVEDOR DE SERVICIOS OTRO ARTICULO////////////////////////////////
     void arcprovservpol(int id,String nombre,int prec,String serv, boolean provedor_gastro) {
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores servicios.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id +";"+nombre+";"+prec+";"+serv+";"+provedor_gastro+";";
            
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
        
    }

///////////////////////////// ARTICULO SERVICIOS ////////////////////////////////////////////////////////////////////////

void artserv(int id,String art, int precart, boolean provedor_deco) {
     System.out.println("hola");
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Articulos servicios.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id+ ";"+art+ ";"+precart+ ";"+ provedor_deco +";";
            
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
    }

///////////////////////////// ARCHIVO LUGAR /////////////////////////////////////////////////////////////////////////////////////////

void arcprovlug(int id, String nombre, int prec, String serv,boolean provedor_deco) {
       
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores lugar.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+id+ ";"+nombre+ ";"+prec+ ";"+serv+";"+ provedor_deco +";";
            
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
        
    }
/////////// PROVEDOR DE LUGAR OTRO ARTICULO////////////////////////////////
     void arcprovlugarpol(int id,String nombre,int prec,String serv, boolean provedor_gastro) {
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Provedores lugar.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id +";"+nombre+";"+prec+";"+serv+";"+provedor_gastro+";";
            
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
        
    }



////////////////////////////// ARTICULO LUGAR ////////////////////////////////////////////////////////////////////////////////////////

void artlug(int id,String art, int precart, boolean provedor_deco) {
     System.out.println("hola");
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\lugar.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+id+ ";"+art+ ";"+precart+ ";"+ provedor_deco +";";
            
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
    }
/////////////////////////////////////////// Parte que modifica archivoos////////////////////////////////////////////////
 void Escribir(File fFichero,String cadena)
    {
       
        BufferedWriter bw;

        try
        {
         
         if(!fFichero.exists())
         {
             fFichero.createNewFile();
         }

          
            bw = new BufferedWriter(new FileWriter(fFichero,true));
            
            bw.write(cadena);
            bw.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

   
    void borrar (File Ffichero)
    {
        try
        {
          
            if(Ffichero.exists())
            {
                Ffichero.delete();
        
                System.out.println("Ficherro Borrado");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
    void modificar(File fAntiguo,String aCadena,String nCadena)
    {
      // System.out.println(aCadena+" \n "+ nCadena);
        Random numaleatorio = new Random(3816L);
        String nFnuevo = fAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
           nCadena=nCadena+"\n";
            System.out.print(nCadena);
        File fNuevo= new File(nFnuevo);
     
        BufferedReader br;
        try
        {
           
            if(fAntiguo.exists())
            {
                br = new BufferedReader(new FileReader(fAntiguo));

                String linea;

                while((linea=br.readLine()) != null)
                {
                   String id[]= linea.split(";");
                   String nombre[] = linea.split(";");
                   String prec[]= linea.split(";");
                   String serv[]= linea.split(";");
                   String name[]=nCadena.split(";");
                   String op[]= linea.split(";");
                   
                   if(nombre[2].equals(aCadena) && prec[3].equals("0") && serv[4].equals(" ")){
                       String aux;
                       aux=";"+id[1]+";"+name[2]+";"+prec[3]+";"+serv[4]+";"+op[5]+";" +"\n";
                        System.out.print(aux);
                         Escribir(fNuevo,aux);
                       
                   }else if(nombre[2].equals(aCadena)){
                        Escribir(fNuevo,nCadena);
              }
                    else
                    {
                        linea=linea+"\n";
                        Escribir(fNuevo,linea);
                    }
                }

           
                br.close();

              
                String nAntiguo = fAntiguo.getName();
               
                borrar(fAntiguo);
                
                fNuevo.renameTo(fAntiguo);




            }
            else
            {
                System.out.println("Fichero no Existe");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
   void archivo_cotizacion(int id2, String name2,int pres2,int numIn,int dia2,int mes2,int ano2,String termn){
        
       int alet;
       String fceha= dia2+"/"+mes2+"/"+ano2;
      // Random numaleatorio = new Random(250l);
        int random=(int) (Math.random() *1043) +1;  
        //comprobar(random);
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Cotizaciones.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+random+";"+id2+";"+name2+";"+pres2+";"+numIn+";"+fceha+";"+termn+";";
            
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
        
        
       
       
    }
       void modificarart(File fAntiguo,String aCadena,String nCadena)
    {
      // System.out.println(aCadena+" \n "+ nCadena);
        Random numaleatorio = new Random(3816L);
        String cadena1="";
        String nFnuevo = fAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
           nCadena=nCadena+"\n";
           String aux;
           // System.out.print(nCadena);
        File fNuevo= new File(nFnuevo);
     
        BufferedReader br;
        try
        {
           
            if(fAntiguo.exists())
            {
                br = new BufferedReader(new FileReader(fAntiguo));

                String linea;

                while((linea=br.readLine()) != null)
                {
                   String id[]= linea.split(";");
                   String nombre[] = linea.split(";");
                   String prec[]= linea.split(";");
                 //  String band[]=linea.split(";");
                   if(aCadena.equals(id[1])){
                      String id2[]=nCadena.split(";");
                      String bands[]=nCadena.split(";");
                       aux=cadena1+";"+id2[0]+";"+nombre[2]+";"+prec[3]+";"+bands[1]+";"+"\n";
                       Escribir(fNuevo,aux);
                   }
                  
                   
                }

           
                br.close();

              
                String nAntiguo = fAntiguo.getName();
               
                borrar(fAntiguo);
                
                fNuevo.renameTo(fAntiguo);




            }
            else
            {
                System.out.println("Fichero no Existe");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

   
  /* boolean comprobar(int x){
       boolean y=false;
     return y;  
   }*/
   void archprovar(int z,String x,String y){
      int alet;
      // Random numaleatorio = new Random(250l);
        int random=(int) (Math.random() *1043) +1;  
        //comprobar(random);
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        
        try{
            fichero = new FileWriter("src\\archivos\\Phantom.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 +";"+z+";"+x+";"+y+";";
            
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
   }
   void atccod(int id, String nombre, int nI,String fecha, int valortgast,int valortdeco,int valortserv,int valortlug, int valorTglo,String artGast,String artDeco,String artServ,String artLug,int presu2){
        String dato; 
        String cadena; 
         String cadena1="";
        FileWriter fichero = null; 
        PrintWriter linea = null;  
        int random=(int) (Math.random() *1043) +1;
        try{
            fichero = new FileWriter("src\\archivos\\Cotizaciones Realizadas.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
         
            
            cadena = cadena1 + ";"+ random+ ";"+id+";"+nombre+";"+nI+";"+fecha+";"+valortgast+";"+valortdeco+";"+valortserv+";"+valortlug+";"+valorTglo+";"+artGast+";"+artDeco+";"+artServ+";"+artLug+";"+presu2+";";
            
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
   }
     void generarPDF(String fid, String fnombre,String pres, String fni, String ffecha, String fvalortglob, String fvalorgastro, String fvalordeco, String fvalorserv, String fvalorlug, String fartgast, String fartdeco, String fartserv, String fartlug) throws DocumentException, FileNotFoundException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String nombre;
        nombre ="src\\archivos\\"+fid+" "+fnombre;
        
        Font fuente= new Font();
        Font fuente_dos= new Font();
               FileOutputStream archivo = new FileOutputStream(nombre+".pdf");
               Document documento= new Document();
               
               fuente.setFamily("COURIER");
               fuente.setFamily(Font.FontFamily.COURIER.toString());
               
               //fuente.setStyle(Font.BOLD);
               //-------------------------------------------------------------------
               fuente_dos.setStyle(Font.BOLD);
               //-------------------------------------------------------------------
               
               PdfWriter.getInstance(documento,archivo);
                documento.open();
                Paragraph parrafo= new Paragraph("CONTRATO");
                Paragraph parrafo2= new Paragraph("SALON DE EVENTOS VEL ON TIME",fuente_dos);
                Paragraph parrafo3= new Paragraph(" ");
                Paragraph parrafo4= new Paragraph(" ");
                Paragraph parrafo5= new Paragraph("Contrato de prestación de servicios para eventos, en esta ocasión con una celebración de tipo " + /*tipo de evento*/ ", a cargo por la empresa Vel On Time. A continuación, se definirá la información del prestatario y los servicios solicitados.");
                Paragraph parrafo6= new Paragraph(" ");
                Paragraph parrafo7= new Paragraph(" ");
                Paragraph parrafo8= new Paragraph("Informacion del cliente",fuente_dos);
                Paragraph parrafo9= new Paragraph(" ");
                Paragraph parrafo10= new Paragraph("ID: "+ fid,fuente);
                Paragraph parrafo11= new Paragraph("Nombre del cliente: "+ fnombre,fuente);
                Paragraph parrafo12= new Paragraph(" ");
                Paragraph parrafo13= new Paragraph("Informacion del evento",fuente_dos);
                Paragraph parrafo14= new Paragraph(" ");
                Paragraph parrafo15= new Paragraph("Presupuesto del cliente: "+pres,fuente);
                Paragraph parrafo16= new Paragraph("Numero de invitados: "+fni,fuente);
                Paragraph parrafo17= new Paragraph("Fecha: "+ffecha,fuente);
                Paragraph parrafo18= new Paragraph(" ");
                Paragraph parrafo19= new Paragraph("Los articulos cotizados son: ",fuente_dos);
                Paragraph parrafo20= new Paragraph(" ");
                Paragraph parrafo21= new Paragraph("Proveedor                                                         Articulos",fuente_dos);
                Paragraph parrafo22= new Paragraph("Gastronomia: "+fartgast,fuente);
                Paragraph parrafo23= new Paragraph("Lugar: "+fartlug,fuente);
                Paragraph parrafo24= new Paragraph("Servicios: "+fartdeco,fuente);
                Paragraph parrafo25= new Paragraph("Decoracion: "+fartserv,fuente);
                
                Paragraph parrafo26= new Paragraph(" ");
                Paragraph parrafo27= new Paragraph("Valores: ", fuente_dos);
                Paragraph parrafo28= new Paragraph("Valor total de Gastronomia:  "+fvalorgastro,fuente);
                Paragraph parrafo29= new Paragraph("Valor total de Lugar:  "+fvalorlug,fuente);
                Paragraph parrafo30= new Paragraph("Valor total de Servicios:  "+fvalorserv,fuente);
                Paragraph parrafo31= new Paragraph("Valor total de Decoracion:  "+fvalordeco,fuente);
                Paragraph parrafo32= new Paragraph(" ");
                
                
                Paragraph parrafo33= new Paragraph("VALOR TOTAL DEL EVENTO: "+ fvalortglob,fuente);
                
                Paragraph parrafo34= new Paragraph(" ");
                Paragraph parrafo35= new Paragraph(" ");
                Paragraph parrafo36= new Paragraph(" ");
                Paragraph parrafo37= new Paragraph("__________________________");
                Paragraph parrafo38= new Paragraph("Firma prestatario");
                Paragraph parrafo39= new Paragraph(" ");
                Paragraph parrafo40= new Paragraph(" ");
                Paragraph parrafo41= new Paragraph("__________________________");
                Paragraph parrafo42= new Paragraph("Firma empresa");
                
                
                parrafo.setAlignment(1);
                parrafo2.setAlignment(1);
                
                documento.add(parrafo);
                documento.add(parrafo2);
                documento.add(parrafo3);
                documento.add(parrafo4);
                documento.add(parrafo5);
                documento.add(parrafo6);
                documento.add(parrafo7);
                documento.add(parrafo8);
                documento.add(parrafo9);
                documento.add(parrafo10);
                documento.add(parrafo11);
                documento.add(parrafo12);
                documento.add(parrafo13);
                documento.add(parrafo14);
                documento.add(parrafo15);
                documento.add(parrafo16);
                documento.add(parrafo17);
                documento.add(parrafo18);
                documento.add(parrafo19);
                documento.add(parrafo20);
                documento.add(parrafo21);
                documento.add(parrafo22);
                documento.add(parrafo23);
                documento.add(parrafo24);
                documento.add(parrafo25);
                documento.add(parrafo26);
                documento.add(parrafo27);
                documento.add(parrafo28);
                documento.add(parrafo29);
                documento.add(parrafo30);
                documento.add(parrafo31);
                documento.add(parrafo32);
                documento.add(parrafo33);
                documento.add(parrafo34);
                documento.add(parrafo35);
                documento.add(parrafo36);
                documento.add(parrafo37);
                documento.add(parrafo38);
                documento.add(parrafo39);
                documento.add(parrafo40);
                documento.add(parrafo41);
                documento.add(parrafo42);
                documento.close();
   
              
        
    }
    

////////////////////////////////////////END /////////////////////////////////////////////////////////////////////////////////////////

}//FIN CLASE