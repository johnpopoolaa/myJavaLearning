// creating an object in java
class calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class oop {
    public static void main(String a[])
    {
        int i = 2;
        int j = 6;

        calculator call = new calculator();
        int result = call.add(i,j);

        System.out.println(result);
    }    
}
