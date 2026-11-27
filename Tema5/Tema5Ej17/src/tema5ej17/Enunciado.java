/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5ej17;

/**
 *
 * @author Alberto Navarro Perez
 */
public class Enunciado {

    //Atributos
    private String pregunta;
    private String respuesta;

    //Constructores
    //Constructor por defecto
    public Enunciado() {
        this.pregunta = "";
        this.respuesta = "";
    }

    //Constructor parametrizado, reciube la pregunta y su respuesta correcta
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    // Getters y Setters
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    //Otros metodos
    //Comprueba si la respuesta del usuario coincide con la correcta
    public boolean comprobarRespuesta(String respuestaUsuario) {
        return this.respuesta.equalsIgnoreCase(respuestaUsuario.trim());
    }
    
    //Mostrar enunciado
    public void mostrarEnunciado() {
        System.out.println("Pregunta:" + pregunta);
        System.out.println("Respuesta correcta: " + respuesta);
    }
    
    @Override
    public String toString() {
        return "Enunciado [Pregunta=" + pregunta + ", Respuesta=" + respuesta + "]";
    }
}
