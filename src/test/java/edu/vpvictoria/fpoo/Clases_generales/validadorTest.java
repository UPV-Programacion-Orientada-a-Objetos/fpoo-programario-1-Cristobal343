package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class validadorTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testVerificar() {
        validador val = new validador();
        assertEquals("isanumber", val.isanumber("8.999999999"));
        assertEquals("isanumber", val.isanumber("10"));
        assertEquals("isn'tanumber", val.isanumber("efe"));
    }
}