//COMPPROG: Temperature Converter

import java.util.*;

public class TemperatureConverter {
    
    public static void main(String[]args) {
        
        Scanner scan=new Scanner(System.in);
        
        double celsius;
        
        System.out.println("Temperature Converter\n");
        
        System.out.print("Enter Temperature in °C: ");
        celsius = scan.nextDouble();
        
        double fahrenheit = ((celsius * (9.0/5.0)) + 32);
        
        System.out.println("\nRESULT");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        
        
    }
    
}