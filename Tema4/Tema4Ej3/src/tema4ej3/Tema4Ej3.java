/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej3;

import java.util.Scanner;
import operaciones.paquete_operaciones.Comparador; //importamos la clase creada en el otro paquete
/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//genero el escaner
        
        System.out.println("Por favor, introduce el primer número ");// le pido al usuario que introduzca usuario
        int num1 = entrada.nextInt();//el usuario introduce un numero
        
        System.out.println("Por favor, introduce el segundo número ");
        int num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduce el tercer número ");
        int num3 = entrada.nextInt();
        
        Comparador.imprimirMayor(num1, num2, num3);// Se le pasan los tres números al método de la clase del otro paquete
        
    }
    
}
