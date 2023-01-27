// Programa que imprime la suma de las filas y clumnas de una matris 4x5
 
package matrix4x5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Matrix4x5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i, j, sumafila1, sumafila2, sumafila3, sumafila4;
        int sumacolumna1, sumacolumna2, sumacolumna3, sumacolumna4, sumacolumna5;
        int matriz[][] = new int[4][5];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println("ingrese número en columna => " + (i) + " fila => " + (j) + "");
                matriz[i][j] = leer.nextInt();
            }
        }
        for (i = 0; i < 4; i++) {
            System.out.println("");
            for (j = 0; j < 5; j++) {
                System.out.println("posicion[" + i + j + "]contenido" + matriz[i][j]);
                System.out.println(matriz[i][j] + "");
            }
        }

        sumafila1 = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3] + matriz[0][4];
        System.out.println("la suma fila 1 es :" + sumafila1);

        sumafila2 = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3] + matriz[1][4];
        System.out.println("la suama fila 2 es" + sumafila2);

        sumafila3 = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3] + matriz[2][4];
        System.out.println("la suma fila 3 es :" + sumafila3);

        sumafila4 = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4];
        System.out.println("la suma fila 4 es:" + sumafila4);

        sumacolumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0];
        System.out.println("la suma columna 1 es:" + sumacolumna1);

        sumacolumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1];
        System.out.println("la suma columna 2 es:" + sumacolumna2);

        sumacolumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2];
        System.out.println("la suma columna 3 es:" + sumacolumna3);

        sumacolumna4 = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3];
        System.out.println("la suma columna 4 es:" + sumacolumna4);

        sumacolumna5 = matriz[0][4] + matriz[1][4] + matriz[2][4] + matriz[3][4];
        System.out.println("la suma columna 5 es:" + sumacolumna5);

        System.out.println("el vetor fila:[" + sumafila1 + "," + sumafila2 + "," + sumafila3 + "," + sumafila4 + "]");
        System.out.println("el vector columna:[" + sumacolumna1 + "," + sumacolumna2 + "," + sumacolumna3 + "," + sumacolumna4 + "," + sumacolumna5 + "]");
    }
    
}
