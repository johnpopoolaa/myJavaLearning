// passing values to the objects of an enum
enum Phone
{
    Apple(1200), Samsung(1100), Pixel(), Vivo(899);

    private int price; // initializing the price variable

    // setting the default price value
    private Phone()
    {
        price = 1000;
    }

    // assigning value to the price variable
    private Phone(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class moreEnums {
    public static void main(String a[])
    {
        Phone[] phones = Phone.values(); // calling the objects in the enum
        for(Phone p : phones)
        {
            System.out.println(p + " : " + p.getPrice());
        }
    }
}
