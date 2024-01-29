package edu.vpvictoria.fpoo;
import edu.vpvictoria.fpoo.Clases_generales.Geometry;
import edu.vpvictoria.fpoo.Clases_generales.Math_op;
import edu.vpvictoria.fpoo.Clases_generales.Tools;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class App {

    public static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static final Geometry geo = new Geometry(); // solamete lo utilizo para no tener que crear intancia de la clas cada vez que la
    public static final Math_op math = new Math_op(); // ocupe, ¿porque?, bueno no puedo llamar a la clase si solo tengo metodos de instancia xd

    public static final Tools tools = new Tools();
    public static void main(String[] args) throws IOException {
        System.out.printf("Programario unidad uno \nElija el ejercicio [1-26]: ");
        switch(input.readLine()){
            case "1": new Ejercicio_1().operacion(); break;
            case "2": new Ejercicio_2(); break;
            case "3": new Ejercicio_3(); break;
            case "4": new Ejercicio_4(); break;
            case "5": new Ejercicio_5(); break;
            case "6": new Ejercicio_6(); break;
            case "7": new Ejercicio_7(); break;
            case "8": new Ejercicio_8(); break;
            case "9": new Ejercicio_9(); break;
            case "10": new Ejercicio_10(); break;
            case "11": new Ejercicio_11(); break;
            case "12": new Ejercicio_12(); break;
            case "13": new Ejercicio_13(); break;
            case "15": new Ejercicio_15(); break;
            case "16": new Ejercicio_16(); break;
            case "17": new Ejercicio_17(); break;
            case "18": new Ejercicio_18(); break;
            case "19": new Ejercicio_19(); break;
            case "20": new Ejercicio_20(); break;
            default: System.out.print("opcion no valida"); break;
        }
    }
}
