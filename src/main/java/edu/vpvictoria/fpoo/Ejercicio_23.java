package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_23 {
    public Ejercicio_23(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_23 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calcular el Iva de un producto ");
        System.out.println("El precio articulo mas el Iva es de: " + Iva());
    }

    public String Iva(){
        String precio = null;
        String iva = null;
        try {
            System.out.println("Ingrese el precio del producto");
            precio = App.input.readLine();
            System.out.println("Ingrese el porcentaje del iva %: ");
            iva = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return App.tools.round(
                App.math.sumar(precio,
                App.math.multiplication(precio, App.tools.iva(iva))
                )
        );
    }
}
