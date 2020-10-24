import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AnalyzeNumbers {

    public static void main(String[] args) {
      
        Scanner scr = new Scanner(System.in);
        int[] cincoValores = new int[5];
        short numPar = 0; 
        short numImpar = 0; 
        short pos = 0; 
        short neg = 0;
        
        
        for (short i=0; i < cincoValores.length; i++) {
            cincoValores[i] = scr.nextInt();
            
            if(cincoValores[i]%2 == 0)
                numPar++;
            else 
                numImpar++;
                
            if(cincoValores[i] > 0)
                pos++;
            else if(cincoValores[i] < 0) 
                    neg++;
        }
        
        System.out.println(numPar + " valor(es) par(es)\n" +
                           numImpar + " valor(es) impar(es)\n" +
                           pos + " valor(es) positivo(s)\n" +
                           neg + " valor(es) negativo(s)");
        
        /*System.out.println(numPar + " valor(es) par(es)");
            System.out.println(numImpar + " valor(es) impar(es)");
            System.out.println(pos + " valor(es) positivo(s)");
            System.out.println(neg + " valor(es) negativo(s)");*/
        
        scr.close();
    }
    
}