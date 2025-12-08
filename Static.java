class Mobile
{
    String type;
    int price;
    static String name;

    public void print()
    {
        System.out.println(type + " || " + price + " || " + name);
    }
}

public class Static {
    public static void main(String a[])
    {
        Mobile dev1 = new Mobile();
        dev1.type = "Samsung";
        dev1.price = 1600;
        Mobile.name = "Mobile Phone";

        Mobile dev2 = new Mobile();
        dev2.type = "Apple";
        dev2.price = 1400;
        // Mobile.name = "Mobile Phone";

        dev1.print();
        dev2.print();
    }
}
