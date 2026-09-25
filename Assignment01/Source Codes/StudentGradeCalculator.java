//COMPPROG: STUDENT GRADE CALCULATOR

import java.util.*;

public class StudentGradeCalculator{
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
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
        
        
    }
    
}