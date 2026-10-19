/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej5;

import operaciones.par_impar;
import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        
        System.out.println("Por favor, introduce un número "); // le pido al usuario que introduzca usuario
        int num = entrada.nextInt(); //el usuario introduce un numero
        
        par_impar.comprobarParidad(num);       
    }
    
}
