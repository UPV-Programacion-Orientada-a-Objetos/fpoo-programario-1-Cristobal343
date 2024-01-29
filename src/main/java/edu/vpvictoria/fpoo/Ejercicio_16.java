package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_16 {
    public Ejercicio_16(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_16 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "LA BROCHA GRUESA");
        System.out.println("El precio total de la mano es obra es: " + Presupuesto());
    }

    public double Presupuesto() { // Este metodo se va encargar de generarar el presupuesto total

        double metro_cub = 0d; // metros cubicos que se van a pintar
        double precio_por_mc = 0d; // preacio por metros cubicos
        double precio_total = 0d;

        try {
            System.out.print("Ingrese la Cantidad de metros cuandros que desea pintar: "); // aqui voy a llenar
            metro_cub = Double.parseDouble(App.input.readLine());           // los campos de precio por metro cunico
            System.out.println("Ingrese el precio por metro cuatrado");
            precio_por_mc = Double.parseDouble(App.input.readLine());
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
        precio_total = Double.parseDouble(                  // Esta parte "un poco incompresible" basicamente
                App.tools.round(                            // convirto lo valores de double a flotante, despues
                        String.valueOf(App.math.multiplication(     // los multiplico el resultado lo paso a String para
                                        App.tools.toFloat(metro_cub), App.tools.toFloat(metro_cub) // redondearlo y finalmeten
                                )                                                                   // a double
                        )
                )
        );
        return precio_total;
    }
}
