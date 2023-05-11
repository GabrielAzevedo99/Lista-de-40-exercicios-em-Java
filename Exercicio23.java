/* 23. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente longa.
Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre da sua altura,
faça um algoritmo para ler os dados necessários e calcular a altura do prédio. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio23 {
    
    public static void main (String args[]) {
        
    double pessoaAltu, pessoaSomb, predioSomb;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua altura em metros: ");
        pessoaAltu = teclado.nextDouble();
        System.out.print("Digite o comprimento da sua sombra em metros: ");
        pessoaSomb = teclado.nextDouble();
        System.out.print("Digite o comprimento da sombra do prédio em metros: ");
        predioSomb = teclado.nextDouble();
        
        double alturaPredio = pessoaAltu * (predioSomb / pessoaSomb);
        
        System.out.print("A altura total do predio é "+alturaPredio+" metros aproximadamente");
        
        
    }
    
}
