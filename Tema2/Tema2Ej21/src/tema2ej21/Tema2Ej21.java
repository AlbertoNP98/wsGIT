/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej21;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner para leer los datos que pongamos
        int num; //declaro la variable donde guardamos los segundos introducidos
        
        System.out.println("Introduzca un número"); //solicito los segundos al usuario
        num = entrada.nextInt(); //leemos y guardamos el numero introducido 
        
        
        
        int tiempo = num; //traspaso el valor a la variable tiempo para operar con ella
        
        int dias= tiempo / 86400; //divido los segundos totales para obtener los dias 
        int diastotales = tiempo % 86400; //guardo el resto de la division anterior
        
        int horas = diastotales / 3600; //calculamos las horas totales
        int restosegundos = tiempo % 3600; //guardamos los segundos que sobran al extraer las horas
        
        int minutos = restosegundos / 60; //dividimos los segundos restantes para extraer los minutos
        int segundos = restosegundos % 60; //el resto son los segundos sueltos que quedan
        
        System.out.println( num + " segundos hacen un total de: " + dias + " dias, " +horas+ " horas, " + minutos+ " minutos, y " +segundos+ " segundos.");
    }
    
}
