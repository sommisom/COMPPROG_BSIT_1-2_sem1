//COMPPROG: SIMPLE INTEREST CALCULATOR

import java.util.*;

public class SimpleInterestCalculator{
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        double principal, interestRate;
        int timePeriod;
        
        System.out.println("Simple Interest Calculator\n");
        
        System.out.print("Enter Principal Amount: ");
        principal = scan.nextDouble();
        
        System.out.print("Enter Interest Rate: ");
        interestRate = scan.nextDouble();
        
        System.out.print("Enter Number of Years: ");
        timePeriod = scan.nextInt();
        
        double percentToDecimal = (interestRate/100);
        double simpleInterest = (principal * percentToDecimal * timePeriod);
        double totalAmount = (principal + simpleInterest);
        
        //output
        System.out.println("\nRESULT");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        
    }
    
}