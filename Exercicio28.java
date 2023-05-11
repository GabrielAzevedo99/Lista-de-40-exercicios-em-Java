/* 28. Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas notas,
considerando peso 2 para a primeira nota e peso 3 para a segunda nota. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio28 {
    
    public static void main (String args[]) {
       
        double nota1, nota2;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = teclado.nextDouble();
        
        double totalMedia = ((nota1 * 2) + (nota2 * 3))/5;
        
        System.out.print("Voce ficou com a seguinte media ponderada: "+totalMedia);
  
    }
    
}
