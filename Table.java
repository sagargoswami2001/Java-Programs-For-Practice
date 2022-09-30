import java.util.Scanner;
public class Table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num*i);
        }
        sc.close();
    }
}
