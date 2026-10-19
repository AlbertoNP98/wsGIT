/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class par_impar {

        public static void comprobarParidad(int num) { //método estático que recibe los tres numeros por parametros
            if (num % 2 == 0) {
                System.out.println("El numero introducido es par");
            } else {
                System.out.println("El numero introducido es impar");
            }
        }
    }

