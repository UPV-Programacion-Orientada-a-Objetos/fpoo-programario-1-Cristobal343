package edu.vpvictoria.fpoo;

import edu.vpvictoria.fpoo.Clases_generales.Geometry;
import edu.vpvictoria.fpoo.Clases_generales.Math_op;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.reflect.Member;

public class Ejercicio_5 {
    private String lado_a = null; // lado a de la figura

    private String lado_b = null; //lado b de la figura

    private String lado_c = null; //lado c de la figura

    private Geometry geo = new Geometry();
    private Math_op math = new Math_op();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public Ejercicio_5(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_5 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calular el area de un terreno");
        System.out.print("El area total del terreno es: " + Calcular_area());
    }

    public String Calcular_area(){
        try {
            System.out.print("Ingrese el lado a del terreno: ");
            this.lado_a = input.readLine();
            System.out.print("Ingrese el lado b del terreno: ");
            this.lado_b = input.readLine();
            System.out.print("Ingrese el lado c del terreno: ");
            this.lado_c = input.readLine();
        } catch (IOException e){
            System.out.println("Error " + e);
        }
        String resultado = math.sumar(
                                        geo.area_del_rectangulo(
                                                this.lado_c,this.lado_b
                                        )
                                        ,geo.area_del_triangulo(
                                                math.resta(
                                                        this.lado_a,
                                                        this.lado_b
                                                )
                                                ,this.lado_b
                )
        );
        return resultado;

    }
}
