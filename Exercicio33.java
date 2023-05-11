//33. Faça um algoritmo que calcule e mostre a área de um trapézio. Sabe-se que: A = (base maior + base menor)* altura)/2 ;

package dsm20231.listaP1;

import java.util.Scanner;


public class Exercicio33 {
    
       public static void main(String[]args){
        
        double A, basemaior, basemenor, altura;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a base maior: ");
        basemaior = teclado.nextDouble();
         System.out.print("Digite a base menor: ");
        basemenor = teclado.nextDouble();
        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();
       
        
       A = ((basemaior + basemenor)* altura)/2 ; 
        
        System.out.print("A  área de um trapézio é: "+ A);

    }
    
}
