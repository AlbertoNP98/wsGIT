/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej23;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int numero; //genero la variable
        
        do{
            System.out.println("introduzca un numero: "); //le pido numero al usuario
            numero = entrada.nextInt();
        
            if (numero <= 1) { // valido la entrada del usuario hasta que sea correcta
                System.out.println("Error: el número debe ser mayor de uno.");
        }
        } while (numero <= 1);
        System.out.println("Los números existentes entre 1 y " + numero + " son: "); //imprimo los numeros entre el 1 y el introducido
        
        for (int i = 2; i < numero; i++){ //el bucle inicia en 2 y termina justo antes del numero puesto por el usuario
            System.out.println(i +" ");
        }
    }
    }

