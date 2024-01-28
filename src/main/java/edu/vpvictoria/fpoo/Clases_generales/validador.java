package edu.vpvictoria.fpoo.Clases_generales;
import java.math.BigDecimal;
public class validador{


    public String isanumber(String a){
        String errmessage = null;
        try {
            Integer.parseInt(a);
            errmessage = "isanumber";
        }catch (NumberFormatException e){
            errmessage = "isnanumbre";
        }
        try{
            Float.parseFloat(a);
            errmessage = "isanumber";
        }catch (NumberFormatException e){
            errmessage = "isn'tanumber";
        }
        return errmessage;


    }
    public String verificar(String a){
            if(a.contains(",") || a.contains(".")){
                return "isafloat";
            }
            else { return "isainteger"; }
    }

}