package edu.vpvictoria.fpoo.Clases_generales;

import java.io.IOException;

public class Calendary {

    private int year = 0;
    
    private int month = 0;
    
    private int day = 0;
    private int mouth = 0;
    public int canlendaryformat(String a){

        if(a.toLowerCase() == "enero"){this.month = 1;}
        else if(a.toLowerCase() == "febreo"){this.month = 2;}
        else if(a.toLowerCase() == "marzo"){this.month = 3;}
        else if(a.toLowerCase() == "abril"){this.month = 4;}
        else if(a.toLowerCase() == "mayo"){this.month =  5;}
        else if(a.toLowerCase() == "junio"){this.month = 6;}
        else if(a.toLowerCase() == "julio"){this.month = 7;}
        else if(a.toLowerCase() == "agosto"){this.month = 8;}
        else if(a.toLowerCase() == "septiembre"){this.month = 9;}
        else if(a.toLowerCase() == "ocutubre"){this.month = 10;}
        else if(a.toLowerCase() == "noviembre"){this.month = 11;}
        else if(a.toLowerCase() == "diciembre"){this.month =  12;}
        else { System.out.println("mes no encontrado"); }
        return this.month;
    }

    public void Calcular_fecha(String a){
        int j = 0;
        for(int i = 0; i <= a.length(); i++){
            if(a.charAt(i) == '/'){
                this.day = Integer.parseInt(a.substring(j,i));
            }
        }
    }

}
