/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej27;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema3Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escáner
        int numero1 = 0; //declaro las variables
        int numero2 = 0;
        int opcion = 0;

        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextInt();

        do {// Bucle do-while para mantener el menú activo hasta pulsar 5
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + (numero1 * numero2));
                    break;
                case 4:
                    // Captura de la excepción de división entre cero
                    try {
                        int division = numero1 / numero2;
                        System.out.println("Resultado de la división: " + division);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No es posible dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elige un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
    }
    
}
