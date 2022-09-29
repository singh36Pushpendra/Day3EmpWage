package day3empwage;

import java.util.Random;

public class Day3EmpWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Emp Wage!");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int PRESENT = 1;
        
        if (attendance == PRESENT)
            System.out.println("Employee is Present!");
        else
            System.out.println("Employee is Absent!");
        
    }
    
}
