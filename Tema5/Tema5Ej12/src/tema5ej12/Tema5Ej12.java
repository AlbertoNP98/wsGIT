/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej12;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej12 {

    public static double calcularHipotenusa(Triangulo t) {
        // Math.pow(base, 2) eleva al cuadrado y Math.sqrt(...) hace la raíz cuadrada
        double sumaCuadrados = Math.pow(t.getCateto1(), 2) + Math.pow(t.getCateto2(), 2);
        return Math.sqrt(sumaCuadrados);
    }

    // Método 2: Recibe el objeto Triangulo y la hipotenusa calculada para mostrarlo todo
    public static void mostrarResultados(Triangulo t, double hipotenusa) {
        System.out.println("\n****** RESULTADOS DEL TRIÁNGULO ******");
        t.mostrarTriangulo(); // Llamamos al método propio de la clase Triangulo
        System.out.println("Hipotenusa: " + hipotenusa);

        // También podemos mostrar el resumen con toString()
        System.out.println("\nDetalle del objeto: " + t.toString());
    }
    
    public static void main(String[] args) {
        // Método 1: Recibe el objeto Triangulo, aplica Pitágoras y devuelve la hipotenusa


        Scanner entrada = new Scanner(System.in);

        // 1. Pedimos los dos catetos al usuario
        System.out.print("Introduce la longitud del primer cateto: ");
        double c1 = entrada.nextDouble();

        System.out.print("Introduce la longitud del segundo cateto: ");
        double c2 = entrada.nextDouble();

        // 2. Creamos el objeto Triangulo pasándole los catetos al constructor
        Triangulo miTriangulo = new Triangulo(c1, c2);

        // 3. Llamamos al método que calcula la hipotenusa pasándole el objeto
        double hipotenusa = calcularHipotenusa(miTriangulo);

        // 4. Llamamos al método que muestra los resultados por pantalla
        mostrarResultados(miTriangulo, hipotenusa);
    }
}
