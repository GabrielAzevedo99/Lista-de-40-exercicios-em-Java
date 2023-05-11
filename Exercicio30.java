/* 30.  Um  funcionário  recebe  um  salário  fixo  mais  4%  de  comissão  sobre  as  vendas.
Faça  um  algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas,
calcule e mostre a comissão e o salário final do funcionário. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio30 {
    
    public static void main (String args[]) {

        double salario, valorVendas;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu salario: ");
        salario = teclado.nextDouble();
        System.out.print("Digite o valor total em vendas ");
        valorVendas = teclado.nextDouble();
        
        double comissao = (4 * valorVendas)/100;
        double salarioFinal = (salario + comissao);
        
        System.out.print("A sua comissao foi: "+comissao+" E o seu salario com comissao sera: "+salarioFinal);
        
        
    }
    
}
