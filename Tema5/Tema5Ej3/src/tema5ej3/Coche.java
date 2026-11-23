/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej3;

/**
 *
 * @author darkd
 */
public class Coche {
    //Pongo los atributos a la clase
    private String marca;
    private String modelo;
    private Rueda ruedas; //Objeto de tipo rueda
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String m) {
        marca = m;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String mod) {
        modelo = mod;
    }
    
    public Rueda getRuedas() {
        return ruedas;
    }
    
    public void setRuedas(Rueda r) {
        ruedas = r;
    }
}
