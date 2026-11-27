/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej17;

import java.util.Scanner;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Tema5Ej17 {
    
    //Metodo que lanza una pregunta al usuario, comprueba si acierta y devuelve los puntos
    public static double hacerPregunta(Enunciado e, Scanner entrada) {
        System.out.println(e.getPregunta());
        System.out.println("Tu respuesta: ");
        String respuestaUsuario = entrada.nextLine();
    
        if (e.comprobarRespuesta(respuestaUsuario)) {
            System.out.println("Correcto! +2,5 puntos");
            return 2.5;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es:" + e.getRespuesta());
            return 0.0;
        }
    }
    
    //Metodo que recibe la nota acumulada y muestra el resultado final del examen
    public static void mostrarNotaFinal(double nota) {
        System.out.println("EXAMEN FINALIZADO. TU NOTA ES: " + nota + " /10");
        if (nota >= 5.0) {
            System.out.println("Estas aprobado!");
        } else {
            System.out.println("Estas suspenso!");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Creo los cuatro objetos enunciado usando el constructor parametrizado
        Enunciado p1 = new Enunciado("1. ¿Cual es la capital de España?", "Madrid");
        Enunciado p2 = new Enunciado("2. ¿Cual es la capital de Italia?", "Roma");
        Enunciado p3 = new Enunciado("3. ¿De qué color es el caballo blanco de Santiago?", "Blanco");
        Enunciado p4 = new Enunciado("4. ¿Cuántos planetas tiene el sistema solar?", "8");
        
        //Variable acumuladora para ir sumando la nota del examen
        double notaTotal = 0.0;
        
        System.out.println("COMIENZA EL EXAMEN");
        
        //llamo al metodo hacerPregunta pasandole cada objeto y vamos sumando
        notaTotal += hacerPregunta(p1, entrada);
        notaTotal += hacerPregunta(p2, entrada);
        notaTotal += hacerPregunta(p3, entrada);
        notaTotal += hacerPregunta(p4, entrada);
        
        //Muestro la nota final por pantalla
        mostrarNotaFinal(notaTotal);
    }
    
}
