/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej4;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, menor; //genero variables
        
        System.out.println("Por favor, introduzca un numero: "); //pido al usuario que introduzca numero
        num1 = entrada.nextInt(); //el usuario pone un numero
        
        System.out.println("Por favor, introduzca un numero: "); 
        num2 = entrada.nextInt(); 
        
        System.out.println("Por favor, introduzca un numero: "); 
        num3 = entrada.nextInt(); 
        
        menor = num1; //declaro esta variable asumiendo que el primer numero introducido es el menor
        
        if (num2 < menor) { //es el num2 mas pequeño que el menor?
            menor = num2;// si se cumple la condicion, actualizamos la variable menor con el valor del num2
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.println("El número mayor de los introducidos es el " + menor);
    }
    
}
