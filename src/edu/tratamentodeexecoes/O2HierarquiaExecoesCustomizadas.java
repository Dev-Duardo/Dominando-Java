package edu.tratamentodeexecoes;
import java.text.NumberFormat;
import java.text.ParseException;

public class O2HierarquiaExecoesCustomizadas {
    //Checked and Unchecked Exceptions
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       // valor = NumberFormat.getInstance().parse("a1.75");
        
       
    }
}
