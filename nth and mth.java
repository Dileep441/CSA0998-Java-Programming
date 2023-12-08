import java.util.*;
 class SkipNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter M: ");
        int M = sc.nextInt();

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.print("Enter K: ");
        int K = sc.nextInt();

        // Validate input: N should be greater than or equal to M
        if (N < M) {
            System.out.println("Invalid input. N should be greater than or equal to M.");
            return;
        }

        System.out.print("Output: ");

        for (int i = M; i <= N; i += K) {
            System.out.print(i);

            // Print a comma if there are more numbers to come
            if (i + K <= N) {
                System.out.print(", ");
            }
        }
    }
}
