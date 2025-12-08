class Comp
{
    public void noRet()
    {
        System.out.println("Code run");
    }

    public String Ret(int val)
    {
        if(val < 10)
            return "Run but less than minimum";
        return "Run well";
    }
}

public class methods {
    public static void main(String a[])
    {
        Comp ook = new Comp();
        ook.noRet();
        String ls = ook.Ret(10);
        System.out.println(ls);
    }
}