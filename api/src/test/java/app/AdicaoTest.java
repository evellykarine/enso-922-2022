package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdicaoTest {
    
    Adicao adicao;

    @BeforeEach
    public void beforeEach() {
        adicao = new Adicao();
    }


    @Test
    public void testCasoBase() {
        double resultado = adicao.calculaAdicao(2,7);
        assertEquals(9, resultado);
    }

    @Test
    public void testAdicaodeNegativos() {
        double resultado = adicao.calculaAdicao(-7,-2);
        assertEquals(-9, resultado);
    }

    @Test
    public void testAdicaodeNegativoePosi() {
        double resultado = adicao.calculaAdicao(-7,2);
        assertEquals(-5, resultado);
    }
        @Test
    public void testAdicaodeDecimais() {
        double resultado = adicao.calculaAdicao(7.2,2.3);
        assertEquals(9.5, resultado);
    }
}