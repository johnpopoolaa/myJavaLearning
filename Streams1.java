// reducing the stream code to enhance readability and utilize storage

import java.util.Arrays;
import java.util.List;

public class Streams1 {
    public static void main(String a[])
    {
        List<Integer> nums = Arrays.asList(4, 3, 4, 9, 11, 2, 6, 3, 8);

        int result = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c,e) -> c + e);

        System.out.println(result);
    }
}
