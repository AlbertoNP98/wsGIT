/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej21;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema4Ej21 {

    public static void main(String[] args) {
        int num1 = pedirPrimerNumero(); //llamo al primer metodo para pedir el dato inicial
        
        int num2 = pedirSegundoNumero(num1); //llamo al segundo metodo, y le paso el num1 para que pueda hacer la comprobacion
                
        calcularYMostrarSuma(num1, num2); //paso ambos numeros al metodo final para calcular y mostrar el resultado
                
    }

    public static int pedirPrimerNumero() { //metodo para pedir el primer numero
        Scanner entrada = new Scanner(System.in); //genero el escaner
        System.out.println("Por favor, introduce el primer numero");
        return entrada.nextInt();
    }

    public static int pedirSegundoNumero(int primero) { //pido el segundo numero comprobando que sea mayor que el primero
        Scanner entrada = new Scanner(System.in);
        int segundo;
        
        do {// El bucle repite la petición si el segundo número no es mayor que el primero
            System.out.print("Introduce un segundo número (tiene que ser mayor que " + primero + "): ");
            segundo = entrada.nextInt();

            if (segundo <= primero) {
                System.out.println("Error: El número debe ser mayor. Vuelve a intentarlo.");
            }

        } while (segundo <= primero);

        return segundo;
    }

    public static void calcularYMostrarSuma(int inicio, int fin) {
        int suma = 0; // Creamos una variable acumuladora que empieza en cero
        
        for (int i = inicio; i <= fin; i++) {// El bucle recorre todos los números comprendidos entre el inicio y el fin
             
            if (i % 2 == 0) {// Comprobamos si el número actual (i) es par usando el módulo
                suma = suma + i; // Si es par, se lo sumamos a lo que ya tuviéramos guardado en la variable 'suma'
            }
        }    
        // Una vez que el bucle termina de sumar todos, mostramos el total en pantalla
        System.out.println("La suma total de los números pares comprendidos entre " + inicio + " y " + fin + " es: " + suma);
    }
}
