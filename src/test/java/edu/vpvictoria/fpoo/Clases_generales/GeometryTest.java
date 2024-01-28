package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class GeometryTest extends TestCase {

    public void testPitagoreas_teorem() {
        assertEquals("5.55", new Geometry().area_del_rectangulo("2.22","2.5"));
        assertEquals("12.56", new Geometry().area_del_circulo("2"));
    }

    public void testArea_del_triangulo() {
    }

    public void testArea_del_rectangulo() {
    }
}