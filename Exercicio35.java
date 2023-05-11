/*35.  Faça  um  algoritmo  que  calcule  e  mostre  a  área  de  um  losango.
Sabe-se  que:  A  =  (diagonal_maior * diagonal_menor)/2; */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio35 {
    
           public static void main(String[]args){
        
        double A, diagonal_maior, diagonal_menor, altura;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a diagonal maior: ");
        diagonal_maior = teclado.nextDouble();
         System.out.print("Digite a diagonal menor: ");
        diagonal_menor = teclado.nextDouble();
        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();
       
        
        A  =  (diagonal_maior * diagonal_menor)/2; 
        
        System.out.print("A  área  de  um  losango é: "+ A);

    }
    
}
