/* 6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição.
Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos)
e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main (String args[]){
        
        double pesoPrato  = 0.800;
        double pesoComida, valorPagar;
        int precoQuilo = 12;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite peso do prato total(ex: 1,5kg): ");
    pesoComida = teclado.nextDouble();
    valorPagar = pesoComida * precoQuilo - pesoPrato;
    
    System.out.println(" O peso do prato ficou "+ pesoComida +" Kg, valor a pagar "+ valorPagar);
        
    }
    
}
