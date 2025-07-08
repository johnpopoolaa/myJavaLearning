// binary searching with a recursion

package DSA;

public class BinarySearch02 {
    public static void main(String A[])
    {
        int nums[] = new int[1000];
        int target = 300;

        int result = binarySearch(nums, target, 0, nums.length-1); // assign the value of left and right when the method is called

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] nums, int target, int left, int right) { // create the start and end point in the function template
        if(left <= right) // loop to keep the code running
        {
            int mid = (left + right)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearch(nums, target, mid+1, right); // update the value of left to 1 after the previous mid if the mid number is less than the target
            else
                return binarySearch(nums, target, left, mid-1); // update the value of right to 1 before the previous mid if the mid number is less than the target
        }
        return -1;
    }
}
