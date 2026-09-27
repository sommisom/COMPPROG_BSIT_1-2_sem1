//COMPPROG:RECTANGLE CALCULATOR

import java.util.*;

public class RectangleCalculator {
    
    public static void main (String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        double length, width;
        
        System.out.println("Rectangle Calculator\n");
        
        System.out.print("Enter length: ");
        length = scan.nextDouble();
        
        System.out.print("Enter width: ");
        width = scan.nextDouble();
        
        double area = (length * width);
        double perimeter = 2 * (length + width);
        
        //output
        System.out.println("\nRESULT");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
    }
    
}
