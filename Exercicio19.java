/* 19. A granja Frangotech possui um controle automatizado de cada frango da sua produção.
No pé direito  do  frango  há  um  anel  com  um  chip  de  identificação;
no  pé  esquerdo  são  dois  anéis  para  indicar o tipo de alimento que ele deve consumir.
Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50,
faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio19 {
    
                  public static void main (String args[]){
          
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite quantos frangos você tem: ");
     int frangos = teclado.nextInt();
          
     int chipDir = 4;
     double chipEsq = 2 * 3.50;
     
     double gastoTotal = (frangos * chipDir) + (frangos * chipEsq);
          
System.out.println("O gasto total para marcação dos frangos será: "+ gastoTotal);
          
          }
    
}
