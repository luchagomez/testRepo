package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP: controlled by a condition, condition is tested before entering the loop, best to use if the loop
 * may or may not need to execute, based on the situation.
 * Example:
 * Each store employee makes $15 an hour. Write a program that allows the employee to enter the number of hours
 * worked for the week Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){

        //Initialize known variables
        int rate= 15;
        int maxHours= 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner= new Scanner(System.in);
        double hoursWorked= scanner.nextDouble();

        //Validate input
        // hoursWorked is the sentinel, is the one who controls the loop
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
