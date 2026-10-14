/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej29;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroOculto = (int) (Math.random() * 100) + 1;// Generamos el número aleatorio entre 1 y 100
        
        int intento = 0;
        int contadorIntentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He pensado un número entre 1 y 100. ¡A ver si logras adivinarlo!");
        
        while (intento != numeroOculto) { // El bucle se repite mientras el usuario no acierte el número
            System.out.print("\nIntroduce tu número: ");
            intento = entrada.nextInt();
            contadorIntentos++; // Sumamos 1 al contador de intentos

            if (intento < numeroOculto) {
                System.out.println("El número que busco es MAYOR.");
            } else if (intento > numeroOculto) {
                System.out.println("El número que busco es MENOR.");
            } else {
                System.out.println("\n¡ENHORABUENA! ¡Has adivinado el número!");
                System.out.println("Te ha tomado " + contadorIntentos + " intentos conseguirlo.");
            }
        }
    }
    
}
