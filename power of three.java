import java.util.Scanner;
class PowerOfThree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
if (n < 1)
{
System.out.println("False");
} else
{
while (n % 3 == 0)
{
n /= 3;
}
if (n == 1) {
System.out.println("True");
} else {
System.out.println("False");
}
}
}
}
