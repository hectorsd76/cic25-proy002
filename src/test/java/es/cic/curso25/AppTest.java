package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */


    @Test
    public void testSumar(){
        App calculadora = new App();

        int resultado = calculadora.sumar(4,3);

        assertEquals(7, resultado);
    }

    @Test
    public void testRestar(){
        App calculadora = new App();

        int resultado = calculadora.restar(4,3);

        assertEquals(1, resultado);
    }

    @Test
    public void testMultiplicar(){
        App calculadora = new App();

        int resultado = calculadora.multiplicar(4,3);

        assertEquals(12, resultado);
    }

    @Test
    public void testDividir(){
        App calculadora = new App();

        int resultado = calculadora.dividir(4,4);

        assertEquals(1, resultado);
    }


}
