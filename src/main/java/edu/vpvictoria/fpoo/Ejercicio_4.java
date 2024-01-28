package edu.vpvictoria.fpoo;
import edu.vpvictoria.fpoo.Clases_generales.Math_op;

import java.io.*;
import java.io.BufferedReader;

public class Ejercicio_4 {
    private String radio = null; // radio de la ciricunferencia
    private static String pi = "3.1416"; // constante pi
    private String auxiliar = null; // variable auxiliar
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public Ejercicio_4(){
            System.out.println("-".repeat(21) + "\n" +
                    "-".repeat(4) +  " Ejercicio_4 " + "-".repeat(4) + "\n" +
                    "-".repeat(21) + "\n" + "Calular el area de un circulo");
            System.out.println("El area de el circulo es: " + Calculara_area());

    }

    public String Calculara_area(){
        this.auxiliar = null;
        try {
            System.out.print("Ingrese el radio de la circunferencia: ");
            this.radio = input.readLine();
        } catch (IOException e){
            System.out.println("Error " + e);
        }
        auxiliar = new Math_op().multiplication(this.pi, new Math_op().pow(this.radio));
        return auxiliar;
    }


}
