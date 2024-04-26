/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_uso_excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner captu = new Scanner(System.in);
        int nume = 0;
        int divi = 0;

        
        while (true) {
            try {
                System.out.println("Introduce el numerador");
                nume = captu.nextInt();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero. Intente nuevamente.");
                captu.next(); 
            }
        }

    
        while (true) {
            try {
                System.out.println("Introduce el divisor");
                divi = captu.nextInt();
                if (divi == 0) {
                    System.out.println("Error: no se puede dividir entre cero. Intente nuevamente.");
                    continue; 
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero. Intente nuevamente.");
                captu.next(); 
            }
        }

        int resu = nume / divi;
        System.out.println("resultado = " + resu);

        System.out.println("Fin del programa");
    }
    
}
