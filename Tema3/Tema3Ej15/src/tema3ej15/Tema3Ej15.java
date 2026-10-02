/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej15;

import java.util.Scanner;

/**
 *
 * @author darkd
 */
public class Tema3Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int num; //genero variable
        
        System.out.println("Introduce un numero: "); //mensaje de peticion al usuario
        num = entrada.nextInt(); //guardamos el valor introducido 
        
        for (int i = 0; i <=10; i++) { // El bucle for se inicializa en 1 y se repite mientras la variable 'i' sea menor o igual a 5
            System.out.println(num + " * " + i +  " = " + (num*i));
    }
    }
}
