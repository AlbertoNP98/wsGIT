/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej6;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota; //genero variable
        
        System.out.println("Por favor, introduzca la nota: "); //pido al usuario que introduzca numero
        nota = entrada.nextInt(); //el usuario pone la nota
        
        if (nota <= -1){
            System.out.println("Introduzca una nota válida.");
        }else if (nota <= 4) {
            System.out.println("Suspenso.");
        }else if (nota <= 6){
            System.out.println("Bien.");
        }else if (nota <= 8){
            System.out.println("Notable.");
        }else if (nota <= 10){
            System.out.println("Sobresaliente.");
        }else if (nota >= 11){
            System.out.println("Introduzca una nota válida.");
        }
    }
    
}
