
package tallerencapsulamiento;

import java.util.Scanner;

/**
 * @author Harryson Eduardo Leal Benavides
 * @author Jesus Manuel Pedraza Ramirez
 * @author Jhon Jairo Gomez Torres
 */
public class Matriz {
    private int[][] matrizInicial;
    
    // crear una matriz con un tamañano personalizado
    public Matriz(int tamano1, int tamano2) {
        matrizInicial = new int[tamano1][tamano2];
    } 
    
    public Matriz(int[][] matrizSecundaria) {
        matrizInicial = matrizSecundaria;
    }
    // colocar los valores a la matriz
    public void setMatrizValores() {
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < matrizInicial.length; i++) {
            for(int j = 0; j < matrizInicial[0].length; j++) {
                System.out.println("Diguite el valor en la posicion [" + i + "][" + j + "]" ); 
                matrizInicial[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }
    }
    
    public int[][] getMatrizValores() {
        return this.matrizInicial;
    }
    
    // imprimir la matriz
    public void imprimirMatriz() {
        for(int i = 0; i < matrizInicial.length; i++) {
            for(int j = 0; j < matrizInicial[0].length; j++) {
                System.out.print("[" +matrizInicial[i][j]  + "]"); 
               
            }
            System.out.println();
        }
    }
    
    
}
