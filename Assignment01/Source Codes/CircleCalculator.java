//COMPPROG: CIRCLE CALCULATOR

import java.util.*;

public class CircleCalculator {
    
    public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
        
	double radius;
		
	System.out.println("Circle Calculator\n");
		
	System.out.print("Enter Radius: "); 
	radius = scan.nextDouble();
		
	double area = (Math.PI * (radius * radius));
	double circumference = (2 * Math.PI * radius);
		
	System.out.println("\nRESULT");
	System.out.println("Area: " + area);
	System.out.println("Circumference: " + circumference);								
																	
    }
}