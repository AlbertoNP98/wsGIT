/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej2;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el objeto curso1 y curso2
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //Establezco nombre y horas
        curso1.ponerNombreyHoras("Programacion; ", 250);
        curso2.ponerNombreyHoras("Bases de datos; ", 190);
        
        //Muestro los datos 
        System.out.println("Datos de los cursos: ");
        
        System.out.println("-- CURSO 1--");
        System.out.println("Nombre del curso: " + curso1.getNombre());
        System.out.println("Numero total de horas: " + curso1.getNumeroHoras());
  
        System.out.println("");
        
        System.out.println("-- CURSO 2--");
        System.out.println("Nombre del curso: " + curso2.getNombre());
        System.out.println("Numero total de horas: " + curso2.getNumeroHoras());
        
        //muestro el total con el método estático
        System.out.println("El numero total de cursos creados es de: " + Curso.verNumeroCursos());
    }
}