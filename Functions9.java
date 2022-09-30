// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Functions9 {
    public static int Greater(int a, int b) {
        if (a > b) {
            return a;
        } 
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("\nGreater Number is: " + Greater(a, b));

        sc.close();
    }
}
