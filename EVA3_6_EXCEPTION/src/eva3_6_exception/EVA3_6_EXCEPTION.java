/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_exception;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numerado");
        int nume = captu.nextInt();
        System.out.println("Introduce el divisor");
        int divi = captu.nextInt();
        int resu = 0;
        resu = nume / divi;
        System.out.println("resultado = " + resu);
        }catch(Exception e){
            
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    //InputMismatchException
    //Pedir un número entero: si el usuario no captura un entero hay que volver a solicitar el dato
    //Manejo con excepciones
}
