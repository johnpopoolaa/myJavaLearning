// inheritance in java

class M
{
    public M()
    {
        super();
        System.out.println("in M");
    }

    public M(int n)
    {
        super();
        System.out.println("in M integer");
    }
}

class N extends M
{
    public N()
    {
        super(3);
        System.out.println("in N");
    }

    public N(int n)
    {
        super(n);
        System.out.println("in N integer");
    }
}

public class SuperC {
    public static void main(String a[])
    {
        N obj = new N();
    }
}
