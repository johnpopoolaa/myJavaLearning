// Implementing an anonymous inner class

class Concrete
{
    public void show1()
    {
        System.out.println("in Concrete show1");
    }
}

// creating abstract class for an anonymous class to implement

abstract class AbsClass
{
    public abstract void absShow();
}

public class anonInnerClass {
    public static void main(String a[])
    {
        Concrete obj = new Concrete()
        // create the anonymous class
        {
            public void show1()
            {
                System.out.println("in Anonymous show1");
            }
        };
        obj.show1();

        // create an anonymous class to instantiate abstract class
        AbsClass obj1 = new AbsClass()
        {
            public void absShow()
            {
                System.out.println("in abstract show");
            }
        };
        obj1.absShow();
    }
}
