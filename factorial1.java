import java.util.*;
class factorial
{
    int n,sum=1;
    void fact()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        n=s.nextInt();
    }
    void cal()
    {
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.println("factorial= "+sum);
    }
    public static void main(String[] arg)
    {
        factorial obj=new factorial();
        obj.fact();
        obj.cal();
    }
}