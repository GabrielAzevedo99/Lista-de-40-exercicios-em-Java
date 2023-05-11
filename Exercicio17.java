/* 17. Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um algoritmo para
ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este tipo de conversão). */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio17 {
    
              public static void main (String args[]){
          
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a temperatura Celsius: ");
     double tempCelsius = teclado.nextDouble();
          
     double Fahrenheit = (tempCelsius * 1.8) + 32;
          
System.out.println("A temperadura de Celsius convertida para Fahrenheit e: "+ Fahrenheit);
          
          }
    
}
