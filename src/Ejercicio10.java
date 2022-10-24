/*
 * Dado opuesto - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 10
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK.
 */
import java.util.Scanner;   // Importación de la clase Scanner desde java.util
public class Ejercicio10 {  // Inicio de la clase pública "Ejercicio10"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca el resultado de lanzar un dado de 6 caras:");
        int resultado = teclado.nextInt();  // Declaración de variable "resultado" como valor entero detectado por "teclado"
        String opuesto;     // Declaración de variable de cadena "opuesto"
        switch(resultado) { // SWITCH-CASE: Asignación de números (fonéticos) a la variable "opuesto" en función del valor de "resultado", según su distribución en un dado de 6 caras.
            case 1: opuesto = "seis"; break;
            case 2: opuesto = "cinco"; break;
            case 3: opuesto = "cuatro"; break;
            case 4: opuesto = "tres"; break;
            case 5: opuesto = "dos"; break;
            case 6: opuesto = "uno"; break;
            default: opuesto = null;    // Caso DEFAULT (resultado <= 0 || resultado >= 7): variable "opuesto" como NULL
        }
        if(opuesto != null) {   // Si el valor de "opuesto" es distinto de NULL, se imprime el resultado del SWITCH-CASE
            System.out.println("El número en el lado opuesto al resultado es el " + opuesto);
        } else {    // En caso contrario, ERROR
            System.out.println("ERROR");
        }
    }
}   // Fin de la clase "Ejercicio10"
