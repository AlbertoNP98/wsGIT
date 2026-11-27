/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej14;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Numero {

    //Atributo
    private int valor;

    //Constructores
    //Constructor por defecto, inicio el atributo a 0
    public Numero() {
        this.valor = 0;
    }

    //Constructor parametrizado
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
    
    //Otros metodos
    //Bucle que calcula e imprime la tabla de multiplicar del 1 al 10
    public void mostrarTablaMultiplicar() {
        System.out.println("TABLA DE MULTIPLICAR DEL " + valor);
        for (int i = 1; i <=10 ; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
    
    //Muestro el numero
    public void mostrarNumero() {
        System.out.println("Valor: " + valor);
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Numero elegido: " + valor;
    }
}
