// demonstrating lambda expressions with functional interfaces(SAM)

@FunctionalInterface // annotation to indicate that this is a functional interface
interface Big
{
    void show(int i);
}

interface A
{
    int add(int i, int j);
}

public class lambdaSam {
    public static void main(String a[])
    {
        Big obj = i -> System.out.println("in show : " + i); // lambda expression
        obj.show(10);

        A obj1 = (i, j) -> i + j;
        int result = obj1.add(10, 7);
        System.out.println("result: " + result);
    }
}