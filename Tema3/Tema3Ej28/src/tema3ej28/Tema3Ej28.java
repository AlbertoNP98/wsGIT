/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej28;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio = (Math.random() * 100) + 1;//Generamos el número aleatorio entre 1 y 100 (double)
        
        aleatorio = Math.floor(aleatorio);//Aplicamos Math.floor para redondear al entero inferior, tal como indica el enunciado
        
        int numeroEntero = (int) aleatorio;//Hacemos el cast a int

        System.out.println("El número generado es: " + numeroEntero);

        if (numeroEntero % 2 == 0) {//Comprobamos si es par o impar
            System.out.println("El número es PAR.");
        } else {
            System.out.println("El número es IMPAR.");
        }
    }
    
}
