/*27.  Faça  um  algoritmo  que  receba  dois  números,  calcule  e  mostre  a
divisão  do  primeiro  número  pelo  segundo.
Sabe-se  que  o  segundo  número  não  pode  ser  zero,  portanto  não  é  necessário  se  preocupar com validações. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio27 {
    
    public static void main (String args[]) {
 
        double numUm, numDois;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numUm = teclado.nextDouble();
        System.out.print("Digite outro numero: ");
        numDois = teclado.nextDouble();
        
        double numDivisao = numUm/numDois;
        
        System.out.print("O primeiro numero dividido pelo segundo dara "+numDivisao);
        
    }
    
}
