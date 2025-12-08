// We are going to implement the inner class in Java

class Outer
{
    public void show()
    {
        System.out.println("in Outer class show");
    }
    class Inner
    {
        public void show()
        {
            System.out.println("in inner class show");
        }
    }
}
public class innerClass {
    public static void main(String a[])
    {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();     // you can make the inner class static to use "Outer.Inner" and eliminate the "Obj." to directly create the object
        obj1.show();
    }
}
