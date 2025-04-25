// try with resources - using try without finally to close a resource

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryNoFinally {
    public static void main(String a[]) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // this would automatically close the resource
        {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println("our num value is: " + num);
        }
    }
}
