/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej4;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo a los pajaros
        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();
        
        //les pongo color y edad
        p1.establecerColoryEdad("Rojo", 1);
        p2.establecerColoryEdad("Azul", 2);
        
        //imprimo el valor que nos devuelve el return
        System.out.println("El numero de pajaros creados es de: " + Pajarito.muestraPajaros());
    }
    
}
