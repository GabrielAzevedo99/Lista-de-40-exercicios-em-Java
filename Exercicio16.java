/* 16. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo,
uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas,
e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer,
e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio16 {
    
          public static void main (String args[]){
          
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de sanduiches a fazer: ");
     int QtdSanduiche = teclado.nextInt();
          
              int queijoLanche = 50 * 2;
              int presuntoLanche = 50;
              int hamburguerLanche = 100;
          
              double QtdQueijo = queijoLanche * QtdSanduiche / 1000;
              double QtdPresunto = presuntoLanche * QtdSanduiche / 1000;
              double Qtdhamburguer = hamburguerLanche * QtdSanduiche / 1000;
          
System.out.println("Para essa Qtad de lanche sera necessario "+ QtdQueijo+" Kg de queijo, "+QtdPresunto+" Kg de presunto e "+Qtdhamburguer+" Kg de humburguer." );
          
          }
}
