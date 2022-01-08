class add
{
    int a,b;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
}
    void add2()
    {
        System.out.println("Result="+(a+b));
    }
}
public class add2no {
    public static void main(String arg[])
    {
        add ob=new add();
        ob.getdata(5,10);
        ob.add2();
    }
}

