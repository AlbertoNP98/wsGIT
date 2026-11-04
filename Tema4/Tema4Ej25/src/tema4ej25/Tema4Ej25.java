/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej25;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//genero el escaner

        System.out.print("Introduce el número base (a): ");
        double base = entrada.nextDouble();

        System.out.print("Introduce el exponente (b): ");
        double exponente = entrada.nextDouble();

        calcularPotencia(base, exponente);// Llamamos al método y le pasamos los dos números que acabamos de pedir
    }

    public static void calcularPotencia(double a, double b) {// Método que recibe (a) y (b) como parámetros para calcular la potencia

        if (a == 0 && b < 0) {// Controlamos la excepción lógica del 0 elevado a número negativo
            System.out.println("Excepción controlada: El número 0 elevado a un número negativo es infinito.");
        } else {
            // Si no se cumple la excepción, realizamos el cálculo normal
            double resultado = Math.pow(a, b);
            System.out.println("El resultado de " + a + " elevado a " + b + " es: " + resultado);
        }
    }
}
