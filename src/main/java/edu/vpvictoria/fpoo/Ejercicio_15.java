package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_15 {
    public Ejercicio_15(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_15 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calcular tarifa de estacionamiento");
        Calcular_tarifa();
    }
    public void Calcular_tarifa(){
        float tarifa = 0;
        float horas = 0f;
        try {
            System.out.print("Ingrese la tariafa por hora: ");
            tarifa = Float.parseFloat(App.input.readLine());
            System.out.print("Ingresa el tiempo transcurrido: ");
            horas = Float.parseFloat(App.input.readLine());
        } catch (IOException e){
            System.out.println("Error " + e);
        }

        System.out.println("La tarrifa total sera: " + App.math.multiplication(
                tarifa, (int) Math.ceil(horas))); // aqui lo unico nuevo
                                    // que utilizo e math ceils que
                                    // es lo que me perimite redondea
                                    // hacia arriba es por ejemplo si tengo 2.6
                                    // Redondearia a 3
    }
}
