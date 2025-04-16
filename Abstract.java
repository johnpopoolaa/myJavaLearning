// understanding the abstract keyword
abstract class House // we make the class abstract so we can use abstract methods
{
    public abstract void rooms(); // we create the abstract method because we do not want to define it yet
    public  abstract void amenities();
    public void kitchen()
    {
        System.out.println("our house has 3 kitchens");
    }
}

abstract class Duplex extends House // we make this class abstract because we are not defining an abstract method from parent class
{
    public void rooms()
    {
        System.out.println("we have 3 rooms");
    }
}

class Bungalow extends Duplex
{
    public void amenities()
    {
        System.out.println("our house has state-of-the-art amenities like a resort and spa, gym, relaxation area...");
    }
}

public class Abstract
{
    public static void main(String a[])
    {
        House obj = new Bungalow();
        obj.rooms();
        obj.amenities();
        obj.kitchen();

    }
}
