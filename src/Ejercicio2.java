/*
* Identificador de números pares e impares - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 2
* Versión 1.1-release
* @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
* Para mejores resultados, compilar con la versión 8 del JDK
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio2 {       // Inicio de clase pública "Ejercicio2"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de la variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca número: ");
        int num = teclado.nextInt();    // Declaración de la variable "num" como entero reconocido por "teclado.nextInt()"
        if(num % 2 == 0) {  // Si "num" es divisible entre 2, número par
            System.out.println("Número par");
        } else {    // Si no, número impar
            System.out.println("Numero impar");
        }
    }
}   // Fin de la clase "Ejercicio2"
