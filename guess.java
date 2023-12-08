import java.util.*;

class m1 {
    public static void main(String args[]) {
        int p = 0, c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");

        try {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num >= 0) {
                    if (num == 0 || num == 1) {
                        c += 1;
                    } else {
                        boolean isComposite = false;

                        for (int j = 2; j <= Math.sqrt(num); j++) {
                            if (num % j == 0) {
                                isComposite = true;
                                break;
                            }
                        }

                        if (isComposite) {
                            c += 1;
                        } else {
                            p += 1;
                        }
                    }
                } else {
                    System.out.println("Enter only positive input");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only integers");
        }

        System.out.println("Count of composite numbers: " + c);
        System.out.println("Count of prime numbers: " + p);
    }
}