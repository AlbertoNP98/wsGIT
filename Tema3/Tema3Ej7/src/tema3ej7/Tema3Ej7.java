/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej7;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// Creamos el objeto Scanner para leer la entrada del usuario

        System.out.println("Introduce el día de la semana (1-7): ");// Pedimos el día de la semana
        int diasemana = entrada.nextInt();

        boolean laborable = false; // Inicializamos la variable booleana

        switch (diasemana) { // Fragmento de código solicitado (sin modificar)
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
        }

        // Mostramos el resultado según el valor de la variable
        if (laborable) {
            System.out.println("El día " + diasemana + " es laborable.");
        } else {
            System.out.println("El día " + diasemana + " no es laborable.");
        }
        }
    }
    

