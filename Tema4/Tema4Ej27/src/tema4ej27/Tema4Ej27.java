/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej27;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//genero el escaner
        String eleccionUsuario;
        String resultadoMoneda;
        boolean haAcertado = false;

        System.out.println("/ JUEGO DE LA MONEDA /");

        do {// El bucle se repite continuamente hasta que el usuario acierte
            System.out.print("Elige 'cara' o 'cruz': ");//Le pedimos al usuario que pida "cara" o "cruz"
            eleccionUsuario = entrada.nextLine();

            //genero aleatoriamente el resultado llamando al método
            resultadoMoneda = tirarMoneda();

            //mostramos al usuario el resultado de la moneda
            System.out.println("La moneda ha caído en... ¡" + resultadoMoneda + "!");

            //compruebo si el texto introducido coincide con el resultado
            if (eleccionUsuario.equalsIgnoreCase(resultadoMoneda)) {
                // Le damos la Enhorabuena si ha acertado
                System.out.println("¡Enhorabuena! Has acertado.");
                haAcertado = true; // Cambiamos a true para que el bucle while se detenga
            } else {
                // Le decimos que ha perdido, y el bucle volverá a empezar automáticamente
                System.out.println("Has perdido. Vuelve a intentarlo.\n");
            }

        } while (!haAcertado); // Así hasta que acierte
    }

    // Método que simula el lanzamiento de la moneda
    public static String tirarMoneda() {
        // Math.random() * 2 genera un 0 o un 1 de forma aleatoria
        int aleatorio = (int) (Math.random() * 2);

        if (aleatorio == 0) {
            return "cara";
        } else {
            return "cruz";
        }
    }
}
