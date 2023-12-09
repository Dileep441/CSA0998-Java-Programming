import java.util.Scanner;
public class DecimalSqCube {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
while (!sc.hasNextDouble() || sc.hasNextInt()) {
System.out.println("Invalid input. Please enter a decimal number.");
sc.next();
}
double number = sc.nextDouble();
double square = Math.pow(number, 2);
double cube = Math.pow(number, 3);
System.out.println("Square Number: " + square);
System.out.println("Cube Number: " + cube);
}
}
