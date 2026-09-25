/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej15;

/**
 *
 * @author darkd
 */
public class Tema2EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        
        int horas = tiempo / 3600;
        int restosegundos = tiempo % 3600;
        
        int minutos = restosegundos / 60;
        int segundos = restosegundos % 60;
        
        System.out.println("10.000 segundos hacen un total de: " +horas+ " horas, " + minutos+ " minutos, y " +segundos+ " segundos.");
           
    }
    
}
