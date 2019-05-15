/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Datos Cliente.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Comida.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Comida.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Articulos Comida.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Decoración y ambientación.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores Decoración y ambientación.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Articulos Decoración y ambientación.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores servicios.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores servicios.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Articulos servicios.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores lugar.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Provedores lugar.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\lugar.txt",true); //crea el archivo 
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
                   
                   if(nombre[2].equals(aCadena) && id[1].equals("0")){
                       String aux;
                       aux=";"+id[1]+";"+name[2]+";"+prec[3]+";"+serv[4]+";"+ "\n";
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Cotizaciones.txt",true); //crea el archivo 
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
            fichero = new FileWriter("C:\\Users\\jose noel mantilla\\Desktop\\Phantom.txt",true); //crea el archivo 
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
    
    

////////////////////////////////////////END /////////////////////////////////////////////////////////////////////////////////////////

}//FIN CLASE