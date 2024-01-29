package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_26 {
    private String num_empleados = null;
    private String dias_de_alojamiento = null;
    private String costo_de_alojemienot = null;
    private String costo_comida = null;
    public Ejercicio_26(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_20 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Costo de alojamiento de empleados en un viaje ");
    }
    public void Costo_alojamiento(){

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
        System.out.print("Cumero de empleados que dentro del viaje ...." + this.num_empleados);
        System.out.print("Dias que se alojaran en el hotel ...." + this.dias_de_alojamiento);
        System.out.print("Costo de hospedaje por empleado ...." + this.costo_de_alojemienot
                            + "x" + this.num_empleados + "...." + App.math.multiplication(this.num_empleados,this.costo_de_alojemienot));
        System.out.print("Costo por comida de empleado ...." + this.costo_comida + "x" + this.num_empleados + "...." +
                            App.math.multiplication(this.costo_comida,this.num_empleados));
        System.out.print("Costo por gasto de empleado ....100x" + this.num_empleados + "...." +
                App.math.multiplication(this.costo_comida,this.num_empleados));
        System.out.println("Costo toltal: " + App.tools.round(
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
            )
        );
    }
}
