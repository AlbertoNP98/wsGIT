/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej16;

/**
 *
 * @author darkd
 */
public class Tema2EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero = 130;
        int billete1 = 50;
        int billete2 = 10;
        
        int billetes1 = dinero / billete1;
        int billetes11= billetes1 % billete1;
         
        
        int billetes2= dinero / billete2;
        int billetes22= billetes2 % billete2;
        
        System.out.println("130 euros hacen un total de: " +billetes11+ " de 50 euros y "+ billetes22 + " billetes de 10 euros");
    }
    
}
