/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_propagacion_excepciones;

/**
 *
 * @author invitado
 */
public class EVA3_3_PROPAGACION_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        a();
    }
    public static void a(){
        b();
    }
     public static void b(){
        c();
    }
      public static void c(){
          
        int x = 10, y = 0;
        int igual = x/y;
          System.out.println(igual);
    }
}
