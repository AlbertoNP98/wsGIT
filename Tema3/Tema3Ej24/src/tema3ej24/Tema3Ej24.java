/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej24;

import java.util.Scanner; //importamos el scanner

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0; // Esta variable nos servirá para contar cuántos múltiplos encontramos

        do { //Control de errores: pedir el número hasta que sea mayor que 0
            System.out.print("Introduce un número mayor que 0: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Error: El número debe ser estrictamente mayor que 0. Inténtalo de nuevo.\n");
            }
        } while (numero <= 0);

        System.out.println("\nLos múltiplos de 3 entre 1 y " + numero + " son:");

        for (int i = 1; i <= numero; i++) {// Comprobamos si el número actual (i) es múltiplo de 3 usando el operador módulo (%)
            
            if (i % 3 == 0) {// Si el resto de dividir 'i' entre 3 es igual a 0, significa que es múltiplo
                System.out.print(i + " ");
                contador++; // Sumamos 1 al contador por cada múltiplo que mostramos por pantalla
            }
        }
        System.out.println("\n\nTotal de números mostrados: " + contador);// Añadimos un par de saltos de línea (\n) para que no se pegue con los números anteriores
    } 
}
