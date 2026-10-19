/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class paquete_operaciones {
    
    public class Comparador {
        
        public static void imprimirMayor(int n1, int n2, int n3) { //método estático que recibe los tres numeros por parametros
            int mayor = n1;
            
            if (n2 > mayor) { //comprobamos cuál es el número más alto
                mayor = n2;
            }
            if (n3 > mayor) {
                mayor = n3;
                System.out.println("El número mayor de los introducidos es el " +mayor);
            }
        }
    }
    
}
