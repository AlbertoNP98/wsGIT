/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej11;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Numero {

    //Creo el atributo
    private int valor;

    //Constructor por defecto, se inicia en 0
    public Numero() {
        this.valor = 0;
    }

    //Constructor parametrizado, recibe un valor al crear el objeto
    public Numero(int valor) {
        this.valor = valor;
    }

    //Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //Muestro por pantalla
    public void mostrarNumero() {
        System.out.println("Valor: " + valor);
    }

    @Override
    public String toString() {
        return "El valor del numero es: " + valor;
    }
}
