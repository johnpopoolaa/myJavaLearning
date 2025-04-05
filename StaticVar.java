class inBlock
{
    String type;
    int price;
    static String name;
    
    static
    {
        name = "Smartphone";
        System.out.println("in static block");
    }

    public inBlock()
    {
        type = "";
        price = 100;
        System.out.println("in constructor");
    }
}

public class StaticVar {
    public static void main(String a[])
    {
        inBlock var1 = new inBlock();
        var1.type = "Samsung";
        var1.price = 400;

        inBlock var2 = new inBlock();
    }
}
