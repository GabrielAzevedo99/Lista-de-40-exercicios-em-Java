// 32. Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas. 

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio32 {
    
       public static void main(String[]args){
        
        double pesoKg, pesoGr;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        pesoKg = teclado.nextDouble();
        
       pesoGr = pesoKg * 1000;
        
        System.out.print("O seu peso em gramas é: "+ pesoGr);

    }
    
}
