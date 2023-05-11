/* 13. Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
CENTENA = x DEZENA = x UNIDADE = x */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro com até 3 dígitos: ");
        int num = scanner.nextInt();

       int centena = num / 100 * 100;
        int dezena = (num % 100) / 10 * 10;
        int unidade = num% 10;
        
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
        
        }
    }
    
