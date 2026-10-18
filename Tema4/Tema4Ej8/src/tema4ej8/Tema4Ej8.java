/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej8;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej8 {
    
    public static void desgloseDinero(int importe){
        int billetes50 = importe / 50; //calculamos los biletes de 50 y actualizamos el importe con lo que sobra
        importe = importe % 50; // el operador % guarda el resto de la division
        
        int billetes20 = importe / 20;
        importe = importe % 20;
        
        int billetes10 = importe / 10;
        importe = importe % 10;
        
        int billetes5 = importe / 5;
        importe = importe % 5;
        
        int monedas2 = importe / 2;
        importe = importe % 2;
        
        int monedas1 = importe;
        
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " +billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " +billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " +billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " +billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2: " +monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1: " +monedas1);
        }
             
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int importeOriginal = entrada.nextInt(); // el usuario introduce su dinero
        
        System.out.println(importeOriginal + " se descomponen en: ");
        desgloseDinero(importeOriginal);//se le pasa el importe al método de arriba
    }
    
}
