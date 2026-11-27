/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej12;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Triangulo {

    // Atributos (NUNCA se inicializan en la declaración)
    private double cateto1;
    private double cateto2;

    // Constructores
    // 1. Constructor por defecto: inicializa ambos catetos a 0
    public Triangulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
    }

    // 2. Constructor parametrizado: recibe los dos catetos al crear el objeto
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    // Getters y Setters
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    // Otros métodos
    // Mostrar los datos del triángulo por pantalla
    public void mostrarTriangulo() {
        System.out.println("Cateto 1: " + cateto1);
        System.out.println("Cateto 2: " + cateto2);
    }

    // Método toString() de la clase con formato limpio
    @Override
    public String toString() {
        return "Triángulo [Cateto 1 = " + cateto1 + ", Cateto 2 = " + cateto2 + "]";
    }
}

