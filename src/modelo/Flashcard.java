package modelo;

public class Flashcard {

    private String ejercicio;
    private String respuesta;
    private String explicacion;
    private String tema;
    private String nivel;

    public Flashcard(
            String ejercicio,
            String respuesta,
            String explicacion,
            String tema,
            String nivel) {

        this.ejercicio = ejercicio;
        this.respuesta = respuesta;
        this.explicacion = explicacion;
        this.tema = tema;
        this.nivel = nivel;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public String getTema() {
        return tema;
    }

    public String getNivel() {
        return nivel;
    }
}