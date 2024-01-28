package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_7 {

    private String Litro_galon = "3.785";
    public Ejercicio_7() {
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) + " Ejercicio_7 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Este ejercicio consta de convertir litros de leche a galones");
        System.out.println("Equivalen a:" + Convertir_a_galones());
    }
    public String Convertir_a_galones(){
        String galones = null;
        System.out.print("Ingresa la cantidad de litros de leches que deseas convertir a galones: ");
        try {
            galones = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.math.multiplication(galones ,this.Litro_galon);
    }
}
