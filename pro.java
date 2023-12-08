import java.util.*;
class pattern
{
    public static void main(String args[])
    {
    int rows;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows:");
    rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

}