public class Flashcard {

    private String ejercicio;
    private String respuesta;
    private String explicacion;
    private String nivel;

    public Flashcard(String ejercicio, String respuesta,
                     String explicacion, String nivel) {

        this.ejercicio = ejercicio;
        this.respuesta = respuesta;
        this.explicacion = explicacion;
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

    public String getNivel() {
        return nivel;
    }
}