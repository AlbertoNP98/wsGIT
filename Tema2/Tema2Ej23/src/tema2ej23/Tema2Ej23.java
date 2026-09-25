/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej23;

import java.util.Scanner;

/**
 *
 * @author darkd
 */
public class Tema2Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int precio;
        int unidades;
        int total;
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea: ");
        precio = entrada.nextInt();
        
        System.out.println("Cuantas unidades quiere llevarse? ");
        unidades = entrada.nextInt();
        
        total= unidades * precio;
        System.out.println("El total seria:" + total + " Euros.");
        
    }
    
}
