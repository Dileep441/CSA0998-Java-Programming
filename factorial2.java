import java.util.*;
class factorial2
{
    int n,sum=1;
    factorial2(int a) {
        n = a;
    }
    void cal() {
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println("factorial= " + sum);
    }
    public static void main(String[] arg)
    {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=s.nextInt();
        factorial2 obj=new factorial2(x);
        obj.cal();
    }
}