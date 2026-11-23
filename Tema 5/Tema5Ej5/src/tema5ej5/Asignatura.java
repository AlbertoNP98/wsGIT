/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej5;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Asignatura {
    //Le pongo los atributos
    private String nombre;
    private double nota;
    
    //Constructor: asigna directamente el nombre al hacer el new
    public Asignatura(String n) {
        nombre = n;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double n) {
        nota = n;
    }
    
    //Creo el metodo que recibe las 6 notas y devuelve la media
    public static double calcularMedia(double n1, double n2, double n3, double n4, double n5, double n6) {
        return (n1 + n2 + n3 + n4 + n5 + n6) / 6;
    }
}
