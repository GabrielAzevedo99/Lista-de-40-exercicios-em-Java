/* 20. Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos.
Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main (String args[]){
          
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite quantas blusas produz: ");
     int blusa = teclado.nextInt();
     System.out.println("Digite quanto novelo de la usa: ");
     double novelo = teclado.nextDouble();
          
     double totalNovelo = novelo / blusa;
          
System.out.println("É gasto "+ totalNovelo+" novelos de la por blusa.");
          
          }
    
}
