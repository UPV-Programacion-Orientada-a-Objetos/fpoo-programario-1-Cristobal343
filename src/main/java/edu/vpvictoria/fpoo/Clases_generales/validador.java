package edu.vpvictoria.fpoo.Clases_generales;
import java.io.IOException;
import java.math.BigDecimal;
public class validador{


    public String isanumber(String a){
        String message = null;
        try {
            Integer.parseInt(a);
            message = "isanumber";
        }catch (NumberFormatException e){
            message = "isnanumbre";
        }
        try{
            Float.parseFloat(a);
            message = "isanumber";
        }catch (NumberFormatException e){
            message = "isnanumber";
        }
        try {
            Double.parseDouble(a);
        }catch (NumberFormatException e){
            message = "isn'tanumber";
        }
        return message;


    }
    public String verificar(String a){
            if(a.contains(",") || a.contains(".")){
                return "isafloat";
            }
            else { return "isainteger"; }
    }

}