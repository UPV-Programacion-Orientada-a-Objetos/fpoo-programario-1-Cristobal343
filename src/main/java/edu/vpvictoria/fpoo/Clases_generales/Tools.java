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

    public String round(String a){   // Este metodo lo cree para que pueda redondear flotantes o doubles a dos cifras despues del punto
        DecimalFormat float_roudn = new DecimalFormat("0.00");
        return float_roudn.format(toDouble(a));
    }

    public int round_upper(float a){
        return (int) Math.ceil(a);
    }

    public String iva(String a){
        String iva = null; // Iva
        if(Integer.parseInt(a) >= 100){
            iva = a.substring(0) + "." + a.substring(1,2); // concateno el primer elemento agreando un .
        }else { iva = "0." + a;}                                // para representar el porcenteje en punto decimal
        return iva;
    }

}
