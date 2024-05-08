/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author invitado
 */
public class EVA3_12_LEER_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    final static String miRuta = "C:\\archivos\\test_text.txt";
    public static void main(String[] args){
        try {
            
            leerArchivosFiles(miRuta);
            leerArchivoBuffered(miRuta);
            leerArchivosFileReader(miRuta);
            leerArchivosScanner(miRuta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*
    Lectura de archivos usando la clase files.
    Se lee todo el archivo y se carga en la ram.
    Por tanto, es útil solo para archivos pequeños.
    */
    public static void leerArchivosFiles(String ruta) throws IOException{
        System.out.println("Lectura de archivo con clase de texto file*******************");
        Path path = Paths.get(ruta); // Crea la ruta de tipo path
        byte[] datos = Files.readAllBytes(path); // Genera un IO Exception
        System.out.println(new String(datos)); // new String convertira el arreglo de byte a cadena de texto. 
    }
    //es adecuado para leer archivos grandes
    // nos permite procesar archivos de texto linea por linea
    // es adecuado para la multitarea(ejecucion de hilos)
    
    public static void leerArchivoBuffered(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lecutra de archivo de texto metodo buffer *****************");
        //abrir el archivio
        //leer el archivo
        //Convertir la informacion binaria a texto
        File file = new File(ruta); 
        FileInputStream in = new FileInputStream(file);    
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String cade;
        //signamos la linea a la variable cade
        //si cade es diferente de null estamos
        //leeyendo texto, si leemos null, llegamos
        //al final del archivo
        while((cade = br.readLine()) != null){
            System.out.println(cade);
        }
        br.close();
    }
    public static void leerArchivosFileReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de archivo de texto con la clase File Reader ***********************");
        File file = new File(ruta); 
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String cade;
        //signamos la linea a la variable cade
        //si cade es diferente de null estamos
        //leeyendo texto, si leemos null, llegamos
        //al final del archivo
        while((cade = br.readLine()) != null){
            System.out.println(cade);
        }
        br.close();
    }
    public static void leerArchivosScanner(String ruta) throws IOException{
        System.out.println("Lectura de archivos de texto con la clase scanner **************");
        Path path = Paths.get(ruta);
        Scanner scan = new Scanner(path);
        while((scan.hasNextLine())){
            String cade = scan.nextLine();
            System.out.println(cade);
        }
        scan.close();
    }
}
