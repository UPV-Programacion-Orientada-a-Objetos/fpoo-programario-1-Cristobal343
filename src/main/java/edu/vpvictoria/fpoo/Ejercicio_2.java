package edu.vpvictoria.fpoo;
import edu.vpvictoria.fpoo.Clases_generales.Math_op;
import edu.vpvictoria.fpoo.Clases_generales.suma;

import javax.lang.model.element.NestingKind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_2 {

    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public String calf1, calf2, calf3, calf4;

    public Ejercicio_2(){
        System.out.println("Ejercicio 2: ");
        ingresar_calificaiones();
    }

    public void ingresar_calificaiones(){
        System.out.println("ingrese el resultado de sus cuatros calificaciones");
        try {
            System.out.println("ingrese la calficiacion 1: ");
            this.calf1 = input.readLine();
            System.out.println("ingrese la calificacion 2: ");
            this.calf2 = input.readLine();
            System.out.println("ingrese la califiacion 3");
            this.calf3 = input.readLine();
            System.out.println("ingrese la califiacion 4: ");
            this.calf4 = input.readLine();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        suma sum = new suma();
        Math_op op = new Math_op();
        System.out.println("El promedio es igual a: " + App.tools.round(   // sumo la suma de de dos caficaciones el resultado lo convierto los divido entre 4
                Float.toString(Float.parseFloat(sum.sumar(sum.sumar(calf1,calf2),sum.sumar(calf3,calf4)))/4))); // y lo redondeo a dos cifras
    }

}
