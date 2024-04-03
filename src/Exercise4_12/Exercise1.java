package Exercise4_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String [] args){
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        // data-types set to 0
        int num1 = 0, num2 = 0;

        //Allows user to enter first integer
        System.out.print("Enter the first integer: ");
        try{
            num1 = scanner.nextInt();// read the first integer
        } catch (InputMismatchException e){
            // prints out message if num is not right
            System.out.println("Invalid input. Please an integer.");
            return; //Exit the program
        }
        //Allows user to enter second  integer
        System.out.print("Enter the second integer: ");
        try{
            num2 = scanner.nextInt();// read the first integer
        } catch (InputMismatchException e){
            // prints out message if num is not right
            System.out.println("Invalid input. Please an integer.");
            return; //Exit the program
        }
        // calculates the sum of the two numbers
        int sum = num1 + num2;
        // prints out message of the sum of num1 and num2
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

    }
}
