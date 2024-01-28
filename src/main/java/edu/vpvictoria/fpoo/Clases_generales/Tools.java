package edu.vpvictoria.fpoo.Clases_generales;
import java.text.DateFormat;
import java.text.DecimalFormat;

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

    public float toFloat(int a){
        float b = (float) a;
        return b;
    }
    public float toFloat(double a){
        float b = (float) a;
        return b;
    }
    public double toDouble(String a){
        return Double.parseDouble(a);
    }

    public double round(float a){   // Este metodo lo cree para que pueda redondear flotantes o doubles a dos cifras despues del punto
        DecimalFormat float_roudn = new DecimalFormat("0.00");
        float d = 
        return d;
    }

}
