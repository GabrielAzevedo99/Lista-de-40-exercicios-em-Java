/*12. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%.
Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio12 {
    
       public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        
        float numSalario, porcentagem, Aumentsalario, porcentagem2, desconto;

        System.out.print("Entre com seu salario: ");
        numSalario = input.nextFloat();
        
        porcentagem = (15 * numSalario)/100 ;
        Aumentsalario = (numSalario + porcentagem);
        porcentagem2 = (8 * Aumentsalario)/100;
        desconto = (Aumentsalario - porcentagem2);
        
       System.out.print("salario inicial "+ numSalario +" salario com aumento " + Aumentsalario +" Salario final "+ desconto); 
    
}
}
