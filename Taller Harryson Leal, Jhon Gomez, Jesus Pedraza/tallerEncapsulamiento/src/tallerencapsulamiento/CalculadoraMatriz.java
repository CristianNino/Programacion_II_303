package tallerencapsulamiento;

/**
 * @author Harryson Eduardo Leal Benavides
 * @author Jesus Manuel Pedraza Ramirez
 * @author Jhon Jairo Gomez Torres
 */
public class CalculadoraMatriz {

    private int[][] matrizUno, matrizDos;

    public CalculadoraMatriz(int[][] matrizPrimaria, int[][] matrizSecundaria) {
        matrizUno = matrizPrimaria;
        matrizDos = matrizSecundaria;
    }
    // realizar la suma de ambas matrices
    public void suma() {

        if (matrizUno.length == matrizUno[0].length && matrizDos.length == matrizDos[0].length) {
            int[][] matrizSuma = new int[matrizUno.length][matrizUno.length];
            Matriz matrizUnoAux = new Matriz(matrizUno);
            Matriz matrizDosAux = new Matriz(matrizDos);
            
            for (int i = 0; i < matrizUno.length; i++) {
                for(int j = 0; j < matrizUno.length; j++) {
                    matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
                }
            }
            System.out.println("Primera matriz");
            matrizUnoAux.imprimirMatriz();
            System.out.println("\nSegunda matriz");
            matrizDosAux.imprimirMatriz();
            System.out.println("La Suma de estas dos matrices es es: ");
            Matriz matrizSumaAux = new Matriz(matrizSuma);
            matrizSumaAux.imprimirMatriz();
        } else {
            System.out.println("No se puede realizar con tamaños diferentes");
        }
    }
    // realizar la resta de ambas matrices
    public void resta() {
        if (matrizUno.length == matrizUno[0].length && matrizDos.length == matrizDos[0].length) {
            int[][] matrizSuma = new int[matrizUno.length][matrizUno.length];
            Matriz matrizUnoAux = new Matriz(matrizUno);
            Matriz matrizDosAux = new Matriz(matrizDos);
            
            for (int i = 0; i < matrizUno.length; i++) {
                for(int j = 0; j < matrizUno.length; j++) {
                    matrizSuma[i][j] = matrizUno[i][j] - matrizDos[i][j];
                }
            }
            System.out.println("Primera matriz");
            matrizUnoAux.imprimirMatriz();
            System.out.println("\nSegunda matriz");
            matrizDosAux.imprimirMatriz();
            System.out.println("La Resta de estas dos matrices es es: ");
            Matriz matrizSumaAux = new Matriz(matrizSuma);
            matrizSumaAux.imprimirMatriz();
        } else {
            System.out.println("No se puede realizar con tamaños diferentes");
        }
    }

    // realiza la traza de ambas matrices    
    public void traza() {
        int trazaSumaUno = 0, trazaSumaDos = 0;
        if (matrizUno.length == matrizUno[0].length && matrizDos.length == matrizDos[0].length) {
            for (int i = 0; i < matrizUno.length; i++) {
                trazaSumaUno += matrizUno[i][i];
                trazaSumaDos += matrizDos[i][i];
            }
            System.out.println("La traza de la matriz uno es: " + trazaSumaUno);
            System.out.println("La traza de la matriz dos es: " + trazaSumaDos);
        } else {
            System.out.println("No se puede realizar con tamaños diferentes");
        }
    }

    public void determinante() {
        int DeterminanteUno = 1, DeterminanteDos = 1;
        int determinanteUno = 1, determinanteDos = 1;
 
        if (matrizUno.length == matrizUno[0].length && matrizDos.length == matrizDos[0].length) {
            for (int i = 0; i < matrizUno.length; i++) {
                determinanteUno *= matrizUno[matrizUno.length - i][matrizUno.length - i];
                DeterminanteUno *= matrizUno[i][i];
                           
                determinanteDos *= matrizDos[matrizUno.length - i][matrizUno.length - i];
                DeterminanteDos *= matrizDos[i][i];
                
            }
            DeterminanteUno = DeterminanteUno - determinanteUno;
            DeterminanteDos = DeterminanteDos - determinanteDos;
            System.out.println("La Determinante de la matriz uno es: " + DeterminanteUno);
            System.out.println("La Determinante de la matriz dos es: " + DeterminanteDos);
        } else {
            System.out.println("No se puede realizar con tamaños diferentes");
        }
    }
}
