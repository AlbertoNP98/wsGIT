/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej18;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej18 {

    public static void main(String[] args) {

        String nombre = pedirNombre();// Llamamos al primer método y guardamos el texto que nos devuelve

        mostrarNombreRepetido(nombre);// Le pasamos ese texto al segundo método para que ejecute el bucle
    }

    public static String pedirNombre() {// Método 1: Utiliza un método para pedir el nombre
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        return entrada.nextLine();// Usamos nextLine() para capturar palabras o frases enteras
    }
   
    public static void mostrarNombreRepetido(String nombre) {// Método 2: Otro método que contenga un bucle para mostrar el nombre las cinco veces    
        for (int i = 1; i <= 5; i++) {// Configuramos el bucle for para que dé exactamente 5 vueltas
            System.out.println(i + " - " + nombre);
        }
    }
}
