/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej20;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej20 {

    //guardo las constantes usando final. Como estan fuera del main, todos los métodos pueden acceder aquí.
    public static final String RESPUESTA_CAPITAL = "Madrid";
    public static final String RESPUESTA_DESCUBRIDOR = "Colón";

    public static void main(String[] args) {
        int notaTotal = 0; //la nota del examen empieza en cero

        System.out.println("EXAMEN DE CULTURA GENERAL");

        notaTotal = notaTotal + hacerPregunta1(); //llamo al primer metodo y le sumo a la nota los puntos que devuelva

        notaTotal = notaTotal + hacerPregunta2(); //llamo al segundo metodo y le sumamos los puntos

        System.out.println("\n NOTA DEL EXAMEN: " + notaTotal); //le decimos al usuario su nota final 
    }

    public static int hacerPregunta1() {//metodo para la primera pregunta
        Scanner entrada = new Scanner(System.in);

        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuestaUsuario = entrada.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA_CAPITAL)) {//comparamos lo que ha escrito el usuario con la constante
            System.out.println("Muy bien, respuesta correcta.");
            return 5; //si acierta, son 5 puntos
        } else {
            System.out.println("No es correcto. La respuesta correcta es: " + (RESPUESTA_CAPITAL));
            return 0; //si falla, 0 puntos
        }
    }
    
    public static int hacerPregunta2() { //metodo para la segunda pregunta, es lo mismo que el de arriba
        Scanner entrada = new Scanner(System.in);

        System.out.println("1ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuestaUsuario = entrada.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA_DESCUBRIDOR)) {
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta es: " + (RESPUESTA_DESCUBRIDOR));
            return 0;
        }
    }

}
