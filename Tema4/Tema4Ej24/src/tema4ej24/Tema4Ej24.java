/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej24;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej24 {

    public static void main(String[] args) {
        String nombre = pedirNombre();//llamo al metodo que pide el nombre y lo guardo
        
        int edad = pedirEdad();//llamo al metodo que pide la edad y la guardo
        
        mayorDeEdad(nombre, edad);//paso ambos datos al metodo final para que haga la comprobacion y muestre el mensaje
    }

    public static String pedirNombre() {//priemr metodo para pedir el nombre al usuario
        Scanner entrada = new Scanner(System.in);// genero el escaner
        System.out.print("Introduce tu nombre: ");
        return entrada.nextLine(); // Usamos nextLine() porque es texto
    }

    public static int pedirEdad() {//segundo metodo para pedir la edad al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        return entrada.nextInt(); // Usamos nextInt() porque es un número
    }

    public static void mayorDeEdad(String nombreUsuario, int edadUsuario) {//recibe los parametros y comprueba si es mayor de edad
        if (edadUsuario >= 18) {
            System.out.println("El usuario llamado " + nombreUsuario + " es mayor de edad.");
        } else {
            System.out.println("El usuario llamado " + nombreUsuario + " no es mayor de edad.");
        }
    }
}
