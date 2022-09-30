import java.util.*;
public class Conditions {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.println("Equal");
        }
        else if(a > b)
        {
            System.out.println("A is Greater then B");
        }
        else
        {
            System.out.println("A is Less then B");
        }
        sc.close();
    }
}
