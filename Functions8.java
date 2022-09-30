// Write a Function to Print the Sum of all Odd Numbers from 1 to n.

import java.util.*;
public class Functions8 {
    public static void printSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        printSum(n);

        sc.close();
    }
}
