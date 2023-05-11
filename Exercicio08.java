/* 8.  Faça  um  algoritmo  para  ler  três  notas  de  um  aluno  em  uma  disciplina
e  imprimir  a  sua  média  ponderada (as notas tem pesos respectivos de 1, 2 e 3). */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main (String args[]){
        
        double nota1, nota2, nota3, valor2, valor3;
        float media; 
        
     Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua primeira nota: ");
    nota1 = teclado.nextDouble();
    System.out.println("Digite sua segunda nota: ");
    nota2 = teclado.nextDouble();
    System.out.println("Digite sua terceira nota: ");
    nota3 = teclado.nextDouble();
    
   //Não coloquei a primeira nota pois o peso 1 vai sempre dar o valor da nota;
    valor2 = nota2 * 2;
    valor3 = nota3 * 3;
    media = (float) ((nota1 + valor2 + valor3) / 6);
    
    System.out.println(" Você ficou com a seguinte media na materia: "+ media);
            
    }
    
}
