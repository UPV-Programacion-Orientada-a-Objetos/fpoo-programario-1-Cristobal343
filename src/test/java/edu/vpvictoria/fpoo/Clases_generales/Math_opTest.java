package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class Math_opTest extends TestCase {

    public void testRound() {
        Math_op op = new Math_op();
        assertEquals(4, op.multiplication(2,2));
        assertEquals("0.5", op.multiplication("1", "0.5"));
        assertEquals(4, op.pow(2));
        assertEquals("4", op.pow("2"));
    }

    public void setUp() throws Exception {
        super.setUp();
    }
}