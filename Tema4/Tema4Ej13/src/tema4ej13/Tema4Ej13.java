/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej13;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej13 {

    public static void main(String[] args) {
        int numero;
        boolean esValido;

        do { //do-while hace que repita las instrucciones mientras el numero no sea valido
            numero = pedirNumero(); //llamo al metodo para pedir el numero

            esValido = comprobarMayorQueUno(numero); //le paso el numero al metodo booleano para que lo compruebe

            if (!esValido) {
                System.out.println("Error: El número introducido debe ser mayor que 1. Inténtalo de nuevo.");
            }
        } while (!esValido); //se repite hasta que introduzca un numero mayor que 1

        mostrarResultado(numero);//cuando al fin sale del bucle porque es valido, llamo al metodo final
    }

    public static int pedirNumero() { //metodo para pedir numero al usuario
        Scanner entrada = new Scanner(System.in); //genero escaner
        System.out.println("Por favor, introduce un número mayor que 1: ");
        return entrada.nextInt();
    }

    public static boolean comprobarMayorQueUno(int num) { //metodo tipo booleano para comprobar que el numero es mayor de 1
        if (num > 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarResultado(int limite) { //metodo para mostrar resultado
        System.out.println("Los números existentes entre 1 y " + limite + " son: ");

        for (int i = 1; i <= limite; i++) { //si 1 es menor o igual que "limite" que se vaya sumando de 1 en 1 
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
