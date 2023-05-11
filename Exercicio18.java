/* 18. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
Faça  um  algoritmo  para  calcular  e  imprimir  o  salário  bruto  e  o  salário  líquido
de  um  determinado  funcionário.  Considere  que  o  salário  líquido  é  igual  ao  salário  bruto
descontando-se  10%  de  impostos. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio18 {
    
                  public static void main (String args[]){
          
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite suas horas de trabalho normal no dia: ");
     int horasTrabalho = teclado.nextInt();
     System.out.println("Digite quantas dias trabalha no mês: ");
     int diasTrabalho = teclado.nextInt();
     System.out.println("Digite quantas horas extras fez no mês: ");
     int horaExt = teclado.nextInt();
          
    int QtdHoras = horasTrabalho * diasTrabalho;
    double salaSemDes = (QtdHoras * 10) + (horaExt * 15);
    double desconto = (10 * salaSemDes)/100;
    double salaTotal = salaSemDes - desconto;
          
System.out.println("Voce ganhara: "+ salaTotal);
          
          }
    
}
