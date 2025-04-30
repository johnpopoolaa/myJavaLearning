// optimizing "Comparators1.java" with lambda and ternary expressions

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BStudent{
    int age;
    String name;

    public BStudent(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Comparators3 {
    public static void main(String a[])
    {
        Comparator<BStudent> com = (BStudent i, BStudent j) -> // reduced chunk of code to a lambda expression
        {
            return i.age > j.age? 1: -1; // reduced chunk of code with ternary expression
        };

        List<BStudent> studs = new ArrayList<>();
        studs.add(new BStudent(54, "Mark"));
        studs.add(new BStudent(38, "Emmanuel"));
        studs.add(new BStudent(14, "Arielle"));
        studs.add(new BStudent(18, "Dorcas"));
        studs.add(new BStudent(21, "Usman"));

        Collections.sort(studs, com);
        
        for(BStudent s : studs)
            System.out.println(s);
    }
}
