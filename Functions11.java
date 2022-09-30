// Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A Person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Functions11 {
    public static void Elligible(int age) {
        if (age >= 18) {
            System.out.println("You Are Eligible");
        } 
        else {
            System.out.println("You Are Not Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        Elligible(age);

        sc.close();
    }
}
