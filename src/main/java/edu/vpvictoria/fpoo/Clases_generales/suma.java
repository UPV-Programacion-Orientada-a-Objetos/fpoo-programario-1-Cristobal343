package edu.vpvictoria.fpoo.Clases_generales;
import java.math.MathContext;
import javax.xml.validation.Validator;

public class suma {

    private validador valid = new validador();

    private String auxiliar = null;
    public int sumar(int a, int b){ // suma de dos enteros
        return a + b;
    }
    public float sumar(float a , float b){ return a + b;}
    public float sumar(int a, float b){ // suma de un entero y un flotante
        return  a + b;
    }
    public float sumar(float a, int b){ return a + b; }

    public String sumar(String a, String b) {

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {

                if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                    auxiliar = Integer.toString(sumar(Integer.parseInt(a), Integer.parseInt(b)));
                } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                    auxiliar = Float.toString(sumar(Float.parseFloat(a), Float.parseFloat(b)));
                } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                    auxiliar = Float.toString(sumar(Integer.parseInt(a), Float.parseFloat(b)));
                } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainteger") {
                    auxiliar = Float.toString(sumar(Float.parseFloat(a), Integer.parseInt(b)));
                }
            } else {
                System.out.printf("Los campos necesitados no son numeros");
            }
            return auxiliar;
    }

}
