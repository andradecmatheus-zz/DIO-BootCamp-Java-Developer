import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ExibirNumerosPares {

    public static void main(String[] args) {
      
        Scanner scr = new Scanner(System.in);
        int n;
        List<Integer> numerosPares = new ArrayList<Integer>();
        
        //só aceita valores > 0
        do{
          n = scr.nextInt();
        } while(n<1);
        
  
        for (int i=2; i<=n; i+=2)
            System.out.println(i);
        
        //Outra maneira menos performática
        /*for (int i=1; i<=n; i++) {
          if(i%2 == 0)
            numerosPares.add(i);
        }
        
        numerosPares.forEach(x -> System.out.println(x));*/
        
        scr.close();
    }
  
}