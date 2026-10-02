/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej16;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema3Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        
        System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");
        
        for (int i = 20; i <= 160; i++) {
            if (i % 2 != 0) { // Comprobamos si el número es impar (el resto de dividir entre 2 no es cero)
                System.out.print(i);
                contador++; // Sumamos 1 al contador
                
                if (i < 159) {// Evitamos poner el guion después del último número impar (159)
                    System.out.print(" - ");
                }
            }
        }
        
        System.out.println(); // Salto de línea para que quede ordenado
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
  
    
    }  
}
