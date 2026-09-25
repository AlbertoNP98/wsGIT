/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej27;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, doble, cubo;
        
        System.out.println("Por favor, introduzca un numero: ");
        num = entrada.nextInt();
        
        doble = num * num;
        cubo = num * num * num;
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El cubo de " + num + " es: " + cubo);
    }
    
}
