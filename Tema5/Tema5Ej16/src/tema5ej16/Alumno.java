/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej16;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Alumno {

    //Atributos
    private String nombre;
    private int nota;

    //Constructores
    //Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    //Constructor parametrizado, recibe nombre y nota al crear el objeto
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    //Otros metodos
    //Metodo que evalua la nota y devuelve su calificacion
    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Error, la nota debe estar entre 0 y 10";
        }
    }

    //Mostrar alumno
    public void mostrarAlumno() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificacion: " + obtenerCalificacion());
    }

    @Override
    public String toString() {
        return "Alumno [Nombre=" + nombre + ", Nota=" + nota + ", Calificación=" + obtenerCalificacion() + "]";
    }
}
