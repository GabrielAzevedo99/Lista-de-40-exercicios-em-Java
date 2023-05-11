/* 38.  Faça  um  algoritmo  que  receba  o  ano  de  nascimento  de  uma  pessoa  e  o  ano  atual, calcule  e  mostre:
a) a idade dessa pessoa em anos;
b) a idade dessa pessoa em meses;
c) a idade dessa pessoa em dias;
d) a idade dessa pessoa em semanas. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio38 {
    
       public static void main(String[]args){
        
        int anoAtual, anoNasc;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano atual ");
        anoAtual = teclado.nextInt();
        System.out.print("Digite o ano que nasceu ");
        anoNasc = teclado.nextInt();
        
        int anos = anoAtual - anoNasc;
        int meses = anos * 12;
        int dias = meses * 360;
        int semana = dias / 7;
        
        System.out.print("Voce tem "+ anos +" anos "+ meses+ ", meses "+ dias+" dias " +semana+" semanas de vida");
        
    }
    
}
