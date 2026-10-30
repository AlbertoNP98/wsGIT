/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej19;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej19 {

    public static void main(String[] args) {       
        String diaSemana = pedirDia();// Pedimos el día llamando al método
               
        mostrarPosicion(diaSemana);// Pasamos el texto introducido al método que evalúa la posición
    }

    public static String pedirDia() { //creamos metodo para pedir el dia
        Scanner entrada = new Scanner(System.in);//genero el escaner
        System.out.print("Por favor, introduzca un día de la semana: "); 
        return entrada.nextLine();
    }

    public static void mostrarPosicion(String dia) {        
        switch (dia.toLowerCase()) {// .toLowerCase() convierte el texto a minúsculas solo para la comprobación
            case "lunes":
                System.out.println("El " + dia + " es el primer día de la semana");
                break;
            case "martes":
                System.out.println("El " + dia + " es el segundo día de la semana");
                break;
            case "miércoles":
            case "miercoles": // Ponemos los dos casos por si el usuario no pone la tilde
                System.out.println("El " + dia + " es el tercer día de la semana"); //[cite: 26]
                break;
            case "jueves":
                System.out.println("El " + dia + " es el cuarto día de la semana");
                break;
            case "viernes":
                System.out.println("El " + dia + " es el quinto día de la semana");
                break;
            case "sábado":
            case "sabado":
                System.out.println("El " + dia + " es el sexto día de la semana");
                break;
            case "domingo":
                System.out.println("El " + dia + " es el séptimo día de la semana");
                break;
            default:
                System.out.println("Error: No has introducido un día válido.");
        }
    }
}
