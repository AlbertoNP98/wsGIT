/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej17;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej17 {

    public static void main(String[] args) {       
        char letraSecreta = generarLetra();// 1. El ordenador genera la letra secreta
        
        char intento;
        int contadorIntentos = 0;
        boolean adivinada = false;
        
        System.out.println("¡Bienvenido al juego de adivinar la letra!");
               
        do {// El bucle se repite hasta que el usuario acierte la letra
            intento = pedirLetra();// 2. Pedimos la letra al usuario
            contadorIntentos++; // Sumamos un intento
                       
            adivinada = comprobarLetra(letraSecreta, intento);// 3. Comprobamos si ha acertado y le damos las pistas
            
        } while (!adivinada);
        
        // Cuando sale del bucle es porque ha acertado. Imprimimos el mensaje final con los intentos
        System.out.println("¡Enhorabuena! Has adivinado la letra en " + contadorIntentos + " intentos.");
    }

    // Método para generar la letra aleatoria
    public static char generarLetra() {
        // Generamos un número aleatorio entre 97 (a) y 122 (z)
        int numeroAleatorio = (int) (Math.random() * (122 - 97 + 1) + 97);
        // Transformamos (casteamos) ese número a su equivalente en letra char
        return (char) numeroAleatorio;
    }

    // Método para pedir la letra al usuario
    public static char pedirLetra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra minúscula: ");
        // Utilizamos la pista corregida con un 0 para capturar el char
        return entrada.nextLine().charAt(0); 
    }

    // Método para comprobar la letra y dar pistas de orden alfabético
    public static boolean comprobarLetra(char secreta, char intento) {
        if (intento == secreta) {
            return true; // Acertó, devolvemos true para que el bucle termine
        } else if (intento < secreta) {
            System.out.println("La letra que buscas está DESPUÉS en el alfabeto."); 
            return false;
        } else {
            System.out.println("La letra que buscas está ANTES en el alfabeto.");
            return false;
        }
    }
    
}
