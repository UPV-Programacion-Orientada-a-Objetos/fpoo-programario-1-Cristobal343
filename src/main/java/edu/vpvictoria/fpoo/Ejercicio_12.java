package edu.vpvictoria.fpoo;


import java.io.IOException;

public class Ejercicio_12 {

    private float base = 0f; // valor de la base
    private float altura = 0f; // valor de la altura
    public Ejercicio_12(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_10 " + "-".repeat(4) + "\n" + // solo voy a llamar al metodo
                "-".repeat(21) + "\n" + "Calcular el area de un triangulo");   // de instancia que ya tengo en

        System.out.println("El area del triangulo es: " + area_del_triangulo());
    }                                                                                   // mi clase de gemotria

    public float area_del_triangulo(){
        try{
            System.out.println("Ingrese el valor de la base: ");
            this.base = Float.parseFloat(App.input.readLine());
            System.out.println("Ingrse el valor de la altura: "); // capturo los valores para poder obterner
            this.altura = Float.parseFloat(App.input.readLine()); // el area del triangulo
        }catch(IOException e) {
            System.out.println("Error" + e);
        }
        return App.geo.area_del_triangulo(this.base,this.altura); // Nuevamente desde la clase main accedo a
    }                                                             // todas las clase generales que creo

}
