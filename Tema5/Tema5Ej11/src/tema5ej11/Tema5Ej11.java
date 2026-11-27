/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej11;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej11 {

    //Metodo para pedir un numero entero al usuario y lo devuelve
    public static int pedirValor(Scanner entrada, int orden) {
        System.out.println("Introduce el numero " + orden + ": ");
        return entrada.nextInt();
    }

    //Método para recibir los dos objetos Numero y devuelve la suma de ambos
    public static int sumar(Numero n1, Numero n2) {
        return n1.getValor() + n2.getValor();
    }

    //Metodo para recibir los dos objetos Numero y devuelve la multiplicacion de ambows
    public static int multiplicar(Numero n1, Numero n2) {
        return n1.getValor() + n2.getValor();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Creo los dos objetos usando el constructor por defecto
        Numero num1 = new Numero();
        Numero num2 = new Numero();

        //Pedimos los valores al usuario con el método y lo guardo con el setValor
        num1.setValor(pedirValor(entrada, 1));
        num2.setValor(pedirValor(entrada, 2));

        //Compruebo si el primer numero es mayor que 10
        System.out.println("Resultado de la operacion: ");
        if (num1.getValor() > 10) {
            int resultado = multiplicar(num1, num2);
            System.out.println("Operación hecha: Multiplicacion " + num1.getValor() + " * " + num1.getValor());
            System.out.println("Resultado: " + resultado);
        } else {
            int resultado = sumar(num1, num2);
            System.out.println("Operación hecha: Suma " + num1.getValor() + " + " + num1.getValor());
            System.out.println("Resultado: " + resultado);
        }

        //Lo muestro con el toString
        System.out.println("Objetos creados:");
        System.out.println(num1.toString());
        System.out.println(num2.toString());
    }

}
