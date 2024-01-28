package edu.vpvictoria.fpoo.Clases_generales;
import java.lang.Math;
import javax.xml.validation.Validator;

public class Math_op {

    private validador valid = new validador();
    private String auxiliar = null;
    // Metodos de sumas por entero y flotante
    public int multiplication(int a, int b){return a*b;}

    public float multiplication(float a, float b){return a*b;}

    public float multipication(float a, float b){return a*b;}

    public float multiplication(int a, float b){ return a*b;}

    public float multiplication(float a, int b){return a * b;}

    public String multiplication(String a, String b) {

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {
            auxiliar = null;
            if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                auxiliar = Integer.toString(multiplication(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(multiplication(Float.parseFloat(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(multiplication(Integer.parseInt(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                auxiliar = Float.toString(multiplication(Float.parseFloat(a), Integer.parseInt(b)));
            }
        }
        return auxiliar;
    }

    //potenciacion

    public int pow(int a){
        return (int) Math.pow(a,2);
    }

    public float pow(float a){
        return (float) Math.pow(a, 2);
    }

    public String pow(String a){
        auxiliar = null;
        if(new validador().verificar(a) == "isainteger"){
            auxiliar = Integer.toString(pow(Integer.parseInt(a)));
        }
        else if (new validador().verificar(a) == "isafloat"){
            auxiliar = Float.toString(pow(Float.parseFloat(a)));
        }
        return auxiliar;
    }

    public double round(float a){
        return (double) Math.round(a * 100.0)/100.0;
    }

}
