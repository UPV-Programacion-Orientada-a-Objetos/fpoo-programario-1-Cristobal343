package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_22 {
    public Ejercicio_22(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_20 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "COMPAÑIAS DE LUZ Y SOMBRAS factura de electrizidad");
        System.out.println("La Facturacion de la persona es de " + Calcular_kw());
    }
    public String Calcular_kw(){
        String consumo = null;
        String ddc = null; // tiempo de consumo
        try{
            System.out.print("Ingrese el consumo en kw de la persona por dia: ");
            consumo = App.input.readLine();
            System.out.print("Ingrese los dias de consumo: ");
            ddc = null;
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(App.math.multiplication(consumo,ddc));
    }
}
