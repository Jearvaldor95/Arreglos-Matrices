/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bidimensional;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Bidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int fila, columna;
        System.out.println("ingrese el numero de filas  y de columnas ");
        fila = leer.nextInt();
        columna = leer.nextInt();

        int bidimension[][] = new int[fila][columna];
        System.out.println("ingrese los datos ");

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {

                bidimension[f][c] = leer.nextInt();

            }
        }
        for (int f = 0; f < fila; f++) {
            System.out.println();
            for (int c = 0; c < columna; c++) {

                System.out.print(bidimension[f][c]);
                //System.out.println("posicion["+f+c+"]contenido"+bidimension[f][c]);
            }
        }
        int suma = bidimension[1][0] + bidimension[2][2];
        System.out.println("la suma es :" + suma);

        int determinante = (bidimension[0][0] * bidimension[1][1] * bidimension[2][2] + bidimension[0][1] * bidimension[1][2] * bidimension[2][0] + bidimension[0][2] * bidimension[2][1] * bidimension[1][0])
                - (bidimension[2][0] * bidimension[1][1] * bidimension[0][2] + bidimension[2][1] * bidimension[1][2] * bidimension[0][0] + bidimension[2][2] * bidimension[0][1] * bidimension[1][0]);
        System.out.println("el determinante es :" + determinante);
    }

}
