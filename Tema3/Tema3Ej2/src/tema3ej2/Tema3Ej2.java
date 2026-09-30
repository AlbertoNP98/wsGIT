/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej2;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        int num1, num2, producto, suma; //genero variables
        
        System.out.println("Por favor, introduzca un numero: "); //pido al usuario que introduzca numero
        num1 = entrada.nextInt(); //el usuario pone un numero
        
        System.out.println("Por favor, introduzca un segundo numero: "); //pido al usuario que introduzca numero
        num2 = entrada.nextInt(); //el usuario pone un numero
        
        producto= num1 * num2;
        suma = num1 + num2;
        
        if (num1 > 10)
            System.out.println("La operación que se realizó es producto y el resultado es:" + producto);
        else
            System.out.println("La operación que se realizó es suma y el resultado es:" + suma);
    }
    
}
