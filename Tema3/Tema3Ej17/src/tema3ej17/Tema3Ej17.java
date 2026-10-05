/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej17;
import java.util.Scanner;
/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej17 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        double numero; //Genero la variable 
        
        do { // bucle do...while para pedir el número al menos una vez
            System.out.println("Introduce un número para calcular la raíz cuadrada");
            numero = entrada.nextDouble();
            
            if (numero < 0) { //Si el número es negativo, muestro el mensaje de error
                System.out.println("Error: No se puede calcular la raíz cuadrada de " + numero);
            }
       
        } while (numero < 0); // El bucle se repite mientras el número sea negativo
          double raiz = Math.sqrt(numero); //Cálculo de la raíz cuadrada
          System.out.println("La raíz cuadrada de " + numero + " es " +raiz);
    }
}
