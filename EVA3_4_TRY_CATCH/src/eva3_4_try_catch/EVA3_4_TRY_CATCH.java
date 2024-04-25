/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arithmeticException
        
        int x =10, y=0;
        int igual =0;
    
    
    try{//aqui va el código que puede fallar
        igual = x / y;
        System.out.println("El resultado es" + igual);
    }catch(ArithmeticException e){// aqui va la solucion
        // que queremos hacer con con este segmento de codigo
        e.printStackTrace();
    }
    
        System.out.println("el resultado es" + igual);
    }
    
}
