/*
 * Traductor de días de la semana - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 12
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK.
 */
import java.util.Scanner;   // Importación de la clase Scanner desde java.util
public class Ejercicio12 {  // Inicio de la clase pública "Ejercicio12"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introducir número de día de la semana:");
        int dia = teclado.nextInt();    // Declaración de variable "dia" como valor entero detectado por "teclado"
        switch(dia) {   // SWITCH-CASE: mostrar por consola el nombre del día de la semana en función del valor de "dia"
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("ERROR");   // Caso DEFAULT (dia < 1 || día > 7): ERROR
        }
    }
} // Fin de la clase "Ejercicio12"
