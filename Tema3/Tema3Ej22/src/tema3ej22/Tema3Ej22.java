/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej22;

import java.util.InputMismatchException; // Necesario para capturar errores de formato
import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int num1, num2, resultado;
        
        try {// El bloque try engloba tanto las preguntas al usuario como la operación
            
            System.out.println("introduzca un numero: ");
            num1 = entrada.nextInt();// Si el usuario escribe una letra, salta directamente al catch

            System.out.println("introduzca un segundo numero: ");
            num2 = entrada.nextInt();// Si el usuario escribe una letra, salta directamente al catch
                
            resultado = num1 + num2;
            System.out.println("Resultado de la suma:"  + resultado);// El texto dice división pero muestra la suma
        }
        catch(InputMismatchException e) {// Este catch atrapa específicamente el error de introducir un tipo de dato incorrecto
                System.out.println("Error, " + e.getMessage());
        }
    }
    
}
