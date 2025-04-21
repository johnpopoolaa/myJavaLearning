// Handling exceptions in Java

public class Exceptions {
    public static void main(String a[])
    {
        int d = 0;
        int b = 0;

        try
        {
            b = 121/d;
            System.out.println("code run smoothly, result of 121" + "/" + d + " = " + b);
        }
        catch(Exception e)
        {
            System.out.println("Error while running...");
            System.out.println("bye");
        }
    }
}
