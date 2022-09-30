public class Even_Numbers
{
    public static void main(String args[])
    {
        int n = 100;

        // int even = 2;
        // while (even <= n) {
        //     System.out.println(even);
        //     even += 2;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
