/*39.João  recebeu  seu  salário  de  R$  1200,00  e  precisa  pagar  duas  contas
(C1=R$  200,00  e  C2=R$120,00) que estão atrasadas.
Como as contas estão atrasadas, João terá de pagar multa de 2% sobre cada conta.
Faça um algoritmo que calcule e mostre quanto restará do salário do João */

package dsm20231.listaP1;

public class Exercicio39 {
    
               public static void main(String[]args){
        
       
        double salario = 1200;
        int C1 = 204;
        double C2 = 122.4;
        
        System.out.print("Com o salario de 1200 e seus devidos descontos sobrara: "+ (salario - (C1 + C2)));
       
    }
    
}
