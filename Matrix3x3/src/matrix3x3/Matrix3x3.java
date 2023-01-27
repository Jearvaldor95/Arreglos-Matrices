/*
 
 */
package matrix3x3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Matrix3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner buscar = new Scanner(System.in);

        int sumafila1, sumafila2, sumafila3;
        int sumacolumna1, sumacolumna2, sumacolumna3;
        int SumaFilaColumna[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese el valor en la posicion " + i + "," + j);
                SumaFilaColumna[i][j] = buscar.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.println(SumaFilaColumna[i][j] + "");

            }
        }
        sumafila1 = SumaFilaColumna[0][0] + SumaFilaColumna[0][1] + SumaFilaColumna[0][2];
        System.out.println("la suma fila 1 es :" + sumafila1);

        sumafila2 = SumaFilaColumna[1][0] + SumaFilaColumna[1][1] + SumaFilaColumna[1][2];
        System.out.println("la suma fila 2 es :" + sumafila2);

        sumafila3 = SumaFilaColumna[2][0] + SumaFilaColumna[2][1] + SumaFilaColumna[2][2];
        System.out.println("la suma fila 3 es :" + sumafila3);

        sumacolumna1 = SumaFilaColumna[0][0] + SumaFilaColumna[1][0] + SumaFilaColumna[2][0];
        System.out.println("la suma columna 1 es :" + sumacolumna1);

        sumacolumna2 = SumaFilaColumna[0][1] + SumaFilaColumna[1][1] + SumaFilaColumna[2][1];
        System.out.println("la suma columna 2 es :" + sumacolumna2);

        sumacolumna3 = SumaFilaColumna[0][2] + SumaFilaColumna[1][2] + SumaFilaColumna[2][2];
        System.out.println("la suma columna 3 es :" + sumacolumna3);

        System.out.println("el vector suma fila:[" + sumafila1 + "," + sumafila2 + "," + sumafila3 + "]");

        System.out.println("el vector suma columna:[" + sumacolumna1 + "," + sumacolumna2 + "," + sumacolumna3 + "]");
    }

}
