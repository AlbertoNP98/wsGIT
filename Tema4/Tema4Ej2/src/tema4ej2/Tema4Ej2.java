/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej2;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej2 {
    
    public class operaciones { 
        
        public static void multiplicar(int num1, int num2) {//método estático que recibe dos int, calcula el producto y lo imprime
            int resultado = num1 * num2;
            System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
        }

        public static void sumar(int num1, int num2) {//método estático que recibe dos int, calcula la suma y lo imprime
            int resultado = num1 + num2;
            System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
        }
}      

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //genero el escaner
        int numeroUno, numeroDos; //declaro variables

        System.out.print("Por favor, introduzca un numero: ");
        numeroUno = entrada.nextInt(); //usuario introduce un numero

        System.out.print("Ahora, introduzca un segundo numero: ");
        numeroDos = entrada.nextInt(); //usuario introduce otro numero 

        
        if (numeroUno > 10) {// Se evalúa si el contenido de la primera variable es estrictamente mayor que 10.
            operaciones.multiplicar(numeroUno, numeroDos);// Si la condición es verdadera, llamamos a la clase externa 'operaciones' y usamos su método 'multiplicar', enviándole los dos números.
        } else {
            operaciones.sumar(numeroUno, numeroDos);// Si la condición es falsa (es 10 o menor), llamamos a la clase externa 'operaciones' y usamos su método 'sumar'.
        }
    }
}   

