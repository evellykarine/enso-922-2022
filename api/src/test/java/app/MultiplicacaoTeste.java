package app;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class  MultiplicacaoTeste {


 
    
    Multiplicacao multiplicacao;

    @BeforeEach
    public void beforeEach() {
        multiplicacao = new Multiplicacao();
    }

    @Test
    public void testBasico() {
        double resultado = multiplicacao.calculaMultiplicacao(5, 5);
        assertEquals(25, resultado);
    }

    @Test
    public void testMultiplicacaoPorZero() {
        double resultado = multiplicacao.calculaMultiplicacao(100, 0);
        assertEquals(0, resultado);
    }

    @Test
    public void testMultiplicacaoBigNumber() {
        double resultado = multiplicacao.calculaMultiplicacao(250000,2);
        assertEquals(500000, resultado);
    }
}
    

