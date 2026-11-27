/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej13;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej13 {

    //Metodo que crea y devuelve un objeto Saludo usando el constructor parametrizado
    public static Saludo crearSaludo(String texto) {
        Saludo nuevoSaludo = new Saludo(texto);
        return nuevoSaludo;
    }

    //Metodo que recibe el objeto Saludo por referencia y ejecuta el bucle de repeticion
    public static void ejecutarSaludo(Saludo s, int repeticiones) {
        System.out.println("Repitiendo el saludo " + repeticiones + " veces");
        s.repetirSaludo(repeticiones);
        //Tambien pongo el toString
        System.out.println("Objeto utilizado: " + s.toString());
    }

    public static void main(String[] args) {
        Saludo miSaludo = crearSaludo("Hola, que tal");
        ejecutarSaludo(miSaludo, 5);
    }

}
