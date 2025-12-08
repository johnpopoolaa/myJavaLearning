// Handling exceptions in Java

class JohnException extends RuntimeException // creating our own exception
{
    public JohnException(String str) // exception constructor
    {
        super(str);
    }
}

class A
{
    public void show() throws ClassNotFoundException // passes the exception to a parent method
    {
        Class.forName("Calc"); // i initially used 'Demo' but there is a demo.class file in my code so java would think I made a mistake and give a 'NoClassDefFoundError' when we actually have handled the 'ClassNotFound' Exception
    }
}

public class Exceptions {

    static
    {
        System.out.println("Class Loaded");
    }

    public static void main(String a[])
    {
        int b = 0;
        int c = 0;
        int d = 12;
        int f = 0;

        try
        {
            c = 121/b;
            System.out.println("code run smoothly, result of 121" + "/" + d + " = " + b);
        }
        catch(Exception e)
        {
            System.out.println("Error while running...");
            System.out.println("bye");
        }
        System.out.println(c);
        System.out.println();

        // using the throw and throws keyword
        try
        {
            f = 5/d;
            if(f == 0)
                throw new JohnException("We do not want to print 0"); // throw keyword used
        }
        catch(JohnException e)
        {
            f = 5/1;
            System.out.println("we will print a default value: " + e);
        }
        System.out.println(f);

        A obj = new A();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not Found!");
            e.printStackTrace();
        }
    }
}
