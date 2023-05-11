/* 24.  Um  tonel  de  refresco  é  feito  com  8  partes  de  água  mineral  e
2  partes  de  suco  de  maracujá. Faça um algoritmo para calcular quantos litros
de água e de suco são necessários para se fazer X litros de refresco (informados pelo usuário). */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio24 {
    
    public static void main (String args[]) {
  
        double litrosRefresco;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de refresco desejada em litros: ");
        litrosRefresco = teclado.nextDouble();
        
           double QtdeAgua = litrosRefresco * 8 / 10;
        double QtdeSuco = litrosRefresco * 2 / 10;
        
        System.out.print("Para fazer essa quantidade de refresco sera necessario "+QtdeAgua+" lt de agua e "+QtdeSuco+" tl de suco");
        
        }
    
}
