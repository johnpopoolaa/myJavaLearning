// optimizing "Comparators3.java" by making lambda and ternary expressions to be on a single line

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CStudent{
    int age;
    String name;

    public CStudent(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Comparators4 {
    public static void main(String a[])
    {
        Comparator<CStudent> com = (CStudent i, CStudent j) -> i.age > j.age? 1: -1; // we reduced the chunk of the code to on line since the return statement was only a single line

        List<CStudent> studs = new ArrayList<>();
        studs.add(new CStudent(54, "Mark"));
        studs.add(new CStudent(38, "Emmanuel"));
        studs.add(new CStudent(14, "Arielle"));
        studs.add(new CStudent(18, "Dorcas"));
        studs.add(new CStudent(21, "Usman"));

        Collections.sort(studs, com);
        
        for(CStudent s : studs)
            System.out.println(s);
    }
}
