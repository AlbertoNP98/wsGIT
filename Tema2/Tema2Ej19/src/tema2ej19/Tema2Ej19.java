/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej19;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema2Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3, b = 6, c;
        c = a / b;
        System.out.println("El valor de c es: " + c ); //el resultado de dividir 3 / 6 es 0.5, como no esta puesto decimal, da 0.
        
        c = a % b;
        System.out.println("El valor de c es: " + c ); //el resultado del resto de 3 y 6 es 3.
        
        a++;
        System.out.println("El valor de a es: " + a ); //incremento el valor de a en 1 más por el ++ (operador unario)
        
        ++a;
        System.out.println("El valor de a es: " + a ); //incremento el valor de a en 1 más, pero el de justo arriba, no el a de arriba del todo del int.
        
        c = ++a + b++;
        System.out.println("El valor de a es: " + a ); //incremento el valor de a, pero el de arriba, como antes.
        System.out.println("El valor de b es: " + b ); //aquí pasa lo mismo, pero ahora con el b, se le suma 6 + 1
        System.out.println("El valor de c es: " + c ); //se suma el valor de ++a y b++, que nos da 12.
        
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a ); //le volvemos a sumar 1 numero en a.
        System.out.println("El valor de b es: " + b ); //otra vez con el b
        System.out.println("El valor de c es: " + c ); //si sumamos ++a y ++b, nos da 15
    }
    
}
