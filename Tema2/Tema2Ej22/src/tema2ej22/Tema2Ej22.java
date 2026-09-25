/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej22;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creamos el objeto de entrada
        int num, perimetro, altura, area; //genero las variables
        
        System.out.println("Por favor, introduzca la medida de un lado: "); //mensaje de peticion al usuario
        num = entrada.nextInt(); //guardamos el valor introducido 
        
        perimetro = num + num + num; //calculamos el perimetro sumando los tres lados
        System.out.println("El perímetro de un triángulo es: " +perimetro); 
        
        System.out.println("Por favor, introduzca la altura: "); //mensaje de peticion al usuario
        altura = entrada.nextInt(); //guardamos el valor introducido 
        
        area= (num * altura) / 2; //aplico la formula matematica
        System.out.println("El area de un triángulo es: " + area);
        
    }
    
}
