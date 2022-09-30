// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class Functions10 {
    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius Number: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference is: " + (getCircumference(radius)));

        sc.close();
    }
}
