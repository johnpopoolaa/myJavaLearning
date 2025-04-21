// demonstrating lambda expressions with functional interfaces(SAM)

@FunctionalInterface // annotation to indicate that this is a functional interface
interface Big
{
    void show(int i);
}

public class lambdaSam {
    public static void main(String a[])
    {
        Big obj = i -> System.out.println("in show : " + i); // lambda expression
        obj.show(10);
    }
}