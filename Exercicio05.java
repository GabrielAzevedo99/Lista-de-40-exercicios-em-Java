/* 5. Um motorista deseja colocar no seu tanque X reais de gasolina.
Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
e exibir quantos litros ele conseguiu colocar no tanque. */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main (String args[]){
        
        float precoGasolina, valorGastar;
        int litrosTotal;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o preço atual da gasolina: ");
    precoGasolina = teclado.nextFloat();
    System.out.println("Digite quanto quer gastar com gasolina: ");
    valorGastar = teclado.nextFloat();
    litrosTotal = (int) (valorGastar / precoGasolina);
    System.out.println(" Com esse valor você conseguira colocar "+ litrosTotal +" Litros de gasolina");
    
        
    }
    
}
