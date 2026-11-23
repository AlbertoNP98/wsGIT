/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej4;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Pajarito {
    static int numpajaros = 0;
    String color;
    int edad;
    
    public void nuevopajaro() {
        numpajaros++;
    }
    
    public void establecerColoryEdad(String col, int ed) {
        color = col;
        edad = ed;
        nuevopajaro();
    }
    
    //cambio el void por el int y suo return para devolver el contador
    static int muestraPajaros () {
        return numpajaros;
    }
}
