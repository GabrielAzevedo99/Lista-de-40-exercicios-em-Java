/* 11.  Uma  fábrica  controla  o  tempo  de  trabalho  sem  acidentes  pela  quantidade  de  dias.
Faça  um  algoritmo para converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre 30 dias. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio11 {
    
       public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int dias, anos, mes;

        System.out.print("Informe quantos dias estao sem acidentes: ");
        dias = input.nextInt();
        
     anos = (int) Math.floor (dias / 360);
     
     mes = (int) Math.floor (dias / 30);
    
     System.out.println("fazem: " + anos + " ano(s),"+ mes + " mes(es), "+ dias +" dias sem acidentes. ");  
  }
}

