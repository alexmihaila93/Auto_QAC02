package Homework1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Please enter any year between 1900 and 2016 :");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year < 1900 || year >2016) {
            System.out.println("Year must be betweem 1900 and 2016.");
        }
        else {
            boolean isLeapYear = (year % 4 == 0 && year %100 !=0) || (year %400 == 0);
            if (isLeapYear) {
                System.out.println("February " + year + " has 29 days.");
            } else {
                System.out.println("February " + year + " has 28 days.");
            }


        }
scanner.close();
    }

}
