/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej25;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema2Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicio el escaner
        double num1, num2, num3, suma, producto; //declaro las variables
        
        System.out.println("Por favor, introduzca el primer numero: "); //peticion del mensaje (en los de abajo igual)
        num1 = entrada.nextInt(); //guardamos el valor (para los restos igual)
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3; //calculamos la suma 
        producto = num1 * num2 * num3; //calculamos el producto
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
    
}
