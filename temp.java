// this is a temporary file
// i wrote this code because i was bored while on a bus

class Temp1
{
    private int i = 495;
    private String s = "four hundred and ninety five";
    public void show(int i, String s)
    {
        System.out.println("The integer and String values have been passed and their value has been given. Integer is " + i + " while string is " + s);
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
}
class Temp2 extends Temp1
{
    public void dontShow()
    {
        System.out.println("there are no arguments passed to this method but it is still a concrete method");
    }
}
public class temp {
    public static void main(String a[])
    {
        Temp1 obj = new Temp1();
        obj.show(50, "big boy");
    }
}