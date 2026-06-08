import generadores.GeneradorFactorComun;
import modelo.Flashcard;

public class Main {

    public static void main(String[] args) {

        GeneradorFactorComun generador =
                new GeneradorFactorComun();

        Flashcard tarjeta =
                generador.generarFlashcard();

        System.out.println("=== FLASHCARD ===");
        System.out.println("Tema: " + tarjeta.getTema());
        System.out.println("Nivel: " + tarjeta.getNivel());
        System.out.println("Ejercicio: " + tarjeta.getEjercicio());
        System.out.println("Respuesta: " + tarjeta.getRespuesta());
        System.out.println("Explicación: " + tarjeta.getExplicacion());

    }
    //falta opciones y mas generadores
}