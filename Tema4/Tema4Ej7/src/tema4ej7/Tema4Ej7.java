/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej7;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej7 {

    public static void ordenar(int n1, int n2, int n3, int n4) {
        
        for (int i = 0; i < 4; i++) { /*// El bucle "for" simplemente repite todo el bloque de comparaciones 4 veces,
        asegurando que los números más grandes vayan "burbujeando" hacia la derecha.*/
                
            if (n1 > n2) {// Compara el primer número con el segundo
                int temporal = n1;
                n1 = n2;
                n2 = temporal;
            }
                        
            if (n2 > n3) { //compara el segundo número con el tercero 
                int temporal = n2;
                n2 = n3;
                n3 = temporal;
            }
            
            if (n3 > n4) {// Compara el tercer número con el cuarto
                int temporal = n3;
                n3 = n4;
                n4 = temporal;
            }
        }
        System.out.println("El orden de los números introducidos es el " + n1 + " - " + n2 + " - " + n3 + " - " + n4);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        
        
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = entrada.nextInt();
        
        ordenar(num1,num2,num3,num4);
    }
    
}
