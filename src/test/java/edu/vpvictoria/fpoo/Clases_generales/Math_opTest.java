package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class Math_opTest extends TestCase {

    public void testRound() {
        Math_op op = new Math_op();
        assertEquals(9.99f, op.round(9.999f));
    }
}