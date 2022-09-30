/* Write a Program to enter the numbers till the user wants and at the end it should display the count of positive,
negative and zeros entered. */

import java.util.*;

public class Positive_Negative_Count {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;

        System.out.println("Press 1 to Continue & 0 to Stop");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("Enter Your Number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } 
            else if (number < 0) {
                negative++;
            }
            else {
                zeros++;
            }

            System.out.println("Press 1 to Continue & 0 to Stop");
            input = sc.nextInt();
        }

        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zeros);

        sc.close();
    }
}
