// sorting an array with Insertion sort

package DSA.SortingTechniques;

public class insertionSort {
    public static void main(String a[])
    {
        int nums[] = {4,6,2,1,8,9,3};

        for(int i = 1; i < nums.length; i++) // use i = 1 because we are comparing the second index in the array[1] to the first[0]
        {
            int key = nums[i]; // assign the value at index i to key
            int j = i - 1; // make j(comparator) to be the element before i

            while (j >= 0 && nums[j] > key) // condition to compare the elements, j(used to track the current index), in the array @j to "key"
            {
                // run code if condition is satisfied
                nums[j + 1] = nums[j]; // move the number at the index of "j" to "j + 1"
                j--; // decrement j to check the previous element in the array
            }
            nums[j + 1] = key; // update t
        }

        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}
