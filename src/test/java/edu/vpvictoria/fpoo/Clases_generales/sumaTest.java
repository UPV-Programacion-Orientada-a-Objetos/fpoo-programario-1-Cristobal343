package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class sumaTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }
    public void testSumar() {

        suma sum = new suma();

        assertEquals(4, sum.sumar(2,2));
        assertEquals(4.5f, sum.sumar(4.4f, 0.1f));
        assertEquals(-8, sum.sumar(-9, 1));
        assertEquals(6.7f, sum.sumar(2.7f, 4));
        assertEquals(8.8f, sum.sumar(6.8f, 2));
        assertEquals("8", sum.sumar("8.8","-0.8"));

    }

}