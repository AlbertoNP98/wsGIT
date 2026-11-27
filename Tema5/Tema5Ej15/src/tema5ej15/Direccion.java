/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej15;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Direccion {

    //Atributos
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;

    //Constructores
    //Constructor por defecto, inicio textos vacíos y numeros a cero
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = "";
        this.ciudad = "";
    }

    //Constructor parametrizado, recibe todos los datos de la direcicon
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //Otros metodos
    //Mostrar
    public void mostrarDireccion() {
        System.out.println("Calle: " + calle);
        System.out.println("Número:" + numero);
        System.out.println("Puerta: " + piso);
        System.out.println("Ciudad: " + ciudad);
    }
    
    //toString
    @Override
    public String toString() {
        return "Dirección [Calle=" + calle + ", Número=" + numero + ", Puerta=" + piso + ", Ciudad=" + ciudad + "]";
    }
}
