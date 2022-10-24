/*
 * Indicador de los días de cada mes - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 5
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio5 {       // Inicio de la clase pública "Ejercicio5"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaración de variable "teclado" como Scanner de entrada de consola
        int nMes; // Declaración de variable "nMes" como entero. @PRE: nMes debe tener un valor entre 1 y 12
        System.out.println("Introduzca número de mes (1 a 12): ");
        nMes = teclado.nextInt(); // Asignación del valor entero detectado por "teclado" a la variable "nMes"
        switch(nMes) { // @POST Indica el nombre del mes correspondiente a nMes, junto con su número de días, en función del valor de "nMes"
            case 1: System.out.println("Enero - 31 días"); break;
            case 2: System.out.println("Febrero - 28 días"); break; // No se consideran los años bisiestos
            case 3: System.out.println("Marzo - 31 días"); break;
            case 4: System.out.println("Abril - 30 días"); break;
            case 5: System.out.println("Mayo - 31 días"); break;
            case 6: System.out.println("Junio - 30 días"); break;
            case 7: System.out.println("Julio - 31 días"); break;
            case 8: System.out.println("Agosto - 31 días"); break;
            case 9: System.out.println("Septiembre - 30 días"); break;
            case 10: System.out.println("Octubre - 31 días"); break;
            case 11: System.out.println("Noviembre - 30 días"); break;
            case 12: System.out.println("Diciembre - 31 días"); break;
            default: System.out.println("Número no válido. Por favor introduzca un número entre 1 y 12.");
            // Caso "default" defensivo: se debe introducir un entero entre 1 y 12 en nMes
        }
    }
}   // Fin de la clase "Ejercicio5"
