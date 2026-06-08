package generadores;

import modelo.Flashcard;
import java.util.Random;

public class GeneradorFactorComun {

    private Random random;

    public GeneradorFactorComun() {
        random = new Random();
    }

    public Flashcard generarFlashcard() {

        int factor = random.nextInt(8) + 2;
        int numero = random.nextInt(9) + 1;

        String ejercicio =
                factor + "x + " + (factor * numero);

        String respuesta =
                factor + "(x + " + numero + ")";

        String explicacion =
                "Se extrae el factor común " + factor + ".";

        return new Flashcard(
                ejercicio,
                respuesta,
                explicacion,
                "Factor común",
                "Básico"
        );
    }
}