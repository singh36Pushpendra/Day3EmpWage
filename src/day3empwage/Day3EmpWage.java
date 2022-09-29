package day3empwage;

import java.util.Random;

public class Day3EmpWage {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Emp Wage!");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int PRESENT = 1;               
        int WAGE_PER_HOUR = 20;
        int fullDayHour = 0;
        int dailyWage = 0;
        
        if (attendance == PRESENT) {
            fullDayHour = 8;
            System.out.println("Employee is Present!");
        }
        else
            System.out.println("Employee is Absent!");
        
        dailyWage = WAGE_PER_HOUR * fullDayHour;
        System.out.println("Daily wage of employee: " + dailyWage);
    }
    
}
