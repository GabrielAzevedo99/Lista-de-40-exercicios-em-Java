// 14. Calcule a área de uma pizza que possui um raio R (pi=3.14).

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio14 {
    
      public static void main (String args[]){
          double raio;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o raio da pizza: ");
    raio = teclado.nextDouble();
          
          double pi = 3.14;

          double area = pi * raio * raio;
          
          System.out.println("A area da pizza e: "+ area);
          
      }
}
