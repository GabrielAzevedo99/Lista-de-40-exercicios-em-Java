//40. Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa. 

package dsm20231.listaP1;

import java.util.Scanner;

public class exercicio40 {
               public static void main(String[]args){
        
        double catetoTri, catetoTri1;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o cateto do triangulo: ");
        catetoTri = teclado.nextDouble();
        System.out.print("Digite segundo cateto do triangulo: ");
        catetoTri1 = teclado.nextDouble();
  
        double hipotenusa = Math.sqrt(Math.pow(catetoTri , 2) + Math.pow(catetoTri1 , 2)); 
        
        System.out.print("O valor da hipotenuza é: "+ hipotenusa);

    }
    
}
