import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = 10;
        int K = 5;
        int candies = N;

        int order = sc.nextInt();

        if(order > candies || order <= 0)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            candies = candies - order;

            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available:" + candies);

            if(candies <= K)
            {
                candies = N;
            }
        }
    }
}
