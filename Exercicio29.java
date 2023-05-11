/* 29.  Faça  um  algoritmo  que  receba  o  preço  de  um  produto,  calcule  e
mostre  o  novo  preço,  sabendo-se que este sofreu um desconto de 10%. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio29 {
    public static void main (String args[]) {
       
        double preco;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o preco do produto: ");
        preco = teclado.nextDouble();
        
        double precoDec = preco - (10 * preco)/100;
        
      System.out.print("O preco com desconto de 10 porcento ficara: "+precoDec);
    
    }
    
}
