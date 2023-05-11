/* 22.  Pedrinho  tem  um  cofrinho  com  muitas  moedas,  e  deseja  saber  quantos  reais  conseguiu  poupar. Faça  um
algoritmo  para  ler  a  quantidade  de  cada  tipo  de  moeda,  e  imprimir  o  valor  total  economizado, em  reais.
Considere  que  existam  moedas  de  1,  5,  10,  25  e  50  centavos,  e  ainda  moedas de 1 real.
Não havendo moeda de um tipo, a quantidade respectiva é zero. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio22 {
    
    public static void main (String args[]) {
        int cemUm;
        int cemCinco;
        int cemDez;
        int cemVinteCinco;
        int cemCinquenta;
        int umReal;
        double totalReal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantas moedas de 1 centavo poupou: ");
        cemUm = teclado.nextInt();
        System.out.print("Digite quantas moedas de 5 centavo poupou: ");
        cemCinco  = teclado.nextInt();
         System.out.print("Digite quantas moedas de 10 centavo poupou: ");
        cemDez = teclado.nextInt();
         System.out.print("Digite quantas moedas de 25 centavo poupou: ");
        cemVinteCinco = teclado.nextInt();
         System.out.print("Digite quantas moedas de 50 centavo poupou: ");
        cemCinquenta = teclado.nextInt();
         System.out.print("Digite quantas moedas de 1 Real poupou: ");
        umReal = teclado.nextInt();
        
        totalReal = ((cemUm * 1) + (cemCinco * 5) + (cemDez * 10) + (cemVinteCinco* 25) + (cemCinquenta* 50) + (umReal* 100))/100;
        
        System.out.print("Voce juntou "+totalReal+" Reais em seu cofre");
        }
    
}
