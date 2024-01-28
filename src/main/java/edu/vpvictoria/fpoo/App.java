package edu.vpvictoria.fpoo;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.printf("Programario unidad uno \nElija el ejercicio: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        switch(input.readLine()){
            case "1": new Ejercicio_1().operacion(); break;
            case "2": new Ejercicio_2(); break;
            case "3": new Ejercicio_3(); break;
            case "4": new Ejercicio_4(); break;
            default: System.out.printf("opcion no valida"); break;
        }
    }
}
