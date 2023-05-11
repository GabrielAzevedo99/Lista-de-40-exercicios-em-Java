//25. Calcule o volume de uma caixa d'água cilíndrica.

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio25 {
    
    public static void main (String args[]) {
  
        double raio, altura, volumeCaixaAgua;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio da caixa de agua: ");
        raio = teclado.nextDouble();
        System.out.print("Digite a altura da caixa de agua: ");
        altura = teclado.nextDouble();

        double pi = 3.14;
        
        volumeCaixaAgua = (pi * raio * raio * altura);
        
        System.out.print("O volume da caixa de agua é: "+volumeCaixaAgua);
            
    }
    
}
