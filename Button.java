import java.util.*;

public class Button
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1) {
            System.out.println("Sagar");
        }
        else if(button == 2) {
            System.out.println("Mohit");
        }
        else if(button == 3) {
            System.out.println("Goswami");
        }
        else {
            System.out.println("Invalid Key");
        }
        sc.close();
    }   
}
