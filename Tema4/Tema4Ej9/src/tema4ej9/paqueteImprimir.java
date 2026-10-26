/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ej9;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class paqueteImprimir {
    
    public static int pedirNumero(String orden) {
        int dato; 
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Introduzca el " + orden + " numero: ");
        dato = entrada.nextInt(); 
        return dato; // Devuelve el número para poder usarlo en el main
    }

    public static void imprimirMenor(int n1, int n2, int n3) {//Método que recibe tres números y muestra por pantalla el menor de ellos
        int menor = n1; //doy por hecho que el menor es el n1 
        
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        
        System.out.println("El número menor de los introducidos es el: " + menor);
    }
}
