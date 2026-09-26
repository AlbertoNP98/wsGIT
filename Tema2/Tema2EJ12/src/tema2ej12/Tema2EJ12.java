/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej12;

/**
 *
 * @author darkd
 */
public class Tema2EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=5; //inicio la variable
        
        /* Primero evaluo la parte derecha de la asignacion. la multiplicacion tiene prioridad.
        La expresion de la derecha como como num - 4 +1 y da como resultado 2
        el operador += suma este resultado al valor original de la variable num = 5 + 2, por lo que pasa a ser 7 el num
        */
        num += num -1 *4 +1;
        System.out.println(num);
        
        /* Al igual que antes, se evalua toda la expresion a la derecha del operador %= primero.
        las operadores de multiplicacion y modulo tienen la misma prioridad y se evaluan de izquierda a derecha
        antes que el operador de desplazamiento de bits >>.
         * num se convierte en 7+4 que es 28
        28 % 3 da 1, es el resto de dividirlos.
        1 * 7 es 7
        ahora se aplica el operador de desplazamiento a la derecha 7 >> 1. desplaza los bits del numero 7 0111 en binario
        una posicion a la derecha, resultando en 0011, que en decimal es 3.
        la asignación final es num %=3, que equivale a num = num % 3.
        sustituyendo el valor que tenia la variable antes de esta operacion num 4%3 el resto da 1.
        */
        num = 4;
        num %=7 * num % 3 * 7 >> 1;
        System.out.println(num);
               
    }
    
}
