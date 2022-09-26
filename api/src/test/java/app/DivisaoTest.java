package app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DivisaoTest {

  Divisao divisao;

  @BeforeEach
  public void inicio() {
    divisao = new Divisao();
  }

  @Test
  public void divisaoPorZero() {
     assertEquals(Double.NaN , divisao.calculaDivisao(0, 0));
  }

  @Test
  public void maiorQueCinco() {
    Double resultado = divisao.calculaDivisao(2, 10);
    assertFalse(resultado > 5);
  }

  @Test
  public void menorQueDez() {
    Double resultado = divisao.calculaDivisao(50, 20);
    assertTrue(resultado < 10);
  }

}
