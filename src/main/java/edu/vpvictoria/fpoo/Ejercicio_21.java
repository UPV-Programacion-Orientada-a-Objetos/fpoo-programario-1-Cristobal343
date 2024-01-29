package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_21 {
    public Ejercicio_21(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_21 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calcular precio de agua por metro cubico ");
        System.out.print("El precio total es: " + Calcular_precio_pormetrocub());
    }
    public String Calcular_precio_pormetrocub(){
        String metro_cub = null; // metros cubicos de agua
        String Pmc =  null; // precio por metro cubico
        try {
            System.out.print("Ingresa la cantidad de metro cubicos: ");
            metro_cub = App.input.readLine();
            System.out.print("Ingresa el precio por metro cuadrado: ");
            Pmc = App.input.readLine();
        }catch (IOException e){
            System.out.print("Error " + e);
        }
        return App.tools.round(App.math.multiplication(Pmc,metro_cub));
    }
}
