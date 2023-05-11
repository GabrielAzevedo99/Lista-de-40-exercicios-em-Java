/* 10.  Construa  um  algoritmo  para  calcular  a  distância  entre  dois  pontos  do  plano  cartesiano.
Cada  ponto é um par ordenado (x,y). */

package dsm20231.listaP1;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        
        double x1, x2, y1, y2, distancia;

        System.out.print("Entre com x1 do primeiro ponto: ");
        x1 = input.nextDouble();
        System.out.print("Entre com x2 do segundo ponto: ");
        x2 = input.nextDouble();
        System.out.print("Entre com y1 do primeiro ponto: ");
        y1 = input.nextDouble();
        System.out.print("Entre com y2 do segundo ponto: ");
        y2 = input.nextDouble();
        
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distancia é: "+ distancia);
    }
    
}
