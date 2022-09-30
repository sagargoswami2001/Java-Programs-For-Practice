// Make a Function to Multiply 2 Numbers and Return the Product.
import java.util.*;
public class Functions3 {
    public static int calculateProduct(int a, int b) {
        return a * b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 Numbers is: " + calculateProduct(a, b));
        sc.close();
    }
}
