import java.util.*;

public class Switch_Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Sagar");
            break;

            case 2 : System.out.println("Mohit");
            break;

            case 3 : System.out.println("Goswami");
            break;
        
            default: System.out.println("Invalid Key");
            break;
        }
        sc.close();
    }
}
