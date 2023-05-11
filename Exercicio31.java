/* 31. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[]args){
        
        double peso, p15, p20;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();
        
        p15 = peso / 100 * 15 + peso;
        p20 = peso - ((peso / 100) * 20);
        
        System.out.print("Novo peso 15 porcento a mais: "+ p15 +"\nNovo peso com 20 porcento a menos: "+ p20);
    }
    
}
