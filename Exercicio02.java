/* 2.  Faça  um  algoritmo  para  calcular  quantas  ferraduras  são
necessárias para  equipar  todos  os  cavalos comprados para um haras. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main (String args[]){
    
    int numCavalos, numFeradura;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite quantos cavalos comprou para o harado: ");
    numCavalos = teclado.nextInt();
    numFeradura = numCavalos * 4;
    System.out.println("Numeros de feraduras necessarias = "+ numFeradura);

}
}
