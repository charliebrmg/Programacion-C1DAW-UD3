/*
 * Ordenación de números, edición 3-by-3 - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 7
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio7 {       // Inicio de la clase pública "Ejercicio7"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        int n1, n2, n3;     // Declaración de variables "n1", "n2" y "n3", enteros
        System.out.println("Primer número: ");
        n1 = teclado.nextInt();     // Asignación del valor entero detectado por "teclado" a la variable "n1"
        System.out.println("Segundo número: ");
        n2 = teclado.nextInt();     // Asignación del valor entero detectado por "teclado" a la variable "n2"
        System.out.println("Tercer número: ");
        n3 = teclado.nextInt();     // Asignación del valor entero detectado por "teclado" a la variable "n3"
        if(n1 >= n2 && n1 >= n3) {  // CASO 1: "n1" tiene el valor entero más elevado
            System.out.println(n1);
            if(n2 >= n3) {          // CASO 1A: "n3" tiene el valor entero más bajo
                System.out.println(n2);
                System.out.println(n3);
            } else {                // CASO 1B: "n2" tiene el valor entero más bajo
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if(n1 < n2 && n1 >= n3) {    // CASO 2: "n2" tiene el valor entero más elevado, y "n3" tiene el más bajo
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
        } else if(n1 >= n2 && n1 < n3) {    // CASO 3: "n3" tiene el valor entero más elevado, y "n2" tiene el más bajo
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        } else if(n1 < n2 && n1 < n3) {     // CASO 4: "n1" tiene el valor entero más bajo
            if(n2 >= n3) {                  // CASO 4A: "n2" tiene el valor entero más elevado
                System.out.println(n2);
                System.out.println(n3);
            } else {                        //CASO 4B: "n3" tiene el valor entero más elevado
                System.out.println(n3);
                System.out.println(n2);
            }
            System.out.println(n1);
        }
    }
}   // Fin de la clase "Ejercicio7"
