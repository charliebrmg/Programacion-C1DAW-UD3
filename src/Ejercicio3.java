/*
 * Ordenación de números - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 3
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio3 {       // Inicio de la clase pública "Ejercicio3"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de la variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca primer número:");
        int n1 = teclado.nextInt(); // Declaración de la variable "n1" como entero reconocido por "teclado"
        System.out.println("Introduzca segundo número:");
        int n2 = teclado.nextInt(); // Declaración de la variable "n2" como entero reconocido por "teclado"
        if(n1 > n2) {   // Si n1 es mayor que n2, imprimir por consola "n1 es mayor que n2"
            System.out.println(n1 + " es mayor que " + n2);
        } else {    //Si no, imprimir por consola "n2 es mayor que n1"
            System.out.println(n2 + " es mayor que " + n1);
        }
    }
}   // Fin de la clase "Ejercicio3"
