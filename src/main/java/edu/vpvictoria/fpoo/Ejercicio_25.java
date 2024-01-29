package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_25 {

    private String num_empleados = null;
    private String dias_de_alojamiento = null;
    private String costo_de_alojemienot = null;
    private String costo_comida = null;
    public Ejercicio_25(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_20 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Costo de alojamiento de empleados en un viaje ");
        System.out.println("El costo total por " +  this.num_empleados + " por " + this.dias_de_alojamiento
                            + " dias son : " + Costo_alojamiento());
    }
    public String Costo_alojamiento(){

        try {
            System.out.print("Ingresa el numero de empleados que iran al viaje: ");
            this.num_empleados = App.input.readLine();
            System.out.print("Ingrese los dias que se alojaran en el hotel: ");
            this.dias_de_alojamiento = App.input.readLine();
            System.out.print("Ingrese el costo del alojamiento por dias: ");
            this.costo_de_alojemienot = App.input.readLine();
            System.out.print("Ingrese el costo de la comida: ");
            this.costo_comida = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }

        return App.tools.round(
                App.math.multiplication(
                        num_empleados,
                        App.math.sumar(
                                    App.math.sumar(
                                            App.math.multiplication(
                                                    this.dias_de_alojamiento,
                                                    this.costo_de_alojemienot
                                            ),
                                            App.math.multiplication(
                                                    this.costo_comida,
                                                    this.dias_de_alojamiento
                                            )
                                    ), App.math.multiplication(
                                            this.dias_de_alojamiento,
                                            "100"
                                    )
                        )
                )
        );
    }
}
