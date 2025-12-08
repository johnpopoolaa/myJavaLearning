// creating a custom class to work with comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// create custom class
class Students
{
    int age;
    String name;

    // create constructor to assign the values to variables
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // create toString()
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }    
}
public class Comparators1 {
    public static void main(String a[])
    {
        Comparator<Students> com = new Comparator<>() // pass <Students> to comparator
        {
            public int compare(Students i, Students j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Students> stud = new ArrayList<>();
        stud.add(new Students(24, "Mercy"));
        stud.add(new Students(19, "John"));
        stud.add(new Students(31, "Winner"));
        stud.add(new Students(61, "Alex"));
        stud.add(new Students(16, "Promise"));

        
        Collections.sort(stud, com);

        for(Students s : stud)
            System.out.println(s);
    }
}
