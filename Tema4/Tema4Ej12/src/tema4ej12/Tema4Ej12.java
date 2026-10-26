/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej12;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passwordCorrecta = 1234; //defino la contraseña correcta
        int intentos = 0; //empezamos con cero intentos
        boolean esCorrecta = false;

        while (intentos < 3 && !esCorrecta) { //el bucle se repite mientras queden intentos (menos de 3) y la contraseña no sea correcta 
            int passIntroducida = pedirContrasena();//llamo al metodo de la peticion

            esCorrecta = comprobarContrasena(passIntroducida, passwordCorrecta);//llamo al metodo de comprobacion booleano

            intentos++;//sumamos un intento fallido o acertado
        }
        mostrarResultado(esCorrecta); //cuando salimos del bucle, le pasamos el resultado final al ultimo metodo
    }

    public static int pedirContrasena() { //la peticion lo pedimos en un metodo
        Scanner entrada = new Scanner(System.in);//genero escaner
        System.out.println("Por favor, introduzca la contraseña");
        return entrada.nextInt();   //pido al usuario que introduzca la contraseña     
    }

    public static boolean comprobarContrasena(int introducida, int correcta) { //compruebo la contraseña, con un metodo booleano
        if (introducida == correcta) { //si contraseña es correcta
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarResultado(boolean acierto) {// el resultado de la comprobacion lo hago desde otro metodo
        if (acierto) { //si la introduce bien, le doy la enhorabuena
            System.out.println("Enhorabuena, has acertado!");
        } else { //si no, error
            System.out.println("Error. Has agotado tus tres intentos.");
        }
    }
}
