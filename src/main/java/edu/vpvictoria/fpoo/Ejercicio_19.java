package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_19 {
    public Ejercicio_19(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_19 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calcular el tiempo de un recorrido: ");
        System.out.println("La velocidad es igual a: " + Tiempo());
    }
    public String Tiempo(){
        String distancia = null;
        String velocidad = null;
        try {
            System.out.print("Ingrese la distanica recorrida: ");
            distancia = App.input.readLine();
            System.out.print("Ingresa la velocidad en km que se recorre: ");
            velocidad = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(App.math.div(distancia,velocidad));
    }
}
