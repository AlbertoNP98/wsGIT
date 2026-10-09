/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej26;

/**
 *
 * @author darkd
 */
public class Tema3Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaTotal = 0; 

            for (int i = 111; i <= 222; i++) {
            if (i % 2 != 0) {
             sumaTotal += i;
            }
        }
        System.out.println("La suma total de los números impares entre 17 y 139 es: " + sumaTotal);
    }   
}
