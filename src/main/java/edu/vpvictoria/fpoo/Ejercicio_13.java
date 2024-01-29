package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_13 {

    public Ejercicio_13(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_13 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Convertir pesos mexicanos a dollares");
        conversion(); // solo llamo al metodo vacio para que imprima el resultado
    }

    public void conversion(){
        float pesos = 0f; // ahora utlizo variables locales porque me di cuenta que como atributos no sirven si
        try {               // solo tengo un metodo por clase :c
            System.out.print("Ingrese la cantidad de pesos mexicanos que pose: ");
            pesos = Float.parseFloat(App.input.readLine());
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        System.out.println("La conversion de pesos a dolares son: " + App.tools.round(Float.toString(App.math.multiplication(pesos,0.058f))) + " dolares");
    }

}
