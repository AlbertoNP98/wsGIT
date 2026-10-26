/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej9;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema4Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamamos al método de la OTRA clase para pedir los tres números
        // Guardamos cada número devuelto en una variable
        int numero1 = paqueteImprimir.pedirNumero("primer");
        int numero2 = paqueteImprimir.pedirNumero("segundo");
        int numero3 = paqueteImprimir.pedirNumero("tercer");
        
        // Pasamos los tres números recopilados al método que calcula el menor
        paqueteImprimir.imprimirMenor(numero1, numero2, numero3);
    }
    
}
