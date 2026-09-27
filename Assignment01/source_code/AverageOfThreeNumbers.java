//COMPPROG: AVERAGE CALCULATOR

import java.util.*;

public class AverageOfThreeNumbers {
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        double numberA, numberB, numberC;
        
        System.out.println("Average of Three Numbers\n");
        
        System.out.print("Enter first number: ");
        numberA = scan.nextDouble();
        
        System.out.print("Enter second number: ");
        numberB = scan.nextDouble();
        
        System.out.print("Enter third number: ");
        numberC = scan.nextDouble();
        
        double sum = (numberA + numberB + numberC);
        double average = sum / 3;
        
        //output
        System.out.println("\nRESULT");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        
    }
    
}