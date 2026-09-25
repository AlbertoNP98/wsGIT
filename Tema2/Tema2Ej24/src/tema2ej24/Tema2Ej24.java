/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej24;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema2Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //objeto scanner para recoger las notas
        double suma= 0, media; //declaramos variables double
        
        
        System.out.println("Por favor, introduzca la nota de Programación: "); //pedimos notas (lo mismo para las siguientes)
        suma =  suma + entrada.nextInt(); //guardamos el valor (lo mismo para el siguiente)
        
        System.out.println("Introduzca la nota de Lenguaje de Marcas: ");
        suma =  suma + entrada.nextInt();
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        suma =  suma + entrada.nextInt();
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        suma =  suma + entrada.nextInt();
        
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        suma =  suma + entrada.nextInt();
        
        System.out.println("Introduzca la nota de Formación y orientación laboral: ");
        suma =  suma + entrada.nextInt();
        
        media= suma / 6;
        System.out.println("Su nota media del curso es de: " +media);
        
    }
    
}
