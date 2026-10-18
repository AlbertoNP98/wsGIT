/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ej4;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class paquete_operaciones {
          
        public static void imprimirMenor(int n1, int n2, int n3) { //método estático que recibe los tres numeros por parametros
            int menor = n1;
            
            if (n2 < menor) { //comprobamos cuál es el número más alto
                menor = n2;
            }
            if (n3 < menor) {
                menor = n3;
                System.out.println("El número mayor de los introducidos es el " +menor);
            }
        }
}   
