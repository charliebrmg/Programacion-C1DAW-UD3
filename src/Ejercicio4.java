/*
 * División automática - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 4
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio4 {       // Inicio de la clase pública "Ejercicio4"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca dividendo:");
        double dividendo = teclado.nextInt(); // Declaración de variable "dividendo" como double reconocido por "teclado"
        System.out.println("Introduzca divisor:");
        double divisor = teclado.nextInt(); // Declaración de variable "divisor" como double reconocido por "teclado"
        if(divisor != 0.0) {    // Si el divisor es distinto de 0, imprimir el resultado de la división
            System.out.println("Resultado = " + (dividendo / divisor));
        } else {    // Si no, ERROR: No se puede dividir entre 0.
            System.out.println("¡No es posible dividir entre 0!");
        }
    }
}   // Fin de la clase "Ejercicio4"
