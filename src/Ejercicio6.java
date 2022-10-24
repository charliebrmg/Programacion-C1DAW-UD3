/*
 * Diferenciador de rangos de edad - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 6
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;   // Importación de la clase Scanner desde java.util
public class Ejercicio6 {   // Inicio de la clase pública "Ejercicio6"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca su edad:");
        int edad = teclado.nextInt();   // Declaración de variable "edad" como entero detectado por "teclado"
        if(edad >= 0 && edad <= 12) {   // Si la "edad" introducida es mayor o igual que 0 y menor o igual que 12, categoría NIÑEZ.
            System.out.println("Entra usted en la categoría de NIÑEZ.");
            /*  EASTER EGG
            System.out.println("A todo esto, ¿qué estás haciendo tú aquí? Voy a avisar a tus padres...");   */
        } else if(edad >= 13 && edad <= 18) {   // De lo contrario, si la "edad" es mayor o igual que 13 y menor o igual que 18, categoría ADOLESCENCIA.
            System.out.println("Entra usted en la categoría de ADOLESCENCIA.");
        } else if(edad >= 19 && edad <= 33) {   // De lo contrario, si la "edad" es mayor o igual que 19 y menor o igual que 33, categoría JUVENTUD.
            System.out.println("Entra usted en la categoría de JUVENTUD.");
        } else if(edad >= 34 && edad <= 65) {   // De lo contrario, si la "edad" es mayor o igual que 34 y menor o igual que 65, categoría MADUREZ.
            System.out.println("Entra usted en la categoría de MADUREZ.");
        } else if(edad >= 66 && edad <= 79) {   // De lo contrario, si la "edad" es mayor o igual que 66 y menor o igual que 79, categoría JUBILACIÓN.
            System.out.println("Entra usted en la categoría de JUBILACIÓN.");
        } else if(edad >= 80) {     // De lo contrario, si la "edad" es mayor o igual que 80, categoría TERCERA EDAD.
            System.out.println("Entra usted en la categoría de TERCERA EDAD.");
            /*  EASTER EGG
            System.out.println("Gracias por todo lo que ha hecho usted por nuestra sociedad.");     */
        } else {        // En caso de que no se cumpla ninguna condición, ERROR.
            System.out.println("ERROR");
        }
    }
}   // Fin de la clase "Ejercicio6"
