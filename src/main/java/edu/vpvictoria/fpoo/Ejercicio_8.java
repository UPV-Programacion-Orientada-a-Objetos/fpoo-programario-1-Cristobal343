package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_8 {
    private String x1, x2 = null; // Estas son las cordenasdas del plano cartesiano
    private String y1, y2 = null;

    public Ejercicio_8(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_9 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calular la distancia entre dos puntos");
        System.out.print("La distancia entre dos punots es: " + Distancia_entre_dos_puntos());
    }
    public String Distancia_entre_dos_puntos(){
        try {
            System.out.println("Ingrese las cordenadas de el punto 1: ");
            System.out.print("X1: ");
            this.x1 = App.input.readLine();
            System.out.print("Y1: ");
            this.y1 = App.input.readLine();
            System.out.println("\nIngrese las cordenadas de el punto 2: ");
            System.out.print("X2: ");
            this.x2 = App.input.readLine();
            System.out.print("Y2: ");
            this.y2 = App.input.readLine();
            System.out.println();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        String distancia = App.math.sqrt(
                App.math.sumar(
                        App.math.pow(
                                App.math.resta(this.x1,this.x2)
                        )
                        ,App.math.pow(
                                App.math.resta(this.y1,this.y2)
                        )
                )
        );
        return distancia;
    }

}
