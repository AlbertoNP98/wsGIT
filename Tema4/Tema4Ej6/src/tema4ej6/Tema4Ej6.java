/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej6;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej6 {

        public static void escribirCalificacion(int nota){
            if (nota < 0 || nota > 10){ // Primero, comprobamos si la nota es incorrecta para avisar al usuario del error
                System.out.println("Error: la nota introducide debe estar entre 0 y 10");
            }
            else if (nota >= 0 && nota <=4) {// Si el número es válido, comprobamos en qué rango encaja
                System.out.println("Suspenso");
            }
            else if (nota >= 5 && nota <=6) {
                System.out.println("Bien");
            }
            else if (nota >= 7 && nota <=8) {
                System.out.println("Notable");
            }
            else if (nota >= 9 && nota <= 10) {
                System.out.println("Sobresaliente");
            }
        }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca la nota del alumno");
        int nota = entrada.nextInt();
        
        escribirCalificacion(nota);
    }
    
}
