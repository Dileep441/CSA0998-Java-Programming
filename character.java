import java.util.Scanner;
class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        System.out.println("Enter * to exit...");
        do {
            System.out.print("Enter any character: ");
            inputChar = scanner.next().charAt(0);
            if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                digitCount++;
            }else{
                System.out.println(("Enter a valid character!!"));
            }
        } while (inputChar != '*');
        System.out.println("Uppercase letters entered: " + uppercaseCount);
        System.out.println("Lowercase letters entered: " + lowercaseCount);
        System.out.println("Numbers entered: " + digitCount);
    }
}