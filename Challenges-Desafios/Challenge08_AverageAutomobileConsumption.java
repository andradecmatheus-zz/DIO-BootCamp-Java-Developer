import java.util.Scanner;
  
public class AverageAutomobileConsumption {
    
    public static void main(String[] args) {
      
        Scanner scr = new Scanner(System.in);
        int km = scr.nextInt();
        double combustivel = scr.nextDouble();
        
        double mediaConsumo = (double) km / combustivel;
        
        System.out.printf("%.3f km/l", mediaConsumo);
        
        scr.close();
        }
        
  }