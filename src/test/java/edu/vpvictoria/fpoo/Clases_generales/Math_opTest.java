package edu.vpvictoria.fpoo.Clases_generales;

import edu.vpvictoria.fpoo.App;
import junit.framework.TestCase;

public class Math_opTest extends TestCase {

    public void testRound() {
        Math_op op = new Math_op();
        assertEquals(4, op.multiplication(2,2));
        assertEquals("0.5", op.multiplication("1", "0.5"));
        assertEquals(4, op.pow(2));
        assertEquals("4", op.pow("2"));
        assertEquals("2.5", op.div("5","2"));
        assertEquals("133.06", App.tools.round(op.multiplication(op.multiplication("8.88","9.99"),"1.5")));
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testSumar() {
    }

    public void testResta() {
    }

    public void testMultiplication() {
    }

    public void testDiv() {
    }

    public void testPow() {
    }

    public void testSqrt() {
    }
}