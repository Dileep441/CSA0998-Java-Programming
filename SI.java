class SI
{
    int prim,rate,time;
    void simple (int p,int r,int t)
    {
        prim=p;
        rate=r;
        time=t;
    }

    void ans()
    {
        int a;
        a=(prim*rate*time)/100;
        System.out.println("Amount "+a);
    }
    public static void main(String[] args) {
        SI obj=new SI();
        obj.simple(1000, 8, 2);
        obj.ans();

    }
}