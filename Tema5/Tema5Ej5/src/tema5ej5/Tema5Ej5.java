/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej5;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //genero el escaner
        Scanner teclado = new Scanner(System.in);
        
        //Creo las 6 asignaturas y paso el nombre al constructor
        Asignatura prog = new Asignatura("Programación");
        Asignatura lm = new Asignatura("Lenguaje de Marcas");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informáticos");
        Asignatura fol = new Asignatura("Formación y Orientación Laboral");
        
        //Le pido al usuario las notas y las guardamos
        System.out.println("Por favor, introduzca la nota de " + prog.getNombre());
        prog.setNota(teclado.nextDouble());
   
        System.out.println("Por favor, introduzca la nota de " + lm.getNombre());
        lm.setNota(teclado.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de " + bd.getNombre());
        bd.setNota(teclado.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de " + ed.getNombre());
        ed.setNota(teclado.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de " + si.getNombre());
        si.setNota(teclado.nextDouble());
        
        System.out.println("Por favor, introduzca la nota de " + fol.getNombre());
        fol.setNota(teclado.nextDouble());
        
        //Calculo la media pasando la nota
        double media = Asignatura.calcularMedia(prog.getNota(), lm.getNota(), bd.getNota()
                    , ed.getNota(), si.getNota(), fol.getNota());
        System.out.println("La nota media del curso es de: " + media);
    }
    
}
