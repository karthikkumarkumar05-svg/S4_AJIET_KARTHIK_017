import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentMin = sc.nextInt();
        int cuts = 0;

        for (int i = 1; i < n; i++) {
            int rank = sc.nextInt();
            if (rank < currentMin) {
                currentMin = rank;
                cuts++;
            }
        }
        System.out.println(cuts);
    }
}
