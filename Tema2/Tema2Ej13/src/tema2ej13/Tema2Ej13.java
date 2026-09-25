/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej13;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1; //pongo el valor del primer vaso
        int num2 = 2; //el del segundo
        int num3 = 1; //genero un tercer vaso, en este caso es el que está vacío
       
        System.out.println("El vaso A tiene: " +num1+ " y el vaso B tiene: " +num2);
        
        num1 = (int)num2; //fuerzo a que el vaso 1 sea el vaso 2
        num2 = (int)num3; //fuerzo a que el vaso 2 sea el vaso 3
        System.out.println("Ahora la variable 1 contiene: " +num1+ " y la variable 2 contiene: " +num2);
    }
    
}
