// Write a function to find the value of one number raised to the power of another i.e.Xn.
// Two numbers are entered by the user, x and n.

import java.util.*;
public class Number_Power {
    public static void main(String[] args) {
        System.out.print("Enter X: ");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        System.out.println("X to the Power n is: " + result);

        sc.close();
    }
}
