//COMPPROG: SHOPPING CALCULATOR

import java.util.*;

public class ShoppingCalculator {
    
    public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
                
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
		
    }
        
}