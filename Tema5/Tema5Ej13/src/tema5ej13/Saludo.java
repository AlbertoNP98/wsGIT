/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej13;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Saludo {

    //Atributos
    private String frase;

    //Constructores
    //Constructor por defecto
    public Saludo() {
        this.frase = "";
    }

    //Constructor parametrizado
    public Saludo(String frase) {
        this.frase = frase;
    }

    //Getters y Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    //Metodos
    //Bucle que repite la frase cinco veces
    public void repetirSaludo(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(frase);
        }
    }
    
    //Muestro el saludo
    public void mostrarSaludo() {
        System.out.println("Frase: " + frase);
    }
    
    @Override
    public String toString() {
        return "Saludo{" + "frase=" + frase + '}';
    }
}
