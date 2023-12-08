import java.util.*;
class Rectangle
{
    int height,width;
    Rectangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the height of rectangle: ");
        height=s.nextInt();
        System.out.println("Enter the width of rectangle: ");
        width=s.nextInt();
    }
    void cal()
    {
        int result=height*width;
        System.out.println("Area of rectangle= "+result);
    }
    public static void main(String[] arg)
    {
        Rectangle obj=new Rectangle();
        obj.cal();
    }
}