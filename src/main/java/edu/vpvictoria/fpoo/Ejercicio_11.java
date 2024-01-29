package edu.vpvictoria.fpoo;

import java.awt.geom.Area;
import java.io.IOException;

public class Ejercicio_11 {
    private double Higth = 0d; // altura del rectangulo
    private double Wight = 0d; // Anchura del triangulo
    private double Long = 0d; // longitud del triangulo
    private double litros = 0d; // litro de agua
    public Ejercicio_11(){ // El contructor solo lo utlizo para desplegar el menu de la clase
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_10 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Cacluclar cuanto litros de agua caben en una pisina");
        area_del_prisma();
        System.out.println("El totual de litro en consumo de agua son : " + this.litros + "l");
    }

    public void area_del_prisma(){
        // se me ha olvidado comentar lo que hago sorry...
        // esta funcion solo se utilizara para calcular el area del prisma
        double area = 0d; // esta variable solo contrendra el resultado de la operacion
        // la formula para calcular un prisma es area de la base por altura
        try { // el try chatch lo nececisto porque el edito sugiere que lo use con BufferReader
            System.out.println("Ingrese las medidas en metros que desea obtener");
            System.out.print("Ingresar la altura: ");
            this.Higth= Double.parseDouble(App.input.readLine());
            System.out.print("Ingresar la anchura: ");
            this.Wight = Double.parseDouble(App.input.readLine()); // ya habia explicado el porque uso la Clase main
            System.out.print("Ingrese la longitud: ");        // para usar el BufferReader estan el la clase App explicado
            this.Long = Double.parseDouble(App.input.readLine());
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        area = Double.parseDouble( App.tools.round(
                String.valueOf(App.math.multiplication(    // aqui me hice un rollo para poder primero mutiplicar la anchura por lo largo para
                        App.geo.area_del_rectangulo(  // obterner el area de la base luego volvi a multiplicar el resultado pero esta vez con
                                App.tools.toFloat(this.Wight),App.tools.toFloat(this.Long) // la altura el resultado lo redonde y lo converti a
                        )                                                                  // double fin de la explicaion
                        ,App.tools.toFloat(this.Higth)
                        ))
                )
        );
        this.litros = area * 1000; // todo eso para al final un simple return
    }

}
