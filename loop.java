public class loop {
    public static void main(String a[])
    {
        // while loop
        int i = 1; // initialization
        while(i<=5) // condition
        {
            System.out.println("Are you good? " + i);
            int j = 1; // initialization
            while(j<=2) // condition
            {
                System.out.println("You've got to take care of yourself " + j);
                j++; // increment
            }
            i++; // increment
        }

        // do-while loop
        int d = 5;
        do
        {
            System.out.println("Have you checked this? " + d);
            d++;
        } while(d<=3);
    }
}