import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int no1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int no2 = sc.nextInt();

        System.out.println("Enter Required Operation\n[| + | - | * | / | % |]");
        char operator = sc.next().charAt(0);

        int res = calculate(no1, no2, operator);
        System.out.println(no1 + " " + operator + " " + no2 + " = " + res);

        sc.close();
    }

    // Method to Perform Operations
    static int calculate(int x, int y, char operator)
    {
        int res=0;

        switch (operator) 
        {
            case '+' : res=x+y;    
            break;
        
            case '-' : res=x-y;
            break;

            case '*' : res=x*y;
            break;

            case '/' : res=x/y;
            break;

            case '%' : res=x%y;
            break;

            default : System.out.println("Invalid Key");
            break;
        }
        return res;
    }
}        
