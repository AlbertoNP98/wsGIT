/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej2;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Curso {
    //Le pongo los atributos a la Clase
    private String nombre;
    private int NumeroHoras;
    private static int numeroDeCursos = 0;
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public int getNumeroHoras(){
        return NumeroHoras;              
    }

    public void setNumeroHoras(int h) {
        NumeroHoras = h;
    }
    
    //Le pongo los métodos de accion
    public void ponerNombreyHoras(String nom, int hor) {
        nombre = nom;
        NumeroHoras = hor;
        sumarCursos();
    }
    
    public static void sumarCursos() {
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
    
}
