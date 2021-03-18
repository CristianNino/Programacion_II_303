
package tallerencapsulamiento;

/*
Autor: Andres
*/

import java.util.Scanner;


public class operacionesdematrices {
    
    private int[][] matriz1;
    
    // crear una matriz con un tamañano personalizado
    public operacionesdematrices(int a, int b) {
        matriz1 = new int[a][b];
    } 
    
    public operacionesdematrices(int[][] matrizSecundaria) {
        matriz1 = matrizSecundaria;
    }
    // colocar los valores a la matriz
    public void setMatrizValores() {
        Scanner x = new Scanner(System.in);

        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[0].length; j++) {
                System.out.println("Diguite el valor en la posicion [" + i + "][" + j + "]" ); 
                matriz1[i][j] = Integer.parseInt(x.nextLine());
            }
        }
    }
    
    public int[][] getMatrizValores() {
        return this.matriz1;
    }
    
  
    public void imprimir() {
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[0].length; j++) {
                System.out.print("[" +matriz1[i][j]  + "]"); 
               
            }
            System.out.println();}}}
