// using Comparator to specify conditions to sort your Collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String a[])
    {
        // create a comparator to compare integer values
        Comparator<Integer> com = new Comparator<>() {
            public int compare(Integer i, Integer j)
            {
                if(i % 10 > j % 10) // condition to check for the greater number ending the integer
                    return 1; // swap the values in the array
                else
                    return -1; // leave the value where it is
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(32);
        nums.add(46);
        nums.add(83);
        nums.add(74);
        nums.add(19);

        Collections.sort(nums, com); // sorting the Collection based on our condition

        System.out.println(nums);

        // create a comparator to compare Strings
        Comparator<String> coms = new Comparator<>() {
            public int compare(String s1, String s2)
            {
                return Integer.compare(s1.length(), s2.length()); // compare the strings and print the one with the shorter length first.
                // Note that if we use "s2.length" first, we are going to be reversing the process and print the longest strings first
            }
        };

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Micheal");
        names.add("Augustine");
        names.add("Chioma");
        names.add("Fikayo");
        names.add("Augusta");

        Collections.sort(names, coms); // sort the collection based on our condition

        System.out.println(names);
    }
}
