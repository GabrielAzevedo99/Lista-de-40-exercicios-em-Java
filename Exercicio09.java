/* 9.  Uma  fábrica  de  camisetas  produz  os  tamanhos  pequeno,  médio  e  grande,
cada  uma  sendo  vendida respectivamente por 10, 12 e 15 reais.
Construa um algoritmo em que o usuário forneça a quantidade  de  camisetas  pequenas,
médias  e  grandes  referentes  a  uma  venda,  e  a  máquina  informe quanto será o valor arrecadado. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main (String args[]){
        
        int QdtCamisaP, QdtCamisaM, QdtCamisaG;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite quantas camisas pequenas você quer: ");
    QdtCamisaP = teclado.nextInt();
    System.out.println("Digite quantas camisas medias você quer: ");
    QdtCamisaM = teclado.nextInt();
    System.out.println("Digite quantas camisas grandes você quer: ");
    QdtCamisaG = teclado.nextInt();
    
    int valorCamisaP = QdtCamisaP * 10;
    int valorCamisaM = QdtCamisaM * 12;
    int valorCamisaG = QdtCamisaG * 15;
      
    System.out.println("O valor arrecadado em camisas será: "+ (valorCamisaP + valorCamisaM + valorCamisaG) + " Reais");
    
    }
    
}
