/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej25;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaTotal = 0; 

        for (int i = 17; i <= 139; i++) {
            if (i % 2 == 0) {
                sumaTotal += i; 
            }
        }
        System.out.println("La suma total de los números pares entre 17 y 139 es: " + sumaTotal);
    }   
}
