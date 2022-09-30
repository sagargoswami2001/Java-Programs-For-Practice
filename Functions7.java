// Make a Function to Print the Table of a Given Number N.

import java.util.Scanner;
public class Functions7 {
    public static void PrintTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        PrintTable(num);
        sc.close();
    }
}
