/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej9;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3, n4, aux; // Declaramos una variable para cada número y una auxiliar para los intercambios
        
        System.out.print("Por favor, introduzca el primer numero: ");
        n1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        n2 = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        n3 = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        n4 = entrada.nextInt();

        // Ordenamos los números de menor a mayor comparando e intercambiando valores (método burbuja básico)
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        if (n3 > n4) { aux = n3; n3 = n4; n4 = aux; }
        
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }
        if (n2 > n3) { aux = n2; n2 = n3; n3 = aux; }
        
        if (n1 > n2) { aux = n1; n1 = n2; n2 = aux; }

        // Mostramos el resultado ordenado con el formato solicitado[cite: 5]
        System.out.println("El orden de los números introducidos es el " + n1 + " - " + n2 + " - " + n3 + " - " + n4);
    }
    
}
