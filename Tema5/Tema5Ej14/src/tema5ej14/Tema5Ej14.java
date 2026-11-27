/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej14;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej14 {

    //Metodo que pide el numero al usuario y se lo asigna al atributo valor del objeto
    public static void asignarValorUsuario(Numero n) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres que multiplique: ");
        int numElegido = entrada.nextInt();
    // Al pasar el objeto por referencia, setValor modifica el objeto original
        n.setValor(numElegido);
    }
     
    //Metodo que recibe el objeto Numero y lanza su metodo para imprimir la tabla
    public static void ejecutarTabla(Numero n){
        n.mostrarTablaMultiplicar();
        System.out.println("Objeto utilizado: " + n.toString());
    }
    
    public static void main(String[] args) {
        
        Numero miNumero = new Numero();//Creo el numero, por defecto es cero
        asignarValorUsuario(miNumero); //asigno el valor elegido por el usuario
        ejecutarTabla(miNumero);
    }

}
