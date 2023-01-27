/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglotridimensional;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArregloTridimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);

        int fila, columna, pro;
        System.out.println("ingrese el numero de filas de columnas y de profundidad");
        fila = leer.nextInt();
        columna = leer.nextInt();
        pro = leer.nextInt();

        int tridimension[][][] = new int[fila][columna][pro];
        System.out.println("ingrese los datos ");

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                for (int p = 0; p < pro; p++) {
                    tridimension[f][c][p] = leer.nextInt();
                }
            }
        }
        for (int f = 0; f < fila; f++) {
            System.out.println();
            for (int c = 0; c < columna; c++) {

                for (int p = 0; p < pro; p++) {
                    //para mostrar las posiciones de cada valor

                    //System.out.println("posicion["+f+c+p+"]contenido"+tridimension[f][c][p]);
                    //para mostrar los numeros ordenados en forma de matriz
                    System.out.print(tridimension[f][c][p] + " ");
                }
            }
        }

        int suma = tridimension[0][0][0] + tridimension[2][0][0];
        System.out.println("la suma es :" + suma);
    }
    
}
