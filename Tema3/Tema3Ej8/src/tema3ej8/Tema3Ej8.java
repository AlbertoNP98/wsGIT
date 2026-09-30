/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej8;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// Creamos el objeto Scanner para leer la cantidad introducida por consola
        
        System.out.print("Por favor, indique una cantidad de dinero: ");// Solicitamos el importe en euros al usuario
        int importe = entrada.nextInt();
        
        int total = importe;// Guardamos el importe original para mostrarlo en el texto final
       
        int b50 = importe / 50;// Calculamos cuántos billetes de 50 caben y actualizamos el resto
        importe %= 50;
       
        int b20 = importe / 20;// Calculamos cuántos billetes de 20 caben y actualizamos el resto
        importe %= 20;
      
        int b10 = importe / 10; // Calculamos cuántos billetes de 10 caben y actualizamos el resto
        importe %= 10;
      
        int b5 = importe / 5;// Calculamos cuántos billetes de 5 caben y actualizamos el resto
        importe %= 5;
      
        int m2 = importe / 2;// Calculamos cuántas monedas de 2 euros caben y actualizamos el resto
        importe %= 2;
    
        int m1 = importe; // El resto final corresponde a las monedas de 1 euro
    
        System.out.println(total + " Euros se descomponen en:");// Mostramos la cabecera con el total introducido

        // Mostramos únicamente los billetes o monedas si su cantidad es mayor que 0
        if (b50 > 0) {
            System.out.println("Billetes de 50: " + b50);
        }
        if (b20 > 0) {
            System.out.println("Billetes de 20: " + b20);
        }
        if (b10 > 0) {
            System.out.println("Billetes de 10: " + b10);
        }
        if (b5 > 0) {
            System.out.println("Billetes de 5: " + b5);
        }
        if (m2 > 0) {
            System.out.println("Monedas de 2 euros: " + m2);
        }
        if (m1 > 0) {
            System.out.println("Monedas de 1 euro: " + m1);
        }
    }
    
}
