/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = scan.nextInt();
        System.out.println("El valor capturado es: " + numero);
         int x = 100;
         int y = 0;
         int division = x / y;
            System.out.println("El resultado es: " + division);    
        }catch(InputMismatchException e){
            //Lo que queremos hacer con la instrucción
            System.out.println("El valor introducido no es un número entero");          
       
        
        }catch(ArithmeticException e){
            System.out.println("La division no es posible entre 0"); 
        }
        finally{
            //usar para ejecutar código critico
            //terminar procesos, cerrar archivos o conexiones
            //liberar recursos
            
          
             
       
        }
      }
   }
