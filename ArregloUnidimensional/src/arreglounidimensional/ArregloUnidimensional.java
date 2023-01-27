//array que imprime el valor que se encuentra en la posición de un vector, a partir desu tamaño
package arreglounidimensional;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArregloUnidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int fila;
        System.out.println("ingrese el numero del vector ");
        fila = leer.nextInt();

        int unidimension[] = new int[fila];
        System.out.println("ingrese los datos ");

        for (int f = 0; f < fila; f++) {

            unidimension[f] = leer.nextInt();

        }
        for (int f = 0; f < fila; f++) {
            System.out.println();

            System.out.println("posicion [" + f + "]contenido " + unidimension[f]);
            //System.out.print(unidimension[f]+"");

        }
    }

}
