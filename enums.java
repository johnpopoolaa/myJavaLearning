// enumeration in java

enum Status // enum acts as class
{
    Running, Failed, Paused, Pending, Success; // enum objects
}

public class enums {
    public static void main(String a[])
    {
        Status[] ss = Status.values();
        for(Status s : ss) // advanced for loop to print all the values of the enum
        {
            System.out.println(s + " : " + s.ordinal()); // printing of the enum value and the index in the enum
        }
    }
}
