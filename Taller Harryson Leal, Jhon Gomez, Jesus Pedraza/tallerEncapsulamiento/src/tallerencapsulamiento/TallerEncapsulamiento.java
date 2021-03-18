package tallerencapsulamiento;

import java.util.Scanner;

/**
 * @author Harryson Eduardo Leal Benavides
 * @author Jesus Manuel Pedraza Ramirez
 * @author Jhon Jairo Gomez Torres
 */
public class TallerEncapsulamiento {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        // pidiendo datos para la primera matriz
        System.out.println("Diguite el tamaño de la primera matriz (ejemplo 3x3)");
        String tam = teclado.nextLine();
        String[] tamanoMatriz = tam.split("x");
        Matriz matrizUno = new Matriz(Integer.parseInt(tamanoMatriz[0]), Integer.parseInt(tamanoMatriz[1]));
        System.out.println("Llenar la primera matriz");
        matrizUno.setMatrizValores();
        // pidiendo datos para la Segunda matriz
        System.out.println("Diguite el tamaño de la segunda matriz (ejemplo 3x3)");
        tam = teclado.nextLine();
        tamanoMatriz = tam.split("x");
        Matriz matrizDos = new Matriz(Integer.parseInt(tamanoMatriz[0]), Integer.parseInt(tamanoMatriz[1]));
        System.out.println("Llenar la Segunda matriz");
        matrizDos.setMatrizValores();
        
        // creando calculadora de matrices
        CalculadoraMatriz calculadora = new CalculadoraMatriz(matrizUno.getMatrizValores(), matrizDos.getMatrizValores());

        while (opcion != 5) {
            // pedir al usuario que quiere hacer
            System.out.println("1) Sumar las matrices\n"
                    + "2) Restar las matrices\n"
                    + "3) Traza de las matrices\n"
                    + "4) Determinante de las matrices\n"
                    + "5) salir");
            opcion = Integer.parseInt(teclado.nextLine());
            // realizando lo pedido por el usuario
            switch (opcion) {
                case 1:
                    calculadora.suma();
                    break;
                case 2:
                    calculadora.resta();
                    break;
                case 3:
                    calculadora.traza();
                    break;
                case 4:
                    calculadora.determinante();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion Invalida Intentelo de nuevo");
            }
        }
    }

}
