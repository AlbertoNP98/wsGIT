/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej26;

import java.util.Scanner;

/**
 *
 * @author darkd
 */
public class Tema4Ej26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner

        System.out.print("Introduce un número entero para comprobar si es primo: ");
        int numeroIntroducido = entrada.nextInt();

        boolean resultado = esPrimo(numeroIntroducido);//llamo al método pasándole el número y guardo el resultado

        if (resultado) {//muestro el mensaje final dependiendo de lo que haya devuelto el método
            System.out.println("El número " + numeroIntroducido + " SÍ es primo.");
        } else {
            System.out.println("El número " + numeroIntroducido + " NO es primo.");
        }
    }

    // Método llamado esPrimo que recibe un número entero como parámetro y devuelve un booleano
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 (0, 1, y negativos) por definición matemática no son primos
        if (numero <= 1) {
            return false;
        }

        /* Se irá comprobando si tiene algún divisor a partir del 2 en adelante.
         Ponemos i < numero para que compruebe hasta justo el número anterior*/
        for (int i = 2; i < numero; i++) {

            // Si se encuentra algún divisor cuyo resto sea 0 ya sabremos que ese número no es primo
            if (numero % i == 0) {
                return false; // Al devolver false, el método se detiene al instante y sale del bucle
            }
        }
        /* Si el bucle consigue dar todas las vueltas y termina sin haber saltado el 'return false', 
         significa que no encontró ningún divisor, por lo que el número es primo.*/
        return true;
    }
}
