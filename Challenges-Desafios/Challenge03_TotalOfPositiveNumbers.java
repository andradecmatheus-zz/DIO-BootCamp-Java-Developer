import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class QtdNumPos {

    public static void main(String[] args) {
      
      Scanner scr = new Scanner(System.in); 
      double[] seisValores = new double[6];
      int contPos = 0;
      
      for (short i=0; i< seisValores.length; i++) {
        seisValores[i] = scr.nextDouble();
        if (seisValores[i] > 0) contPos++;
      }
      
      System.out.print(contPos + " valores positivos");
      
      scr.close();
  }
  
}