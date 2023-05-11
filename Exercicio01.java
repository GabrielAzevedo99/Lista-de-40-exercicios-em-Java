/* 1.  A  imobiliária  Imóbilis  vende  apenas  terrenos  retangulares.
Faça  um  algoritmo  para  ler  as  dimensões de um terreno e depois exibir a área do terreno. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main (String args[]){
     
    double altura,base,area;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a base: ");
    base = teclado.nextDouble();
    System.out.println("Digite a altura: ");
    altura = teclado.nextDouble();
    area = base * altura;
    System.out.println("Valor da area = "+ area);
         
    }
}
