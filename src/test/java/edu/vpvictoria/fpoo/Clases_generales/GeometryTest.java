package edu.vpvictoria.fpoo.Clases_generales;

import junit.framework.TestCase;

public class GeometryTest extends TestCase {

    public void testPitagoreas_teorem() {
        assertEquals("6.61", new Geometry().area_del_rectangulo("2.22","2.5"));
    }

    public void testArea_del_triangulo() {
    }

    public void testArea_del_rectangulo() {
    }
}