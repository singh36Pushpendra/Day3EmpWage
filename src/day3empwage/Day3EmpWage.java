package day3empwage;

import java.util.Random;

public class Day3EmpWage {

    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;

    public static void main(String[] args) {

        System.out.println("Welcome to Emp Wage!");
        Random random = new Random();
        int attendance = random.nextInt(3);

        int WAGE_PER_HOUR = 20;
        int fullDayHour = 0;
        int dailyWage = 0;

        switch (attendance) {
            case PART_TIME:
                fullDayHour = 4;
                System.out.println("Employee is Parttime!");
                break;
            case FULL_TIME:
                fullDayHour = 8;
                System.out.println("Employee is Fulltime!");
                break;
            default:
                System.out.println("Employee is Absent!");
        }
        dailyWage = WAGE_PER_HOUR * fullDayHour;
        System.out.println("Daily wage of employee: " + dailyWage);
    }

}
