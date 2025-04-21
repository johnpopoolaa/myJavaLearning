// Handling exceptions in Java

public class Exceptions {
    public static void main(String a[])
    {
        int d = 11;
        int b = 0;

        try
        {
            b = 121/d;
        }
        catch(Exception e)
        {
            System.out.println("Error while running...");
        }

        System.out.println("code run smoothly, result of 121" + "/" + d + " = " + b);
    }
}
