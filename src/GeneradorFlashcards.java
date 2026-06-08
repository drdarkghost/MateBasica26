import java.util.ArrayList;
import java.util.Random;

public class GeneradorFlashcards {

    private Random random = new Random();

    public Flashcard generarBasica() {

        int factor = random.nextInt(9) + 2;
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;

        String ejercicio =
                factor + "x + " + factor * b;

        String respuesta =
                factor + "(x + " + b + ")";

        String explicacion =
                "Se extrae el factor común " + factor;

        return new Flashcard(
                ejercicio,
                respuesta,
                explicacion,
                "Básico"
        );
    }
}