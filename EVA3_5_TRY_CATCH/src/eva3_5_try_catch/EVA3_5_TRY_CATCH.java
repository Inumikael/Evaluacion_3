/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_5_TRY_CATCH {

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
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    
}
