// implementing the Comparable interface with our custom class to enable passing the custom object to sort() and still perform the sorting

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// implement the Comparable interface and pass the class name to it
class AStudent implements Comparable<AStudent>
{
    int age;
    String name;

    // create constructor that accepts the 2 variables and assigns values to them
    public AStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // create toString() object that returns the String format of the object
    public String toString() {
        return "AStudent [age=" + age + ", name=" + name + "]";
    }

    // we must implement the abstract method "compareTo()"
    public int compareTo(AStudent that)
    {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Comparators2 {
    public static void main(String a[])
    {
        List<AStudent> studs = new ArrayList<>();
        studs.add(new AStudent(24, "Mike"));
        studs.add(new AStudent(36, "Samuel"));
        studs.add(new AStudent(43, "Juliet"));
        studs.add(new AStudent(27, "Victor"));
        studs.add(new AStudent(53, "Joan"));

        // sort the ArrayList() items
        Collections.sort(studs);

        for(AStudent s : studs)
            System.out.println(s);
    }
}
