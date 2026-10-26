/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej14;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej14 {

    public static void main(String[] args) {
        int numero;
        boolean esValido;

        do { //do-while hace que repita las instrucciones mientras el numero no sea valido
            numero = pedirDato(); //llamo al metodo para pedir el numero

            esValido = comprobarMayorQueCero(numero); //le paso el numero al metodo booleano para que lo compruebe

            if (!esValido) {
                System.out.println("Error: El número introducido debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (!esValido); //se repite hasta que introduzca un numero mayor que 1

        calcularYMostrar(numero);//cuando al fin sale del bucle porque es valido, llamo al metodo final
    }

    public static int pedirDato() { //metodo para pedir numero al usuario
        Scanner entrada = new Scanner(System.in); //genero escaner
        System.out.println("Por favor, introduce un número mayor que 0: ");
        return entrada.nextInt();
    }

    public static boolean comprobarMayorQueCero(int num) {//metodo tipo booleano para comprobar que el numero es mayor de 0
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void calcularYMostrar(int limite) {//metodo para mostrar resultado
        int contador = 0;

        System.out.println("Los múltiplos de 3 entre 1 y " + limite + " son: ");

        for (int i = 1; i <= limite; i++) {//si 1 es menor o igual que "limite" que se vaya sumando de 1 en 1 

            if (i % 3 == 0) { //si la variable i entre tres es igual a cero...
                System.out.println(i + " ");
                contador++;
            }
        }

        System.out.println("Total de numeros mostrados: " + contador);
    }

}
