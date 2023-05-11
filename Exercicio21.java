/* 21.  A  fábrica  de  refrigerantes  Meia-Cola  vende  seu  produto  em  três  formatos:
lata  de  350  ml,  garrafa  de  600  ml  e  garrafa  de  2  litros.
Se  um  comerciante  compra  uma  determinada  quantidade  de cada formato,
faça um algoritmo para calcular quantos litros de refrigerante ele comprou. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio21 {

    public static void main (String args[]) {
        int lata;
        int garrafa;
        int garrafaDois;
        double totalGarrafa;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de lada de 300 ml que comprou ");
        lata = teclado.nextInt();
        System.out.print("Digite a quantidade de garrafa de 600 ml que comprou ");
        garrafa = teclado.nextInt();
        System.out.print("Digite a quantidade de garrafa de 2 litros que comprou ");
        garrafaDois = teclado.nextInt();
        
        totalGarrafa = ((lata * 300) + (garrafa * 600) + (garrafaDois * 2000))/1000;
        
        System.out.print("Voce comprou "+totalGarrafa+" litros de refrigerante");
        
        
    }    
}

