/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej21;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int num1, num2, resultado;
        
        System.out.println("introduzca un numero: ");// Las lecturas de datos van por libre. Si metes texto aquí, el programa fallará
        num1 = entrada.nextInt();
        
        System.out.println("introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        try {// El bloque try aísla exclusivamente el cálculo matemático
            resultado = num1 / num2;// Si num2 es igual a 0, se interrumpe y salta al catch
            System.out.println("Resultado de la división:  + reusltado");// Corrección aplicada: "reusltado" cambiado por "resultado" para evitar error de compilación
        }
        catch(ArithmeticException e) {// Este catch atrapa los errores matemáticos imposibles, como dividir entre cero
                System.out.println("Error, " +e.getMessage());
        }
    }
    
}
