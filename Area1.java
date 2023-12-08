import java.util.*;
class Area1
{
    public double area;
    public double h,r;
    void cal()
    {
        Scanner s=new Scanner(System .in);
        System.out.println("Enter Values of Height and Radius:");
        h= s.nextDouble();
        r= s.nextDouble();
        area=3.14*r*r;
        System.out.println("Area of Circle is:"+area);
    }
}
class cylinder extends Area1
{
    public double cyvol;
    void cal2()
    {
        cyvol=3.14*r*r*h;
        System.out.println("Volume of Cylinder is:"+cyvol);
    }
}
class cones extends cylinder
{
    public double covol;
    void cal3()
    {
        covol=(cyvol)/3;
        System.out.println("Volume of Cone is:"+covol);
    }
}
class display
{
    public static void main(String args[])
    {
        cones o=new cones();
        o.cal();
        o.cal2();
        o.cal3();
    }
}