import java.util.Scanner;
class ReversingNum
{
    public static void main(String args[])
    {
        int r, sum = 0, temp, n;
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}