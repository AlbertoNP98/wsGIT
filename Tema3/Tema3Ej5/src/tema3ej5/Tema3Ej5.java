/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej5;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1; //genero variable
        
        System.out.println("Por favor, introduzca un numero: "); //pido al usuario que introduzca numero
        num1 = entrada.nextInt(); //el usuario pone un numero
        
        if (num1 % 2 == 0)
            System.out.println("El numero " + num1 + " es par");
        else
            System.out.println("El numero " + num1 + " es impar");
    }
    
}
