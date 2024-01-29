package edu.vpvictoria.fpoo;

import java.io.IOException;

public class Ejercicio_14 {
    public Ejercicio_14(){
        System.out.println("-".repeat(21) + "\n" +
                "-".repeat(4) +  " Ejercicio_14 " + "-".repeat(4) + "\n" +
                "-".repeat(21) + "\n" + "Calular la edad apartir de la fecha de nacimiento");
    }

    public int calcular_edad(){
        String actual_year;
        String birth_date;
        try{
            System.out.print("Ingrese el fecha actual siguete formato ejemplo:(dia/mes/año)");
            actual_year = App.input.readLine();
            System.out.print("Ingrese su fecha de naciemiento siguiendo el siguiente formato:(dia/mes/año)");
            birth_date = App.input.readLine();
        }catch (IOException e){
            System.out.println("Error " + e);
        }
        return 0;
    }


}
