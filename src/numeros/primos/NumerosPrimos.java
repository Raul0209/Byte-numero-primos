/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.primos;

/**
 *
 * @author byrau
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int divisor = 2;
            boolean esPrimo = true;
            int numero = 1;
            
            for(int x = 1; x<= 10;)
                if(numero % divisor != 0) {
                    System.out.println(numero);
                    numero = numero +1;
                    x =x+ 1;
                }else {
                    numero =numero +1;
                }
            
    }
    
}
