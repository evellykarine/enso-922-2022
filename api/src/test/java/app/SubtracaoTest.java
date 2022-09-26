package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubtracaoTest {
    
    Subtracao subtracao;

    @BeforeEach
    public void beforeEach() {
       subtracao  = new Subtracao();
    }


    @Test
    public void testCasoBase() {
        double resultado = subtracao.calculaSubtracao(20, 20);
        assertEquals(0, resultado);
    }

    @Test
    public void testSubtracaoDeZero() {
        double resultado = subtracao.calculaSubtracao(15, 10);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtracaoNumeroGrande() {
        double resultado = subtracao.calculaSubtracao(250, 150);
        assertEquals(100, resultado);
    }

   

}
