package edu.vpvictoria.fpoo;

import java.io.IOException;
import java.util.Stack;

public class Ejercicio_10 {
    private String num_tel;
    private String med_tel;
    private String med_in_pulg;

    public Ejercicio_10(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_10 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Obtener medidas de telas de metro a pulgadas");
        System.out.println(cm_a_pulg());
    }
    public String cm_a_pulg(){
        try{
            System.out.print("Ingrese el numero de telas: ");
            this.num_tel = App.input.readLine();
            System.out.print("Ingrese el tamaño en cm de la telas: ");
            this.med_tel = App.input.readLine();
        }catch (IOException e){
            System.out.print("Error" + e);
        }
        this.med_in_pulg = App.math.div(this.med_tel, "38.48");

        return "Tela x1 Pieza: " + App.tools.round(this.med_in_pulg) + " en toltal: " + App.tools.round(App.math.multiplication(this.med_in_pulg,this.num_tel));
    }
}
