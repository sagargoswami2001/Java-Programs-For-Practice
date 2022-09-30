import java.util.Scanner;
public class prime_or_not
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

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
        sc.close();
    }
}
