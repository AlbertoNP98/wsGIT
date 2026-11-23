/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej7;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Descarga {
    //Creo los atributos
    private String nombreDescarga;
    private double tamañoDescarga; //esto es en MB
    private double velocidadDescarga; //en Mbps
    
    //Creo el constructor con los atributos
    public Descarga(String nom, double tam, double vel){
        nombreDescarga = nom;
        tamañoDescarga = tam;
        velocidadDescarga = vel;
    }
    
    //Getter y Setters
    public String getNombreDescarga() {
        return nombreDescarga;
    }
    
    public void setNombreDescarga(String nom) {
        nombreDescarga = nom;
    }
    
    public double getTamañoDescarga() {
        return tamañoDescarga;
    }
    
    public void setTamañoDescarga(double tam) {
        tamañoDescarga = tam;
    }
    
    public double getVelocidadDescarga() {
        return velocidadDescarga;
    }
    
    public void setVelocidadDescarga(double vel) {
        velocidadDescarga = vel;
    }
}
