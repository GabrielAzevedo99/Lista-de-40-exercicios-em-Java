//37. Faça um algoritmo que calcule e mostre a tabuada de um número digitado pelo usuário. 

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio37 {
    
           public static void main(String[]args){
        
        int num, resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero para aparecer sua tabuada ");
        num = teclado.nextInt();
      
        
       for (int i = 1; i <= 10; i++) {
             resultado = num * i;
            System.out.print("\n" + num+ "X" + i + " = "+ resultado);
       }

    }
}

