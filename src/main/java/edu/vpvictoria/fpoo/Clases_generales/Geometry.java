package edu.vpvictoria.fpoo.Clases_generales;

public class Geometry {

    private validador valid = new validador(); // Clase validador
    private String auxiliar = null; // auxiliard

    // terorema de pitagoras
    private Math_op math = new Math_op();
    public float pitagoreas_teorem(int a, int b){
        int c = 0;
        c = this.math.sqrt(math.resta(math.pow(a), math.pow(b)));
        return c;
    }
    public float pitagoreas_teorem(float a, float b){
        float c = 0f;
        c = this.math.sqrt(math.resta(math.pow(a), math.pow(b)));
        return c;
    }
    public float pitagoreas_teorem(int a, float b){
        float c = 0f;
        c = this.math.sqrt(math.resta(math.pow(a), math.pow(b)));
        return c;
    }
    public float pitagoreas_teorem(float a, int b){
        float c = 0f;
        c = this.math.sqrt(math.resta(math.pow(a), math.pow(b)));
        return c;
    }

    public String pitagoreas_teorem(String a, String b){

            if (valid.verificar(a) == "isanumber" && valid.verificar(b) == "isanumber") {
                if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                    this.auxiliar = Float.toString(pitagoreas_teorem(Integer.parseInt(a), Integer.parseInt(b)));
                } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                    this.auxiliar = Float.toString(pitagoreas_teorem(Float.parseFloat(a), Float.parseFloat(b)));
                } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                    this.auxiliar = Float.toString(pitagoreas_teorem(Integer.parseInt(a), Float.parseFloat(b)));
                } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                    this.auxiliar = Float.toString(pitagoreas_teorem(Float.parseFloat(a), Integer.parseInt(b)));
                }
            } else {
                System.out.println("la operacion no se puede realizar con los dato proporcionados!!!");
            }
            return auxiliar;
    }

    // Metodos para calucular el area del triangulo
    public float area_del_triangulo(int a, int b){return (float) (a * b) / 2;}
    public float area_del_triangulo(float a, float b){return (float) (a * b) / 2;}
    public float area_del_triangulo(int a, float b){ return (float) (a * b) / 2;}
    public float area_del_triangulo(float a, int b){ return (float) (a * b) / 2;}

    public String area_del_triangulo(String a, String b){

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {
            if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                this.auxiliar = Float.toString(area_del_triangulo(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                this.auxiliar = Float.toString(area_del_triangulo(Float.parseFloat(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                this.auxiliar = Float.toString(area_del_triangulo(Integer.parseInt(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                this.auxiliar = Float.toString(area_del_triangulo(Float.parseFloat(a), Integer.parseInt(b)));
            }
        } else {
            System.out.println("la operacion no se puede realizar con los dato proporcionados!!!");
        }
        return auxiliar;
    }

    // Metodos para calucular el area del rectangulo
    public int area_del_rectangulo(int a, int b){return a * b;}
    public float area_del_rectangulo(float a, float b){return a * b;}
    public float area_del_rectangulo(int a, float b){ return a * b;}
    public float area_del_rectangulo(float a, int b){ return a * b;}

    public String area_del_rectangulo(String a, String b){

        if (valid.isanumber(a) == "isanumber" && valid.isanumber(b) == "isanumber") {
            if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isainteger") {
                this.auxiliar = Integer.toString(area_del_rectangulo(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isafloat") {
                this.auxiliar = Float.toString(area_del_rectangulo(Float.parseFloat(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isainteger" && valid.verificar(b) == "isafloat") {
                this.auxiliar = Float.toString(area_del_rectangulo(Integer.parseInt(a), Float.parseFloat(b)));
            } else if (valid.verificar(a) == "isafloat" && valid.verificar(b) == "isainterger") {
                this.auxiliar = Float.toString(area_del_rectangulo(Float.parseFloat(a), Integer.parseInt(b)));
            }
        } else {
            System.out.println("la operacion no se puede realizar con los dato proporcionados!!!");
        }
        return auxiliar;
    }

    public float area_del_circulo(int a){
        return 3.1416f * math.pow(a);
    }
    public float area_del_circulo(float a){
        return 3.1416f * math.pow(a);
    }

    public String area_del_circulo(String a){
        if (valid.isanumber(a) == "isanumber"){
            if (valid.verificar(a) == "isainteger"){
                this.auxiliar = Float.toString(area_del_circulo(Integer.parseInt(a)));
            }
            else { this.auxiliar = Float.toString(area_del_circulo(Float.parseFloat(a)));}
        }
        else {
            System.out.println("No se puede realizar la operacion!!!");
        }
        return auxiliar;
    }

}
