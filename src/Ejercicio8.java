/*
* Comprobación de fechas en el Siglo XXI - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 8
* Versión 1.0-release
* @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
* Para mejores resultados, compilar con la versión 8 del JDK.
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca año:");
        int aaaa = teclado.nextInt();
        if(aaaa >= 2001 && aaaa <= 2100) {
//          Si el año introducido por el usuario está entre 2001 y 2100, preguntamos el mes.
            System.out.println("Introduzca mes:");
            int mm = teclado.nextInt();
            if(mm >= 1 && mm <= 12) {
//              Si el mes introducido por el usuario está entre 1 y 12, preguntamos el día.
                System.out.println("Introduzca día:");
                int dd = teclado.nextInt();
                if((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && (dd >= 1 && dd <= 31)) {
//                  Si el mes es igual a 1, 3, 5, 7, 8, 10, ó 12, y el día introducido está entre 1 y 31, fecha correcta.
                    System.out.println("Fecha válida para el Siglo XXI.");
                } else if((mm == 4 || mm == 6 || mm == 7 || mm == 11) && (dd >= 1 && dd <= 30)) {
//                  Si no, si el mes es igual a 4, 6, 7, ú 11, y el día introducido está entre 1 y 30, fecha correcta.
                    System.out.println("Fecha válida para el Siglo XXI.");
                } else if (mm == 2 && (dd >= 1 && dd <= 28)) {
//                  Si no, si el mes es igual a 2, y el día introducido está entre 1 y 28, fecha correcta.
                    System.out.println("Fecha válida para el Siglo XXI.");
                } else {
//                  Si no se cumple nada de lo anterior, fecha incorrecta.
                    System.out.println("Fecha no válida. (El mes indicado no tiene el día indicado)");
                }
            } else {
//              Si el mes es menor que 1 o mayor que 12, fecha incorrecta.
                System.out.println("Fecha no válida. (El mes indicado no existe)");
            }
        } else {
//          Si el año es menor que 2001 o mayor que 2100, fecha incorrecta.
            System.out.println("Fecha no válida. (No es un año del Siglo XXI)");
        }
    }
}
