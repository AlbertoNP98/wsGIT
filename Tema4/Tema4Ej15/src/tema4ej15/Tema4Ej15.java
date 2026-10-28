/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej15;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero("Introduce el primer numero: "); //pedimos los dos numeros al principio del programa
        int num2 = pedirNumero("Introduce el segundo numero: ");

        int opcion;

        do { //do while hace que el menu se muestre repetidamente
            opcion = mostrarMenu();

            switch (opcion) { //evaluamos la opcion elegida para llamar al metodo correspondiente
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("Opción incorrecta. Elige una opción del 1 al 5");
            }
        } while (opcion != 5); //mientras no pulse 5, el programa no termina

    }

    public static int pedirNumero(String mensaje) { //metodo para pedir el numero
        Scanner entrada = new Scanner(System.in); //genero el escaner
        System.out.print(mensaje);
        return entrada.nextInt();
    }

    public static int mostrarMenu() { //metodo para mostrar el menu 
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--- MENÚ DE OPERACIONES ---");
        System.out.println("1.- Sumar los números."); //[cite: 31]
        System.out.println("2.- Restar los números."); //[cite: 31]
        System.out.println("3.- Multiplicar los números."); //[cite: 31]
        System.out.println("4.- Dividir los números."); //[cite: 31]
        System.out.println("5.- Salir del programa."); //[cite: 31]
        System.out.print("Elige una opción: ");
        return entrada.nextInt();
    }

    public static void sumar(int a, int b) { //metodo para sumar
        System.out.println("Resultado de la suma: " + (a + b));
    }

    public static void restar(int a, int b) {//metodo para restar
        System.out.println("Resultado de la resta: " + (a - b));
    }

    public static void multiplicar(int a, int b) {//metodo para multiplicar
        System.out.println("Resultado de la multiplicación: " + (a * b));
    }

    public static void dividir(int a, int b) {//metodo para dividir
        // Controlamos la división entre cero capturando la excepción[cite: 31]
        try {
            int resultado = a / b;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            // Si 'b' es 0, Java lanza ArithmeticException. El catch lo atrapa y ejecuta esto:
            System.out.println("Error matemático: No es posible dividir un número entre cero.");
        }
    }
}
