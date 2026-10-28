/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ej16;

/**
 *
 * @author darkd
 */
public class Tema4Ej16 {

    public static void main(String[] args) { //llamo a todos los subprogramas uno por uno
        calcularRaiz();
        calcularPotencia();
        calcularExponencial();
        calcularLogaritmo();
        calcularMenor();
        calcularValorAbsoluto();
        calcularRedondeo();
        calcularSeno();
    }

    public static void calcularRaiz() {
        System.out.println("Raíz cuadrada de 64: " + Math.sqrt(64));//raíz cuadrada de 64
    }

    public static void calcularPotencia() {
        System.out.println("8 elevado al cubo: " + Math.pow(8, 3));// 8 elevado al cubo
    }

    public static void calcularExponencial() {
        System.out.println("Exponencial de 2: " + Math.exp(2));// Exponencial de 2
    }

    public static void calcularLogaritmo() {
        System.out.println("Logaritmo de 2.71828: " + Math.log(2.71828));// Logaritmo de 2,71828
    }

    public static void calcularMenor() {
        System.out.println("Menor valor entre 2 y 3: " + Math.min(2, 3));// Menor valor entre 2 y 3
    }

    public static void calcularValorAbsoluto() {
        System.out.println("Valor absoluto de -4.5: " + Math.abs(-4.5));// Valor absoluto de -4,5
    }

    public static void calcularRedondeo() {
        System.out.println("Redondeando -4.5: " + Math.round(-4.5));// Redondeando -4,5 con ROUND
    }

    public static void calcularSeno() {
        System.out.println("Seno de 45 grados: " + Math.sin(Math.toRadians(45)));//seno de 45 grados
    }
}
