package edu.vpvictoria.fpoo.Clases_generales;

public class Tools {

    // cree esta clase solo para poder convertir valore que yo necesite
    public double toDouble(int a){
        double b = a;
        return b;
    }
    public double toDouble(float a){
        double b = a;
        return b;
    }
    public double toDouble(String a){
        return Double.parseDouble(a);
    }

}
