package edu.vpvictoria.fpoo.Clases_generales;
import java.lang.Math;
import javax.xml.validation.Validator;

public class Math_op {
    private validador valid = new validador();
    private String auxiliar = null;

    // Metodos de multipliacion entre enteros y flotantes
    public int sumar(int a, int b){ // suma de dos enteros
        return a + b;
    }
    public float sumar(float a , float b){ return a + b;}
    public float sumar(int a, float b){ // suma de un entero y un flotante
        return  a + b;
    }
    public float sumar(float a, int b){ return a + b; }

    public String sumar(String a, String b) {
        auxiliar = null;

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {

            if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                auxiliar = Integer.toString(sumar(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(sumar(Float.parseFloat(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(sumar(Integer.parseInt(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                auxiliar = Float.toString(sumar(Float.parseFloat(a), Integer.parseInt(b)));
            }

        } else {
            System.out.printf("Los campos necesitados no son numeros");
        }
        return auxiliar;
    }

    // Metodos de resta entere enteros y flotantes
    public int resta(int a, int b){
        return a - b;
    }
    public float resta(float a , float b){ return a - b;}
    public float resta(int a, float b){ // suma de un entero y un flotante
        return  a - b;
    }
    public float resta(float a, int b){ return a - b; }

    public String resta(String a, String b) {
        auxiliar = null;

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {

            if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                auxiliar = Integer.toString(resta(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(resta(Float.parseFloat(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                auxiliar = Float.toString(resta(Integer.parseInt(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                auxiliar = Float.toString(resta(Float.parseFloat(a), Integer.parseInt(b)));
            }

        } else {
            System.out.printf("Los campos necesitados no son numeros");
        }
        return auxiliar;
    }


    // Metodos de multipliacion por entero y flotante
    public int multiplication(int a, int b){return a*b;}

    public float multiplication(float a, float b){return a*b;}

    public float multipication(float a, float b){return a*b;}

    public float multiplication(int a, float b){ return a*b;}

    public float multiplication(float a, int b){return a * b;}

    public String multiplication(String a, String b) {
        auxiliar = null;
        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {
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

    // Potenciacion
    public int pow(int a){return (int) Math.pow(a,2);}

    public float pow(float a){return (float) Math.pow(a, 2);}

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
    // Raiz
    public int sqrt(int a){ return (int) Math.sqrt(new Tools().toDouble(a));}

    public float sqrt(float a){return (float) Math.sqrt(new Tools().toDouble(a));}

    public String sqrt(String a){
        auxiliar = null;
        if(new validador().verificar(a) == "isainteger"){
            auxiliar = Integer.toString(sqrt(Integer.parseInt(a)));
        }
        else if (new validador().verificar(a) == "isafloat"){
            auxiliar = Float.toString(sqrt(Float.parseFloat(a)));
        }
        return auxiliar;
    }

}
