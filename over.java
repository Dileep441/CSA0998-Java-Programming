class over
{
    void show()
    {
        System.out.println("Welcome to java");
    }
    void show(String msg)
    {
        for(int i=0;i<2;i++)
        {
            System.out.println(msg);
        }
    }
    void show(String msg,int n){
        for(int i=0;i<3;i++)
        {
            System.out.println(msg);
        }
    }
    public static void main(String arg[])
    {
        over obj=new over();
        obj.show();
        obj.show("Welcome to polymorphism");
        obj.show("Welcome to overloading,3");
    }

}