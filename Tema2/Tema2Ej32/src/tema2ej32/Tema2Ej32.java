/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej32;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //inicio el escaner
        
        System.out.println("Por favor, indique una cantidad de dinero: "); //le pido al usuario que introduzca un importe
        int cantidadOriginal = entrada.nextInt(); //aquí el usuario introduce el importe
        
        int billetesCincuenta, billetesVeinte, billetesDiez, billetesCinco, monedaDos, monedaUno; // declaro las variables
        int cantidad= cantidadOriginal; //declaro una variable para ir restando el dinero que tenemos
        
        billetesCincuenta = cantidad / 50; //calculamos cuantas veces cabe 50 en la cantidad, así para el resto
        cantidad = cantidad % 50; // cuánto dinero sobra después de dar los billetes de 50, así para el resto
        
        billetesVeinte = cantidad / 20; 
        cantidad = cantidad % 20;
        
        billetesDiez = cantidad / 10; 
        cantidad = cantidad % 10;
        
        billetesCinco = cantidad / 5; 
        cantidad = cantidad % 5;
        
        monedaDos = cantidad / 2; 
        cantidad = cantidad % 2;
        
        monedaUno = cantidad; //lo que queda es directamente las monedas de 1
        
        System.out.println(cantidadOriginal + " Euros se descomponen en " + billetesCincuenta + " billetes de 50 , " + billetesVeinte + " billetes de 20, " + billetesDiez + " billetes de 10, " + billetesCinco + " billetes de 5, " + monedaDos + " monedas de 2 euros, " + monedaUno + " monedas de 1 euro.");
                           
        
        
    }
    
}
