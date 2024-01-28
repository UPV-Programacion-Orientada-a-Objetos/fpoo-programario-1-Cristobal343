package edu.vpvictoria.fpoo;

import java.io.IOException;
import java.sql.SQLOutput;

public class Ejercicio_9 {

    private String sueldo_en_horas = null;

    private String horas_trabajadas = null;

    private String dias_de_trabajo = null;

    public Ejercicio_9(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_9 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Obtener el sueldo semanal del trabajador");
        System.out.println("El sueldo semanal del trabajador es: " + App.tools.round(Sueldo_semanal()));
    }
    public String Sueldo_semanal(){
        try {
            System.out.print("Ingresa el sueldo en horas del trabajador: ");
            this.sueldo_en_horas = App.input.readLine();
            System.out.print("Ingresa las horas de trabajo semanal: ");
            this.horas_trabajadas = App.input.readLine();
            System.out.print("Ingresa los dias del trabajo del trabajador: ");
            this.dias_de_trabajo = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error" + e);
        }
        String sueldo_semanal = App.math.multiplication(
                App.math.multiplication(this.sueldo_en_horas,this.horas_trabajadas),this.dias_de_trabajo
        );
        return sueldo_semanal;
    }
}
