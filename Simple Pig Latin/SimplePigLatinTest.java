import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SimplePigLatinTest {

    @Test
    public void RetornarRespostaCorretaSemExclamacao() {

        SimplePigLatin x = new SimplePigLatin();

        assertEquals(x.ASimplePigLatin("Pig latin is cool"), "igPay atinlay siay oolcay");

    }

    @Test
    public void RetornarRespostaCorretaComExclamacao() {

        SimplePigLatin x = new SimplePigLatin();

        assertEquals(x.ASimplePigLatin("Pig latin is cool"), "igPay atinlay siay oolcay");

    }

}
