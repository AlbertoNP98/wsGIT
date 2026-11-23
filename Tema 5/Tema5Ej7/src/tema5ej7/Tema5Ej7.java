/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej7;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej7 {

    // Método en Test que recibe el objeto Descarga y muestra nombre y tiempo
    public static void mostrarDescarga(Descarga d) {
        // Pasamos MB a megabits (* 8), dividimos entre Mbps (segundos) y entre 60 (minutos)
        double tiempoMinutos = ((d.getTamañoDescarga() * 8) / d.getVelocidadDescarga()) / 60;

        System.out.println("\n--- RESULTADO DE LA DESCARGA ---");
        System.out.println("Archivo: " + d.getNombreDescarga());
        System.out.println("Tiempo estimado: " + tiempoMinutos + " minutos\n");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        Descarga miDescarga; // Declaramos la variable del objeto fuera del bucle

        do {
            //Pedimos los datos al usuario
            System.out.print("Introduce el nombre de la descarga: ");
            String nombre = teclado.nextLine();

            System.out.print("Introduce el tamaño del archivo (en MB): ");
            double tamaño = teclado.nextDouble();

            System.out.print("Introduce la velocidad del ADSL (en megabits): ");
            double velocidad = teclado.nextDouble();
            teclado.nextLine(); // Limpiamos el buffer del Scanner después de leer números

            //Creo (o sobreescribimos) el objeto usando el constructor
            miDescarga = new Descarga(nombre, tamaño, velocidad);

            //Llamo al método pasándole el objeto entero
            mostrarDescarga(miDescarga);

            //Pregunto si quiere crear otro objeto
            System.out.print("¿Deseas crear otra descarga? (si/no): ");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
    }
}
