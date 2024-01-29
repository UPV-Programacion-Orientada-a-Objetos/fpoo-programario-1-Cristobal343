package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_20 {
    public Ejercicio_20(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_20 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calcular el tiempo de una llamada telefonica: ");
        System.out.println("La tarifa total es de: " + Tiempo_llamada());
    }
    public String Tiempo_llamada(){
        String tiempo = null;
        String costo = null;
        try {
            System.out.print("Ingrese el tiempo de llamda en minutos: ");
            tiempo = App.input.readLine();
            System.out.print("Ingrese el costo de la llamda por minuto: ");
            costo = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(
                App.math.multiplication(tiempo,costo)
        );
    }

}
