/* 7. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano.
Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main (String args[]){
        int dia, mes;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o dia: ");
    dia = teclado.nextInt();
    System.out.println("Digite o mês(ex:3): ");
    mes = teclado.nextInt();
    
          if(mes == 1 && dia <= 30 ) { 
          System.out.println("Passaram "+ dia +" Dias, desde o inicio do ano");
          }
          else if(mes == 2 && dia <= 30 ) { 
          System.out.println("Passaram "+ (30+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 3 && dia <= 30 ) { 
          System.out.println("Passaram "+ (60+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 4 && dia <= 30 ) { 
          System.out.println("Passaram "+ (90+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 5 && dia <= 30 ) { 
          System.out.println("Passaram "+ (120+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 6 && dia <= 30 ) { 
          System.out.println("Passaram "+ (150+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 7 && dia <= 30 ) { 
          System.out.println("Passaram "+ (180+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 8 && dia <= 30 ) { 
          System.out.println("Passaram "+ (210+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 9 && dia <= 30 ) { 
          System.out.println("Passaram "+ (240+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 10 && dia <= 30 ) { 
          System.out.println("Passaram "+ (270+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 11 && dia <= 30 ) { 
          System.out.println("Passaram "+ (300+dia) +" Dias, desde o inicio do ano");
          }
          else if(mes == 12 && dia <= 30 ) { 
          System.out.println("Passaram "+ (330+dia) +" Dias, desde o inicio do ano");
          }else{
           System.out.println("*Dia ou mês INVALIDO ");   
    }
  }
}


