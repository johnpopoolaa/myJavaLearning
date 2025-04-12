class Construct1
{
    private String name;
    private int age;

    public Construct1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

public class constructor1 {
    public static void main(String a[])
    {
        Construct1 obj = new Construct1("Mike", 22);
        System.out.println("my name is still " + obj.getName() + " and i am " + obj.getAge() + " years old");
    }
}
