package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class ToolsTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testToDouble() {
        Tools tools = new Tools();
        assertEquals("2.22",tools.round("2.22222"));
        assertEquals(3, tools.round_upper(2.33f));
        assertEquals("0.15", tools.iva("15"));
    }
}