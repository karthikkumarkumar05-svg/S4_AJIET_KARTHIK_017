import java.util.Scanner;

public class MonitorSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N (Number of visits)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(0);
            return;
        }

        // The first student's rank initializes the register
        int currentRank = sc.nextInt();
        int cutCount = 0;

        // Check the remaining students
        for (int i = 1; i < n; i++) {
            int nextRank = sc.nextInt();
            
            // If the new rank is strictly less than the current rank
            if (nextRank < currentRank) {
                currentRank = nextRank; // Update the register
                cutCount++;             // Increment the cut count
            }
        }

        System.out.println(cutCount);
        sc.close();
    }
}
