// Programa que imprime el numero de cero que se encuentra en cada reglon o fila de una matriz 5x5
package matriz5x5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Matriz5x5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int Renglon1 = 0, Renglon2 = 0, Renglon3 = 0, Renglon4 = 0, Renglon5 = 0;

        int CeroenMatriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.println("ingrese los valores " + i + "," + j);
                CeroenMatriz[i][j] = leer.nextInt();

            }
        }
        for (int i = 0; i < CeroenMatriz.length; i++) {
            for (int j = 0; j < 5; j++) {

                if (CeroenMatriz[0][0] == 0 && CeroenMatriz[0][1] == 0 && CeroenMatriz[0][2] == 0 && CeroenMatriz[0][3] == 0 && CeroenMatriz[0][4] == 0) {

                    CeroenMatriz[i][j]++;
                }
                if (CeroenMatriz[1][0] == 0 && CeroenMatriz[1][1] == 0 && CeroenMatriz[1][2] == 0 && CeroenMatriz[1][3] == 0 && CeroenMatriz[1][4] == 0) {
                    Renglon2++;
                }
                if (CeroenMatriz[2][0] == 0 && CeroenMatriz[2][1] == 0 && CeroenMatriz[2][2] == 0 && CeroenMatriz[2][3] == 0 && CeroenMatriz[2][4] == 0) {
                    Renglon3++;
                }
                if (CeroenMatriz[3][0] == 0 && CeroenMatriz[3][1] == 0 && CeroenMatriz[3][2] == 0 && CeroenMatriz[3][3] == 0 && CeroenMatriz[3][4] == 0) {
                    Renglon4++;
                }
                if (CeroenMatriz[4][0] == 0 && CeroenMatriz[4][1] == 0 && CeroenMatriz[4][2] == 0 && CeroenMatriz[4][3] == 0 && CeroenMatriz[4][4] == 0) {
                    Renglon5++;
                }

            }
        }
        System.out.println("la cantidad de cero en el renglón 1 es:" + Renglon1);
        System.out.println("la cantidad de cero en el renglón 2 es:" + Renglon2);
        System.out.println("la cantidad de cero en el renglón 3 es:" + Renglon3);
        System.out.println("la cantidad de cero en el renglón 4 es:" + Renglon4);
        System.out.println("la cantidad de cero en el renglón 5 es:" + Renglon5);
    }
    
}
