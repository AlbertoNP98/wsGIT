/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej1;

import java.util.Scanner;
/**
 *
 * @author Alberto Navarro Pérez
 */
import java.util.Scanner;
public class Tema3Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        int num; //declaro la variable
        
        System.out.println("Por favor, introduzca un numero: "); //pido al usuario que introduzca numero
        num = entrada.nextInt(); //el usuario pone un numero
        
        if (num >=0) //si la variable es mayor de cero...
            System.out.println("Es positivo");
        else 
            System.out.println("Es negativo");
            
        
    }
    
}
