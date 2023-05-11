/* 15. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar.
Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar,
mas faça com que Carlos  e  André  não  paguem  centavos.
Ex:  uma  conta  de  R$101,53  resulta  em  R$33,00  para  Carlos, R$33,00 para André e R$35,53 para Felipe. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio15 {
    
         public static void main (String args[]){
          double ValorCompra, ValorFelipe;
          int ValorCarlos,ValorAndre; 
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor total da conta:  ");
    ValorCompra = teclado.nextDouble();
    
             ValorCarlos = (int) ((33 * ValorCompra)/100);
             ValorAndre = (int) ((33 * ValorCompra)/100);
             ValorFelipe = (double) (ValorCompra - (ValorCarlos + ValorAndre)); 
    
    System.out.println("O valor da compra deu "+ ValorCarlos+ " para Carlos, "+ValorAndre+ " Para Andre e "+ValorFelipe+ " para Felipe");
    
         }
    
}
