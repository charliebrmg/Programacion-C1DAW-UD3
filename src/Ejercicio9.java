/*
 * Identificador de años bisiestos - C1 FPGS DAW, módulo de Programación - Unidad Didáctica 3, Ejercicio 9
 * Versión 1.1-release
 * @BY Carlos Barranco Moraga - IES Arquitecto Ventura Rodríguez - 2022-10-21
 * Para mejores resultados, compilar con la versión 8 del JDK.
 */

/*
 * SOBRE LOS AÑOS BISIESTOS: QUÉ SON, CUÁLES SON, Y POR QUÉ LOS TENEMOS
 * Los años bisiestos son un mecanismo empleado por el Calendario Gregoriano para corregir la deriva del calendario solar
 * con respecto a las estaciones astronómicas.
 * En términos científicos, sirven para ajustar el calendario al movimiento de traslación de la Tierra alrededor del Sol.
 * Un año estándar dura 365 días exactos, mientras que la Tierra tarda 365 días, 6 horas y 35 minutos (aproximadamente)
 * en dar una vuelta completa alrededor del Sol.
 * Un año es bisiesto cuando su número es divisble por 4, pero no por 100; o cuando es divisible por 400.
 * Por lo general, esta norma se cumple cada 4 años, pero no tiene por qué ser así siempre.
 * Por ejemplo, el año 2004 fue bisiesto, al ser divisible por 4 pero no por 100.
 * El año 1900 no fue bisiesto, al ser divisble por 4 y, al mismo tiempo, por 100.
 * El año 2000 fue bisiesto: aunque era divisible por 4 y por 100, era también divisible por 400.
 * La norma puede resumirse con la siguiente expresión lógica:
 * SI (AÑO / 4 RESTO 0 ^ ¬(AÑO /4 RESTO 0)) O (AÑO / 400 RESTO 0) |= AÑO BISIESTO
 * Este programa de Java permite a su usuario comprobar si un año cualquiera cumple (o no) los requisitos para ser
 * bisiesto.
 */
import java.util.Scanner;   // Importación de la clase Scanner desde java.util
public class Ejercicio9 {   // Inicio de la clase pública "Ejercicio9"
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // Declaración de variable "teclado" como Scanner de entrada de consola
        System.out.println("Introduzca año:");
        int aaaa = teclado.nextInt();   // Declaración de variable "aaaa" (año de 4 cifras) como valor entero detectado por "teclado"
        if((aaaa % 4 == 0 && aaaa % 100 != 0) || (aaaa % 400 == 0)) {   // Si el año indicado cumple las condiciones, año bisiesto
            System.out.println("Año bisiseto");
        } else {    // En caso contrario, año ordinario
            System.out.println("Año ordinario");
        }
    }
}   // Fin de la clase "Ejercicio9"
