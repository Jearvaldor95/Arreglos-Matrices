// Arreglo que imprime el número menor de sus elementos
package minimodearry;

/**
 *
 * @author USUARIO
 */
public class MinimoDeArry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Numeros[] = {3, 45, 1, 2, 8, 34, 6, 7, 9, 2};
        int Minimo = Numeros[0];
        for (int i = 1; i < Numeros.length; i++) {
            if (Numeros[i] < Minimo) {
                Minimo = Numeros[i];
            }
        }

        System.out.println("el valor mas pequeño es :" + Minimo);
    }

}
