// Make a Function to Check if a Given Number n is Even or Not.

import java.util.*;
public class Functions6 {
    public static void CheckEven(int n) {
        
        if(n % 2 == 0) {
            System.out.println(n + " is Even");
        }
        else
        {
            System.out.println(n + " is not Even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CheckEven(n);
        sc.close();
    }
}
