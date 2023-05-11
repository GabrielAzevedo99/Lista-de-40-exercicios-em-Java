/* 3. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade
de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50.
Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos),
e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas,
e depois calcular os dados solicitados. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main (String args[]){
        
    int paes, broa;
    double valorBroa, valorpaes, lucroDoDia, valorGuardar;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite quantos pães vendeu: ");
    paes = teclado.nextInt();
    System.out.println("Digite quantas broas vendeu: ");
    broa = teclado.nextInt();
    valorpaes = paes * 0.12;
    valorBroa = broa * 1.50;
    lucroDoDia = valorpaes + valorBroa;
    valorGuardar = 10 * lucroDoDia / 100;
    System.out.println("Lucro do dia com pães e broas = "+ lucroDoDia +", Valor a guardar = "+ valorGuardar);
      
    }
    
}
