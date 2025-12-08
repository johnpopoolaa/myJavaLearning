// getting input from a user
// important note: do not run different input codes at a time, comment out the rest first else, it would run the first and give an exception for all the rest

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String a[]) throws Exception
    {
        // we have multiple ways to get input from a user in java but some are lengthy
        // we would consider various ways
        // 1. system.in.read() method
        System.out.print("Enter a number: "); // requesting a value from the user
        int num = System.in.read(); // setting num to the integer value
        System.out.println(num - 48); // ...in.read prints the ASCII value so we subtract 48 to get the exact value. however, this can only read one character which is not efficient

        // 2. BufferedReader method
        InputStreamReader rd = new InputStreamReader(System.in); // created an input stream reader object to pass to buffered reader
        BufferedReader bf = new BufferedReader(rd); // created our buffered reader object
        System.out.print("Enter a number: ");
        int num1 = Integer.parseInt(bf.readLine()); // converted the readline character to an integer
        System.out.println("using buffered reader, we get: " + num1);

        bf.close(); // BufferedReader is a resource so you have to close your resource to avoid memory leaks etc.

        // 3. Scanner method - very efficient
        Scanner sc = new Scanner(System.in); // scanner object created
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt(); // we used nextInt to request for an integer value
        System.out.println("using scanner, we get our value to be: " + num2);
        
        sc.close(); // close your resources
    }
}
