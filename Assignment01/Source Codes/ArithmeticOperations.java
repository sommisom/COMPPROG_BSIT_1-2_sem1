//COMPPROG: ARITHMETIC-OPERATIONS

import java.util.*;

public class ArithmeticOperations{
    
    public static void main (String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        double numberA;
        double numberB;
        
        System.out.println("Arithmetic Operations\n");
        
        System.out.print("Enter first number: ");
        numberA = scan.nextDouble();
        
        System.out.print("Enter second number: ");
        numberB = scan.nextDouble();
        
        double sum = (numberA + numberB);
        double difference = (numberA - numberB);
        double product = (numberA * numberB);
        double quotient = (numberA / numberB);
        
        //output
        System.out.println("\nRESULTS");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
    }
    
}
