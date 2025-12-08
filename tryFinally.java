// using the finally block

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryFinally {
    public static void main(String a[]) throws IOException
    {
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println("our num value is: " + num);
        }
        finally // we can use try without the catch block if we use finally
        {
            br.close(); // we  use finally to close our buffered reader resource
        }
    }
}
