/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej16;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej16 {

    //Metodo que pide el nombre del alumno por teclado y lo devuelve
    public static String pedirNombre(Scanner entrada, int numAlumno) {
        System.out.println("Introduce el nombre del alumno " + numAlumno + ":");
        return entrada.nextLine();
    }

    //Metodo que pide la nota y avisa con error si no está entre 0 y 10
    public static int pedirNota(Scanner entrada, int numAlumno) {
        int nota;
        do {
            System.out.println("Introduce la nota del alumno" + numAlumno + " 0 o 10: ");
            nota = entrada.nextInt();
            entrada.nextLine();

            if (nota < 0 || nota > 10) {
                System.out.println("Error, la nota introducida no es valida.");
            }
        } while (nota < 0 || nota > 10);

        return nota;
    }

    //Metodo que coordina la peiticion de datos, crea el objeto alumno y lo devuelve
    public static Alumno crearAlumno(Scanner entrada, int numAlumno) {
        System.out.println("Datos del alumno " + numAlumno);
        String nombre = pedirNombre(entrada, numAlumno);
        int nota = pedirNota(entrada, numAlumno);

        Alumno nuevoAlumno = new Alumno(nombre, nota);
        return nuevoAlumno;
    }
    
    //Metodo que recibe un objeto alumno por parametro y muestra su ficha copmpleta
    public static void mostrarFichaAlumno(Alumno a, int numAlumno) {
        System.out.println("Ficha alumno " + numAlumno);
        a.mostrarAlumno();
    }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Creo a los alumnos
        Alumno alumno1 = crearAlumno(entrada, 1);
        Alumno alumno2 = crearAlumno(entrada, 2);
        Alumno alumno3 = crearAlumno(entrada, 3);
        
        //Muestro los resultados de cada uno 
        mostrarFichaAlumno(alumno1, 1);
        mostrarFichaAlumno(alumno2, 2);
        mostrarFichaAlumno(alumno3, 3);
        
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        
    }

}
