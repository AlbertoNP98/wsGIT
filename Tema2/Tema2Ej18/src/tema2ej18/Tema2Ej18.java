/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej18;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        
        //a
        int x = -  a + 5 % b - a * a;
        System.out.println("Resultado a: " + x);
        
        //b
        int y = 5 + 3 % 7 * b * a - b % a;
        System.out.println("Resultado b: " + y);
        
        //c
        int z = (a + 1) * (b + 1) - b / a;
        System.out.println("Resultado c: " + z);
    }
    
}
