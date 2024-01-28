package edu.vpvictoria.fpoo;

import edu.vpvictoria.fpoo.Clases_generales.Geometry;

import java.io.IOException;

public class Ejercicio_6 {
    private String cat_ady = null; // cateto adyacente del triangulo

    private String hip = null; //hipotenusas del triangulo

    private String radio = null; // radio del semicirculo

    public Ejercicio_6(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_6 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calular el area de una figuara irregular");
                System.out.print("El el area de la figuara es: " + Calcular_el_area());
    }

    public String Calcular_el_area(){
        try{
            System.out.print("Ingrese el valor de los catetos opuestos: ");
            this.cat_ady = App.input.readLine();
            System.out.print("Ingrese el valor de las hipotenusas: ");
            this.hip = App.input.readLine();
            System.out.print("Ingeser el radio del semi circulo: ");
            this.radio = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error" + e);
        }
        String resultado = App.tools.round(
                                App.math.sumar(
                                        App.math.multiplication(
                                                App.geo.area_del_triangulo(this.cat_ady,this.hip),
                                                "2"
                                        )
                                        ,App.math.div(
                                                App.geo.area_del_circulo(this.radio),
                                                "2"
                                        )
                                )
        );
        return resultado;
    }

}
