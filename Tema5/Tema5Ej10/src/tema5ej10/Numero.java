/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej10;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Numero {

    //Atributos
    private int valor;

    //Constructores
    public Numero() { //Por defecto, se inicia en cero
        this.valor = 0;
    }

    public Numero(int valor) { //Constructor parametrizado, este recibe el valor inicial al hacer new
        this.valor = valor;
    }
    
    //Getters y Setters
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Otros métodos
    public boolean esMayorQue(Numero otro) {// Comprueba si este objeto tiene un valor mayor que otro objeto Numero
        return this.valor > otro.getValor();
    }
    
    //Mostramos numeros
    public void mostrarNumero() {
        System.out.println("El valor es: " + valor);
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Numero : " + valor + " , ";
    }
}

