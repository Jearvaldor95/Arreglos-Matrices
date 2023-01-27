// array que imprime las notas de forma descendente 

package notasestudiantes;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class NotasEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float NotasEstudiante[] = new float[10];
        int i, j;
        float aux;
        for (i = 0; i < NotasEstudiante.length; i++) {
            System.out.println("Estudiante " + (i + 1) + " ingrese la nota");
            NotasEstudiante[i] = leer.nextFloat();
        }
        for (i = 0; i < NotasEstudiante.length; i++) {
            for (j = i + 1; j < NotasEstudiante.length; j++) {
                if (NotasEstudiante[i] < NotasEstudiante[j]) {
                    aux = (float) NotasEstudiante[i];
                    NotasEstudiante[i] = NotasEstudiante[j];
                    NotasEstudiante[j] = aux;
                }
            }
        }
        for (i = 0; i < NotasEstudiante.length; i++) {
            System.out.println("las notas ordenadas desendente son:" + NotasEstudiante[i]);
        }
    }
    
}
