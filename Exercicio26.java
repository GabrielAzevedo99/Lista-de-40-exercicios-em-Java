//26. Faça um algoritmo que receba três números, calcule e mostre a multiplicação desses números.

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio26 {
    
    public static void main (String args[]) {
       
        double numUm, numDois, numTres;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        numUm = teclado.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numDois = teclado.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        numTres = teclado.nextDouble();
        
        double numMult = numUm * numDois * numTres;
        
        System.out.print("A multiplicacao desdes tres numeros dara: "+numMult);
   
    }
    
}
