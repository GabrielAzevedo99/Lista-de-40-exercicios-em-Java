/* 4. Escreva um algoritmo para ler o nome e a idade de uma pessoa,
e exibir quantos dias de vida ela  possui.  Considere  sempre  anos  completos,
e  que  um  ano  possui  365  dias.
Ex:  uma  pessoa  com 19 anos possui 6935 dias de vida;
veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main (String args[]){
        
        int idade, diasVida;
        String nome = "";
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    nome = teclado.nextLine();
    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();
    diasVida = idade * 365;
    System.out.println(nome +" Você já viveu "+ diasVida +" Dias");
    
    }
    
}
