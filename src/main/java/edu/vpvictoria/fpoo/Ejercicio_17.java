package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_17 {

    private String a = null;
    private String b = null;

    public Ejercicio_17(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_17 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Teorema de pitagoras");
        System.out.println("El valor del lado C es: " + Obtener_valores());
    }

    public String Obtener_valores(){
        try {
            System.out.println("Ingresa el valor de lado a");
            this.a = App.input.readLine();
            System.out.println("Ingresa el valor del lado b");
            this.b = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(
                App.geo.pitagoras_teorem_f1(this.a,this.b));
    }


}
