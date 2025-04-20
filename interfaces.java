// implementing interfaces

interface Computer
{
    void code();
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run - faster");
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Developer
{
    public void develop(Computer desk) // initializing developer method with argument to pass to it
    {
        desk.code(); // task the method should perform
    }
}

public class interfaces {
    public static void main(String a[])
    {
        Computer desk = new Desktop(); // creating desktop object with computer(interface) reference
        Computer lap = new Laptop(); // creating laptop object with computer(interface) reference

        Developer john = new Developer(); // creating developer object
        john.develop(desk); // passing desktop argument to developer
        john.develop(lap); // passing laptop argument to developer
    }
}
