/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ej3;

/**
 *
 * @author Alberto Navarro Pérez
 */
public class Tema5Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo 2 objetos de la clase rueda
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        //Pongo el material y tamaño en las dos ruedas
        rueda1.setMaterial("Aleacion");
        rueda1.setPulgadas(17);
        
        rueda2.setMaterial("Acero");
        rueda2.setPulgadas(15);
        
        //Muestro los datos de las ruedas
        System.out.println("RUEDAS:");
        System.out.println("Rueda 1. Material: " + rueda1.getMaterial() + " , Tamaño: " + rueda1.getPulgadas()+ " pulgadas.");
        System.out.println("Rueda 2. Material: " + rueda2.getMaterial() + " , Tamaño: " + rueda2.getPulgadas()+ " pulgadas.");
        
        //Creo 3 coches
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        //Les pongo la marca y el modelo
        coche1.setMarca("Ford");
        coche1.setModelo("Focus");
        
        coche2.setMarca("Hyundai");
        coche2.setModelo("Kona");

        coche3.setMarca("Fiat");
        coche3.setModelo("Punto");      
        
        //Le asigno las ruedas
        coche1.setRuedas(rueda1);
        coche2.setRuedas(rueda1);
        coche3.setRuedas(rueda2);
        
        //Muestro los datos de los coches
        System.out.println("");
        System.out.println("COCHES:");
        System.out.println("Coche 1: " + coche1.getMarca() + " " +coche1.getModelo()
                + " | Ruedas de " + coche1.getRuedas().getPulgadas() + " pulgadas.");
        
        System.out.println("Coche 2: " + coche2.getMarca() + " " +coche2.getModelo()
                + " | Ruedas de " + coche2.getRuedas().getPulgadas() + " pulgadas.");
        
        System.out.println("Coche 3: " + coche3.getMarca() + " " +coche3.getModelo()
                + " | Ruedas de " + coche3.getRuedas().getPulgadas() + " pulgadas.");
    }
    
}
