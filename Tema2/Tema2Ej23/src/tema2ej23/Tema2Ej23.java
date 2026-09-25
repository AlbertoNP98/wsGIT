/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej23;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema2Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //preparo la lectura por teclado
        int precio; //variable para el precio unitario
        int unidades;// variable para la cantidad de ordenadores
        int total;//variable donde almacenaremos el coste final
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea: "); //pedimos el precio
        precio = entrada.nextInt();//leemos el precio indicado
        
        System.out.println("Cuantas unidades quiere llevarse? ");//solicitamos cantidad para llevarse
        unidades = entrada.nextInt();//leemos la cantidad
        
        total= unidades * precio;// calculamos el improte total 
        System.out.println("El total seria:" + total + " Euros.");
        
    }
    
}
