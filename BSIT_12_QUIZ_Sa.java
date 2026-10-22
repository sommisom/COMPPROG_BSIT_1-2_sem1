import java.util.*;

public class BSIT_12_QUIZ_Sa{
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        int calc;
        
        System.out.println("Choose a Calculator: \n");
        System.out.println("1. Aritmetic Operations");
        System.out.println("2. Average of Three Numbers");
        System.out.println("3. Circle Calculator");
        System.out.println("4. Distance Calculator");
        System.out.println("5. Rectangle Calculator");
        System.out.println("6. Salary Calculator");
        System.out.println("7. Shopping Calculator");
        System.out.println("8. Simple Interest Calculator");
        System.out.println("9. Student Grade Calculator");
        System.out.println("10. Temperature Calculator");
        
        System.out.print("\nChoose a Number: ");
        calc = scan.nextInt();
        
        switch(calc){
            
            case 1:
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
            break;
            
            case 2: 
                double first, second, third;
        
                System.out.println("Average of Three Numbers\n");

                System.out.print("Enter first number: ");
                first = scan.nextDouble();

                System.out.print("Enter second number: ");
                second = scan.nextDouble();

                System.out.print("Enter third number: ");
                third = scan.nextDouble();

                double avesum = (first + second + third);
                double average = avesum / 3;

                //output
                System.out.println("\nRESULT");
                System.out.println("Sum of the numbers: " + avesum);
                System.out.println("Average of the numbers: " + average);
            break;
            
            case 3:
                double radius;
		
                System.out.println("Circle Calculator\n");

                System.out.print("Enter Radius: "); 
                radius = scan.nextDouble();

                double area = (Math.PI * (radius * radius));
                double circumference = (2 * Math.PI * radius);

                System.out.println("\nRESULT");
                System.out.println("Area: " + area);
                System.out.println("Circumference: " + circumference);
            break;

            case 4:
                double speed ,time;
        
                System.out.println("Distance Calculator\n");

                System.out.print("Enter Speed (m/s): ");
                speed = scan.nextDouble();

                System.out.print("Enter Time (s): ");
                time = scan.nextDouble();

                double distance = (speed * time);

                System.out.println("\nDistance Traveled: " + distance + " m");
            break;
            
            case 5:
                double length, width;
        
                System.out.println("Rectangle Calculator\n");

                System.out.print("Enter length: ");
                length = scan.nextDouble();

                System.out.print("Enter width: ");
                width = scan.nextDouble();

                double rectangleArea = (length * width);
                double perimeter = 2 * (length + width);

                //output
                System.out.println("\nRESULT");
                System.out.println("Area: " + rectangleArea);
                System.out.println("Perimeter: " + perimeter);
            break;
            
            case 6:
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
            break;
            
            case 7:
                String item1, item2, item3;
                double p1, p2, p3, payment;
                int q1, q2, q3;

                System.out.println("Shopping Calculator\n");

                System.out.print("Enter first Item: ");
                item1 = scan.next();
                System.out.print("Quantity: ");
                q1 = scan.nextInt();
                System.out.print("Price: ");
                p1 = scan.nextDouble();

                System.out.print("\nEnter Second Item: ");
                item2 = scan.next();
                System.out.print("Quantity: ");
                q2 = scan.nextInt();
                System.out.print("Price: ");
                p2 = scan.nextDouble();

                System.out.print("\nEnter Third Item: ");
                item3 = scan.next();
                System.out.print("Quantity: ");
                q3 = scan.nextInt();
                System.out.print("Price: ");
                p3 = scan.nextDouble();

                System.out.print("\nEnter payment: ");
                payment = scan.nextDouble();

                double t1 = (p1 * q1);
                double t2 = (p2 * q2);
                double t3 = (p3 * q3);

                double total = (t1 + t2 + t3);
                double change = (payment - total);

                System.out.println("\nRECEIPT:");
                System.out.println(item1 + " : " + p1 + " x " + q1 + " = " + t1);
                System.out.println(item2 + " : " + p2 + " x " + q2 + " = " + t2);
                System.out.println(item3 + " : " + p3 + " x " + q3 + " = " + t3);

                System.out.println("\nTotal: " + total);
                System.out.println("Change: " + change);
            break;
            
            case 8:
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
            break;
            
            case 9:
                double math, lang, sci, hist, geo;
        
                System.out.println("Student Grade Calculator\n");
                System.out.println("Enter your Grades");

                System.out.print("Mathematics: ");
                math = scan.nextDouble();

                System.out.print("Language & Arts: ");
                lang = scan.nextDouble();

                System.out.print("Science & Technology: ");
                sci = scan.nextDouble();

                System.out.print("History: ");
                hist = scan.nextDouble();

                System.out.print("Geography: ");
                geo = scan.nextDouble();

                double totalGrade= (math + lang + sci + hist + geo);
                double gwa = (totalGrade / 5);

                System.out.println("\nTotal Grade: " + totalGrade);
                System.out.println("GWA: " + gwa);
            break;
            
            case 10:
                double celsius;
        
                System.out.println("Temperature Converter\n");

                System.out.print("Enter Temperature in °C: ");
                celsius = scan.nextDouble();

                double fahrenheit = ((celsius * (9.0/5.0)) + 32);

                System.out.println("\nRESULT");
                System.out.println("Fahrenheit: " + fahrenheit + "°F");
            break;
            
            default:
                System.out.println("Invalid Number");
            
            
            
        }
        
        
    }
    
    
}