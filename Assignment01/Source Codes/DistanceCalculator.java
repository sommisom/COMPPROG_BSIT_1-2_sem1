//COMPPROG: DISTANCE CALCULATOR

import java.util.*;

public class DistanceCalculator{
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        double speed ,time;
        
        System.out.println("Distance Calculator\n");
        
        System.out.print("Enter Speed (m/s): ");
        speed = scan.nextDouble();
        
        System.out.print("Enter Time (s): ");
        time = scan.nextDouble();
        
        double distance = (speed * time);
        
        System.out.println("\nDistance Traveled: " + distance + " m");
        
    }
    
}