// using Map collection in Java

import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String a[])
    {
        Map<String, Integer> students = new HashMap<>(); // created the map object with HashMap()
        // assigning values to the map object with ".put()" to give a new value(one that doesn't exist before) to the map
        students.put("John", 85);
        students.put("Augustine", 94);
        students.put("Fikayo", 98);
        students.put("Joseph", 89);
        students.put("Chioma", 99);

        for(String keys : students.keySet()) // use to get the keys in the map
        {
            System.out.println(keys + ": " + students.get(keys)); // printed the keys with their values
        }
    }
}
