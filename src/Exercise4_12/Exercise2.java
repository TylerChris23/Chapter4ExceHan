package Exercise4_12;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // stores array  of 50 double values
        double[] randomArray = new double[50];
        // creates random nums being generated
        Random random =new Random();
        // scanner to read objects
        Scanner scanner =new Scanner(System.in);

        try {
            // Generate random double values and store them in the array
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = random.nextDouble();
            }
            // allows users to enter index
            System.out.print("Enter an index to get array value: ");
            // reads the index entered by the user
            int index = scanner.nextInt();

            // checks if index is out of bounds
            if (index < 0 || index >= randomArray.length) {
                // if it is it will throw exception of Array
                throw new ArrayIndexOutOfBoundsException();
            }
            // prints value of index
            System.out.println("The value at index " + index + " is: " + randomArray[index]);
            // handles exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range. Please enter an index between 0-49.");
            // handles other exception given a basic error message
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            // close scanner 
        } finally {
            scanner.close();
        }
    }
}
