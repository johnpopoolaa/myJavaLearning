class Tele
{
    String phoneName;
    int cost;
    static String phoneType;

    public void show()
    {
        System.out.println("I love to use " + phoneName + " and it only costs " + cost + " it is my favorite " + phoneType);
    }

    public static void show2(Tele obj)
    {
        System.out.println("I love to use " + obj.phoneName + " and it only costs " + obj.cost + " it is my favorite " + phoneType);
    }
}

public class staticBlock {
    public static void main(String a[])
    {
        Tele str = new Tele();
        str.phoneName = "Apple";
        str.cost = 1400;

        Tele str1 = new Tele();
        str1.phoneName = "Samsung";
        str1.cost = 1250;

        Tele.phoneType = "Telephone brand";

        str.show();
        str1.show();

        Tele.show2(str1);
    }
}
