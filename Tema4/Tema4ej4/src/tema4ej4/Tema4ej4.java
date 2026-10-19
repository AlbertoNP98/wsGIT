/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej4;

import operaciones.PaqueteOperaciones;
import java.util.Scanner;
/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//genero el escaner
        
        System.out.println("Por favor, introduce el primer número "); // le pido al usuario que introduzca usuario
        int num1 = entrada.nextInt(); //el usuario introduce un numero
        
        System.out.println("Por favor, introduce el segundo número ");
        int num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduce el tercer número ");
        int num3 = entrada.nextInt();
        
        PaqueteOperaciones.imprimirMenor(num1, num2, num3);// Se le pasan los tres números al método de la clase del otro paquete
    }
    
}
