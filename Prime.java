import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int n,i,div=0;
        System.out.println("Enter the Number:");
        n=s.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                div = div + 1;
            }
        }
        if(div==0) {
            System.out.println(n + " is a Prime number");
        }
        else
        {
            System.out.println(n+" is a Non Prime number");
        }
    }
}
