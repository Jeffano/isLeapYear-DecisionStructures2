/**
 * Name: Jeffano John
 * Date: Thursday Oct. 28th 2021
 * Student Number: 251230759
 * Description: This program reads a year and determines if it is a leap year or not.
 */

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner (System.in);

        //Printing an opening statement
        System.out.println("Enter a Year:");

        //Initializing and reading the year from the user
        int year = input.nextInt();

        //Checks if the year is divisible by 4 and not divisible by 100, if it is true, then it prints Leap year
        if ((year % 4) == 0 && (year % 100) != 0){
            System.out.println("LEAP YEAR");
        }
        //Checks if the year is divisible by 4, 100 and 400. If it is true, then it prints Leap year.
        else if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0){
            System.out.println("LEAP YEAR");
        }
        //If it is not true with the cases above, then it prints, not a leap year.
        else {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
