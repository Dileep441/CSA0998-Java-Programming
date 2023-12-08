import java.util.*;
 class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int a,b,t,n,i;
        System.out.println("Enter the Number:");
        n=s.nextInt();
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(i=2;i<=n;i++) {
            t = a + b;
            System.out.println(t);
            a=b;
            b=t;
        }
    }
}
