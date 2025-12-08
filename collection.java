import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class collection {
    public static void main(String a[])
    {
        Collection<Integer> nums0 = new ArrayList<Integer>(); // creating a reference of collection but object of ArrayList
        nums0.add(2);
        nums0.add(4);
        nums0.add(6);
        nums0.add(8);
        nums0.add(10);
        nums0.add(12);

        for(int n : nums0)
            System.out.println(n);
        
        System.out.println("collection ArrayList printed");
        System.out.println();
        
        List<Integer> nums1 = new ArrayList<Integer>(); // creating object with List and ArrayList
        nums1.add(3);
        nums1.add(7);
        nums1.add(11);
        nums1.add(15);
        nums1.add(17);
        nums1.add(23);

        // printing the values line by line
        for(int n : nums1)
            System.out.println(n);

        System.out.println("List ArrayList printed");
        System.out.println();
        
        Set<Integer> nums2 = new HashSet<Integer>(); // creating a HashSet Set object
        // HashSet gives you randomized values and you cannot repeat a value with Set
        nums2.add(11);
        nums2.add(32);
        nums2.add(53);
        nums2.add(74);
        nums2.add(95);
        nums2.add(116);

        for(int n : nums2)
            System.out.println(n);

        System.out.println("Set HashSet printed");
        System.out.println();

        Set<Integer> nums3 = new TreeSet<Integer>(); // creating a TreeSet object with Set instance
        // TreeSet gives you ordered values
        nums3.add(31);
        nums3.add(77);
        nums3.add(11);
        nums3.add(29);
        nums3.add(18);
        nums3.add(22);
        // we can print the values from our collection with an iterator
        Iterator<Integer> values = nums3.iterator();
        while(values.hasNext()) // checks if we have a next element
            System.out.println(values.next()); // prints the next value of the iterator

        System.out.println("Set TreeSet printed with an iterator");
        System.out.println();
    }
}
