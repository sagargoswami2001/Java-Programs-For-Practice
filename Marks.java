import java.util.Scanner;
public class Marks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100)
            {
                System.out.println("This is Good");
            }
            else if(marks >= 60 && marks <= 89)
            {
                System.out.println("This is also Good");
            }
            else if(marks >= 33 && marks <= 59)
            {
                System.out.println("This is Good as Well");
            }
            else
            {
                System.out.println("Jathu Fail Ho Gya😁");
            }

            System.out.println("Want to Continue ? (Yes(1) or No(0))");
            input = sc.nextInt();
            
        } while (input == 1);
        sc.close();
    }
}
