// Searching a sorted array via binary search and count how many steps used

package DSA;

public class BinarySearch01 {
    public static void main(String A[])
    {
        int nums[] = {2,5,6,7,9,11,13}; // create the array
        int target = 11; // set the target to be searched for in the array

        int result = binarySearch(nums, target); // compare the elements in the array with the target

        if(result != -1) // check if result from binarySearch is not equal to -1, i.e. the element was in the array
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0; // set starting point(with index)
        int right = nums.length-1; // set end point(1 less than the length of the array because of indexing)

        while(left <= right) // condition to keep the check going as far as there are unchecked elements
        {
            steps++;
            int mid = (left + right)/2; // set a midpoint

            if(nums[mid] == target) // check if the element at the midpoint is equal to the searched number
            {
                System.out.println("Steps taken by binary: " + steps);
                return mid; // return the element at the midpoint if it is equal to the element being searched for
            }
            else if (nums[mid] < target) // check if the value at the midpoint is less than the target
            {
                left = mid + 1; // move the start element to after the previous midpoint
            }
            else // check if the value of the midpoint is greater than the element being searched for
                right = mid - 1; // move the end element to one before the previous mid element to search the left side
        }
        System.out.println("Steps taken by binary: " + steps);
        return -1; // return -1 if the element is not in the array
    }
}