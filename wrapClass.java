// The Wrapper Class concept
public class wrapClass {
    public static void main(String a[])
    {
        // assigning values to a wrapper class object
        // Integer num = new Integer(7);  --> outdated method
        Integer num = 7; // this is the updated method
        System.out.println("we have assigned the value " + num + " to num.");

         // assigning a primitive value to an objectClass value
         int num1 = 8;
         // Integer num2 = new Integer(num1); --> boxing - old method
        Integer num2 = num1; // autoboxing
        System.out.println("the value of the primitive type num1 has been assigned to num2: " + num2 + ".");

        // assigning an objectClass value to a primitive type
        // using num2 above and num3
        // int num3 = num2.intValue(); -> unboxing - old method
        int num3 = num2;  // auto-unboxing
        System.out.println("the objectClass value of num2 has been assigned to the primitive type num3: " + num3 + ".");

        // getting an integer value from a string
        String str = "12";
        int num4 = Integer.parseInt(str); // parsing an integer value
        System.out.println("we have taken the value of the String str and assigned it to an int to give: " + num4);
    }
}