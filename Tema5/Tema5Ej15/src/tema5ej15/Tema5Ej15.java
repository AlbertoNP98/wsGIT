/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej15;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej15 {

    //Metodo que recibe un objeto empleado y su numero para mostrar sus datos 
    public static void mostrarDatosEmpleado(Empleado emp, int numEmpleado) {
        System.out.println("Empleado " + numEmpleado + ":");
        emp.mostrarEmpleado();
        System.out.println("");
    }

    public static void main(String[] args) {
        //Creo las tres direcciones usando el constructor parametrizado
        Direccion dir1 = new Direccion("Calle Mayor", 12, "2º A", "Plasencia");
        Direccion dir2 = new Direccion("Avenida del Valle", 45, "1º B", "Caceres");
        Direccion dir3 = new Direccion("Calle Sol", 8, "3º C", "Madrid");

        //Creo a los tres empleados asignándoles las direcciones anteriores
        Empleado emp1 = new Empleado("Alberto Navarro", 1800, dir1);
        Empleado emp2 = new Empleado("Pepe Villuela", 2100, dir2);
        Empleado emp3 = new Empleado("Steve Creeper", 1950, dir3);
        
        //Llamo al metodo que muestra los datos de cada empleado
        mostrarDatosEmpleado(emp1, 1);
        mostrarDatosEmpleado(emp2, 2);
        mostrarDatosEmpleado(emp3, 3);
        
    }

}
