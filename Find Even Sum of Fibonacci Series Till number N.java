import java.util.Scanner;
public class EvenSumFibonacci
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the n value:");
int n = scanner.nextInt();
int evenSum = 0;
int firstTerm = 0, secondTerm = 1;
for (int i = 0; i <= n; i++)
{
if (i % 2 == 0)
{
P Rohith Kumar
evenSum += firstTerm;
}
int nextTerm = firstTerm + secondTerm;
firstTerm = secondTerm;
secondTerm = nextTerm;
}
System.out.println("Sum of Fibonacci numbers at even indices: " + evenSum);
}
}
