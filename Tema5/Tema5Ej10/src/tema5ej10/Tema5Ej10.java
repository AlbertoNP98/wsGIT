/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej10;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej10 {

    // Método que recibe DOS objetos Numero por referencia y los ordena de menor a mayor
    public static void ordenarDos(Numero a, Numero b) {
        if (a.esMayorQue(b)) { // Si el primero es mayor que el segundo, intercambia sus valores
            int aux = a.getValor(); // Guardo el valor de 'a' para no perderlo
            a.setValor(b.getValor()); //Pongo el valor pequeño en a
            b.setValor(aux); //Pongo el valor grande en b
        }
    }

    // Método que recibe los CUATRO objetos y los va ordenando por parejas (método burbuja)
    public static void ordenarCuatro(Numero n1, Numero n2, Numero n3, Numero n4) {
        ordenarDos(n1, n2);// Primera pasada: lleva el número más grande de todos hasta n4
        ordenarDos(n2, n3);
        ordenarDos(n3, n4);

        ordenarDos(n1, n2);// Segunda pasada: lleva el segundo más grande hasta n3
        ordenarDos(n2, n3);

        ordenarDos(n1, n2); // Tercera pasada: deja ordenados n1 y n2
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Genero el escaner

        System.out.print("Introduce el primer número: "); //Le pido al usuario los numeros 
        int v1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        int v2 = entrada.nextInt();

        System.out.print("Introduce el tercer número: ");
        int v3 = entrada.nextInt();

        System.out.print("Introduce el cuarto número: ");
        int v4 = entrada.nextInt();

        //Creo los cuatro objetos de la clase Numero usando el constructor parametrizado
        Numero num1 = new Numero(v1);
        Numero num2 = new Numero(v2);
        Numero num3 = new Numero(v3);
        Numero num4 = new Numero(v4);

        //Llamo al metodo que ordena los 4 objetos de forma creciente
        ordenarCuatro(num1, num2, num3, num4);

        //Mostramos los resultados ya ordenados de menor a mayor
        System.out.print("Numeros ordenados de menor a mayor ");
        System.out.println(num1.getValor() + " - " + num2.getValor() + " - " + num3.getValor() + " - " + num4.getValor());

        //Los muestro por el toString
        System.out.print("Detalles de los objetos: ");
        System.out.print(num1.toString());
        System.out.print(num2.toString());
        System.out.print(num3.toString());
        System.out.print(num4.toString());

    }

}
