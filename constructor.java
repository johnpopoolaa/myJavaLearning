class Construct
{
    String name;
    int age;
    String state;

    public Construct()
    {
        name = "Sam";
        age = 24;
        state = "Ondo";
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getState()
    {
        return state;
    }
}

public class constructor {
    public static void main(String a[])
    {
        Construct obj1 = new Construct();
        System.out.println("his name is " + obj1.getName() + ", he is " + obj1.getAge() + " years old, and he is from " + obj1.getState() + " state.");
    }
}
