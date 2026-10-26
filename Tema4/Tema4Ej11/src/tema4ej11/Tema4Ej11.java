/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej11;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero = pedirNumero();//llamo al primer metodo para pedir y validar el dato.
        double raiz = calcularRaiz(numero);//se pasa el numero al segundo metodo para hacer el calculo.
        mostrarResultado(numero, raiz);//se pasan ambos datos al tercer metodo para finalizar
    }

    public static double pedirNumero() { //metodo solo para pedir el numero al usuario
        Scanner entrada = new Scanner(System.in); //genero el escaner
        double num;

        do { //con do - while garantizo que se pida el numero al menos una vez, y repite si es negativo
            System.out.println("Introduce un numero para calcular la raiz cuadrada: ");
            num = entrada.nextDouble();

            if (num < 0) {//tira el error si es menor de cero el numero
                System.out.println("Error: El número no puede ser menor de cero.");
            }
        } while (num < 0);//la condicion hace que se repita tantas veces como sea necesario

        return num;
    }

    public static double calcularRaiz(double numero) {//metodo solo para el calculo de la raiz cuadrada
        return Math.sqrt(numero);//uso el Math.sqrt()como indica el enunciado
    }

    public static void mostrarResultado(double numero, double raiz) { //metodo solo para mostrar el resultado final
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
