/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej26;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema2Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0, cifra1=0, cifra2=0, cifra3=0, cifra4=0; //creamos las variables
        Scanner entrada = new Scanner(System.in); //genero el escaner
        
        System.out.println("Introduce un numero de 4 cifras: ");
        numero=entrada.nextInt();
        cifra1=numero/1000;
        cifra2=(numero%1000)/100;
        cifra3=((numero%1000)%100)/10;
        cifra4=((numero%1000)%100)%10;
        
        System.out.println("La primera cifra es: "+cifra1);
        System.out.println("La segunda cifra es: "+cifra2);
        System.out.println("La tercera cifra es: "+cifra3);
        System.out.println("La cuarta cifra es: "+cifra4);
    }
    
}
