import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            
            // Find Nth Term
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                
                // The concept below is called swapping
                int temp = b;
                b = a;
                a = temp;
            }

            System.out.println();
        }

        sc.close();
    }
}
