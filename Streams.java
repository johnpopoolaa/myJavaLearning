// Using a stream to alter a list without changing the data in the list

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Streams {
    public static void main(String a[])
    {
        List<Integer> nums = Arrays.asList(5, 6, 2, 9, 8, 5, 3);

        Stream<Integer> s1 = nums.stream(); // created the stream
        Stream<Integer> s2 = s1.filter(n -> n%2==0); // filter the stream to print even numbers only
        Stream<Integer> s3 = s2.map(n -> n*2); // map the stream data to multiply each even number by 2
        int result = s3.reduce(0, (c,e) -> c+e); // reduce the mapped data by adding them together and store in a variable

        System.out.println(result);
    }
}
