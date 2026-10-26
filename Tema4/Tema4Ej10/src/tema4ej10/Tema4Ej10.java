/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej10;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //genero el metodo para obtener el numero del usuario
        int numeroElegido = pedirNumero();
        imprimirTabla(numeroElegido);//le pasamos el metodo al segundo metodo creado
    }

    public static int pedirNumero() { //este metodo es para pedir el numero por teclado y lo devuelve al main
        Scanner entrada = new Scanner(System.in);//genero el escaner
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt();//usuario introduce un numero
        return numero;
    }

    public static void imprimirTabla(int num) {//recibe el numero y usa un bucle para hacer la tabla de multiplicar
        for (int i = 0; i <= 10; i++) {//hago el for para que de vueltas, del 0 al 10.
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
