package day3empwage;

import java.util.Random;

public class Day3EmpWage {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Emp Wage!");
        Random random = new Random();
        int attendance = random.nextInt(3);
        int PART_TIME = 1;
        int FULL_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int fullDayHour = 0;
        int dailyWage = 0;
        
        if (attendance == PART_TIME) {
            fullDayHour = 4;
            System.out.println("Employee is Parttime!");
        }
        else if (attendance == FULL_TIME) {
            fullDayHour = 8;
            System.out.println("Employee is Fulltime!");
        }
        else
            System.out.println("Employee is Absent!");
        
        dailyWage = WAGE_PER_HOUR * fullDayHour;
        System.out.println("Daily wage of employee: " + dailyWage);
    }
    
}
