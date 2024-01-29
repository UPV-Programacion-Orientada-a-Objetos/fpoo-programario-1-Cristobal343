package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_24 {
    public Ejercicio_24(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_24 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Ahorro Personal ");
        System.out.println("El ahorro personal a final de año deberia de ser: " + Ahorro());
    }
    public String Ahorro(){
        String sueldo = null;
        try {
            System.out.println("Ingrse el suedo que se gana: ");
            sueldo = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error" + e);
        }
        return App.tools.round(
                App.math.multiplication(
                        App.math.multiplication(sueldo,"0.15")
                        ,"48"
                )
        );
    }
}
