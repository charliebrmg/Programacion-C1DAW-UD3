/*
 * Calculadora Básica Java - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 11
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK.
 */
import java.util.Scanner;       // Importación de la clase Scanner desde java.util
public class Ejercicio11 {      // Inicio de la clase pública "Ejercicio11"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca primer término");
        int n1 = teclado.nextInt(); // Declaración de variable "n1" como valor entero detectado por "teclado"
        System.out.println("Introduzca segundo término");
        int n2 = teclado.nextInt(); // Declaración de variable "n2" como valor entero detectado por "teclado"
        System.out.println("Introduzca operando:");
        String operando = teclado.next();   // Declaración de variable "operando" como valor de cadena detectado por "teclado"
        int resultado = 0;  // Declaración de variable de valor entero "resultado", inicializada a 0
        String resultadoDivision = "0"; // Declaración de variable de cadena "resultadoDivisión", inicializada a "0"
        if(operando.equals("/") && n2 == 0) {   // Si el operando es "/" (división), y el valor de n2 es igual a 0, ERROR - División entre 0
            System.out.println("ERROR: No es posible dividir entre 0");
            System.exit(1);
        } else {    // En caso contrario, SWITCH-CASE con operaciones de SUMA (+), RESTA (-), MULTIPLICACIÓN (*), y DIVISIÓN (/) en función de "operando"
            switch(operando) {
                case "+": resultado = n1 + n2; break;
                case "-": resultado = n1 - n2; break;
                case "*": resultado = n1 * n2; break;
                case "/": resultadoDivision = ((n1 / n2) + ", RESTO " + (n1 % n2)); break; // Se inserta tanto el resultado del cociente como del resto
                default: System.out.println("Operador no válido"); System.exit(1);  // Caso DEFAULT: Si el operador no es ninguno de los previamente considerados, ERROR
            }
            if(!operando.equals("/")) {     // Si el operando no es de DIVISIÓN, mostrar por pantalla el valor de la variable "resultado"
                System.out.println("Resultado: " + resultado);
            } else {    // En caso contrario, mostrar por pantalla el valor de la variable "resultadoDivision"
                System.out.println("Resultado: " + resultadoDivision);
            }
        }
    }
}   // Fin de la clase "Ejercicio11"
