// Enter 3 Numbers from the User & make print their average.

import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.println("\nAverage of Three Number is: " + average);

        sc.close();
    }
}
