/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej22;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorPi = Math.PI; //extraigo los valores usando las constantes con la clase math
        double valorEuler = Math.E;
        
        mostrarResultados(valorPi, valorEuler); //llamo al metodo pasandole los numeros guardados
    }
    
    public static void mostrarResultados(double pi, double euler) { //el metodo muestra el resultado a partir de los numeros recibidos por los parametros
        System.out.println("El valor de la constante PI es: " +pi);
        System.out.println("El valor de la constante Euler es: " + euler);
    }
}
