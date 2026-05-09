import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        if(n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            int bananaMonkey = (m + k - 1) / k;
            int peanutMonkey = (p + j - 1) / j;

            int total = bananaMonkey + peanutMonkey;

            int left = n - total;

            if(left < 0)
            {
                left = 0;
            }

            System.out.println("Number of Monkeys left on the tree:" + left);
        }
    }
}
