// Make a Function to check if a Number is Prime or Not.

import java.util.*;
public class Functions5 {
    public static void checkPrime(int n) {

        boolean isPrime = true;
        for(int i=2; i<=n/2; i++)
        {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            if(n == 1) 
            {
                System.out.println("This is Nither Prime Not Composite");
            } 
            else 
            {
                System.out.println("This is a Prime Number");
            }
        } 
        else 
        {
            System.out.println("This is Not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPrime(n);
        sc.close();
    }
}
