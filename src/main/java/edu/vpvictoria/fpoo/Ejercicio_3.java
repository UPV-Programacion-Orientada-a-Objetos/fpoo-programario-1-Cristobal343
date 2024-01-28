package edu.vpvictoria.fpoo;

import edu.vpvictoria.fpoo.Clases_generales.Math_op;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_3 {
    public String base = null; // base inicializada en cero decimal
    public String altura = null; // altura inicilizada en cero decimal

    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public Ejercicio_3(){
        System.out.println("-".repeat(21) + "\n" +
                            "-".repeat(4) +  " Ejercicio_3 " + "-".repeat(4) + "\n" +
                            "-".repeat(21) + "\n" + "Calular el area de un rectangulo");
        System.out.print("El area del rectangulo es: " + calcular_area());
    }
    public String calcular_area(){
        try {
            System.out.print("Ingresa el largo de base: ");
            this.base = input.readLine();
            System.out.print("Ingresa la altura: ");
            this.altura = input.readLine();
        }catch (IOException e){
            System.out.printf("Error: " + e);
        }
        return new Math_op().multiplication(base, altura);
    }


}
