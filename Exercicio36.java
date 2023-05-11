/* 36. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio36 {
           
    public static void main(String[]args){
        
        double salarioMin, seuSalario, Qtd;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salario minimo atual ");
        salarioMin = teclado.nextDouble();
        System.out.print("Digite seu salario ");
        seuSalario = teclado.nextDouble();
        
       Qtd = seuSalario/salarioMin;
        
        System.out.print("Você recebe "+ Qtd+ " salarios minimos");

    }
    
}
