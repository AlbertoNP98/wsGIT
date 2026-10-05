/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej18;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int passwordCorrecta = 1234; //genero las variables
        int passwordIntroducida;
        int intentos = 0;

        do { // Bucle do...while para pedir la contraseña al menos una vez
            System.out.print("Introduce la contraseña numérica: ");
            passwordIntroducida = entrada.nextInt();
            intentos++; // Sumamos 1 al contador

        if (passwordIntroducida != passwordCorrecta && intentos < 3) { // Si es distinta (!=) a la correcta y quedan intentos
                System.out.println("Contraseña incorrecta. Te quedan " + (3 - intentos) + " intento(s).\n");
        }

        } while (passwordIntroducida != passwordCorrecta && intentos < 3); // Si es distinta (!=) a la correcta y quedan intentos

        if (passwordIntroducida == passwordCorrecta) { // Comprobamos el motivo por el que salió del bucle usando el operador de igualdad (==)
            System.out.println("¡Enhorabuena! Acceso permitido.");
        } else {
            System.out.println("Error de acceso. Has fallado la contraseña 3 veces.");
        }
    }
}
