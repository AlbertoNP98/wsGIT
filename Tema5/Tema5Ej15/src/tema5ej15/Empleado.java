/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej15;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Empleado {

    //Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;

    //Constructores
    //Constructor por defecto
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion(); //inicio direccion con new direccion para evitar null
    }

    //Constructor parametrizado, recibe nombre, salario y un objeto Direccion ya creado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Otros metodos
    //Mostrar
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion: ");
        direccion.mostrarDireccion();//Llamo al metodo de su objeto
    }
    
    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Salario=" + salario + ", " + direccion.toString() + "]";
    }
}
