package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_18 {
    public Ejercicio_18(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_18 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "LA CURVA LOCA estacion de autobus: ");
        System.out.println("El costo final del viaje es: " + Consto_d_viaje());
    }
    public String Consto_d_viaje(){
        String costo = null;
        String km = null;
        try {
            System.out.print("Ingrese el consto del el viaje por km: ");
            costo = App.input.readLine();
            System.out.print("Ingrese los km que se debe de recorer: ");
            km = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(App.math.multiplication(costo,km));
    }
}
