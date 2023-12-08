import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int l = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int u = scanner.nextInt();
        int n=u-1;
        int arr[][]=new int[n+1][2];
        for (int i = 0; i <=n; i++) {
            arr[i][0]=l+i;
            arr[i][1]=(l+i)*(l+i);
        }
        for(int i=0;i<n;i++) {
            System.out.print("(" +arr[i][0] + ", " + arr[i][1] + ")");
        }
    }
}
