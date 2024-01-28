package edu.vpvictoria.fpoo;
import edu.vpvictoria.fpoo.Clases_generales.suma;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Ejercicio_1 {
    public void operacion(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); /* Entrada de datos */
        String a, b;
        suma sum = new suma();
        try {
            System.out.println("Ingresa el valor de a: ");
            a = input.readLine();
            System.out.println("Ingresa el valor de b: ");
            b = input.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("El resultado es:" + sum.sumar(a,b));

    }

}

