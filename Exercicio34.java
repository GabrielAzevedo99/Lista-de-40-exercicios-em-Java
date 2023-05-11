//34. Faça um algoritmo que calcule e mostre a área de um quadrado. Sabe-se que: A = lado * lado; 

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio34 {
    
       public static void main(String[]args){
        
        double A, lado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o lado ");
        lado = teclado.nextDouble();
        
        A = lado * lado;
        
        System.out.print("A area do quadrado é: "+ A);
    }
    
}
