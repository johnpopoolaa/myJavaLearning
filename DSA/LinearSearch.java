// Searching a sorted array via linear search and count how many steps used

package DSA;

public class LinearSearch {
    public static void main(String A[])
    {
        int nums[] = {3,5,6,7,9}; // create the array
        int target = 5; // setting the element to search for

        int result = linearSearch(nums, target); // store the index of the element in the array after comparing the number to the target

        if(result != -1) // if the result which is 1 or -1(from linearSearch) isn't -1
            System.out.println("Element found at index: " + result); // print the index of the number
        else
            System.out.println("Element not found.");
    }

    public static int linearSearch(int[] nums, int target) { // make the method public, return an integer value and accept array nums and integer target.
        int steps = 0;
        for(int i=0;i<nums.length;i++) // condition to make sure the check is made throughout the array
        {
            steps++;
            if(nums[i] == target) // check if the current element is the target
            {
                System.out.println("Steps taken by linear: " + steps);
                return i; // return the element if it is the element
            }
        }
        System.out.println("Steps taken by linear: " + steps);
        return -1; // return -1 if the element wasn't found
    }
}