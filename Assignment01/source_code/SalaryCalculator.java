//COMPPROG: SALARY CALCULATOR

import java.util.*;

public class SalaryCalculator{

    public static void main(String[]args){
    
        Scanner scan=new Scanner(System.in);
        
        double basicSalary, allowance;
        
        System.out.println("Salary Calculator\n");
        
        System.out.print("Enter Basic Salary: ");
        basicSalary = scan.nextDouble();
                
        System.out.print("Enter Total Allowance: ");
        allowance = scan.nextDouble();
        
        double grossSalary = (basicSalary + allowance);
        double deductions = (grossSalary * (12.0/100.0));
        double netSalary = (grossSalary - deductions);
        
        System.out.println("\nRESULT");
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("12% Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
    
    }

}
