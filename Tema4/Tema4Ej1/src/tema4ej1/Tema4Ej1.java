/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej1;

import java.util.Scanner; //importo el escáner

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej1 {

    public static void signo(int par) { /*método estático VOID que recibe un
        parámetro entero y se encarga de imprimir el resultado sin dar datos
        */
        if (par >= 0) { //evalúa si el contenido es mayor o igual a 0
            System.out.println("El número introducido es positivo"); //si se cumple, sale positivo
        } else
                System.out.println("El número introducido es negativo");// y si no, negativo 
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creo el objeto escáner
        int  numero;//declaro la variable
        
        System.out.println("Por favor,introduce un número: ");
        numero = entrada.nextInt(); //el usuario introduce un número
        
        signo(numero);//invoco el método que he creado arriba, enviándole el número que ha puesto el usuario
    }
}

