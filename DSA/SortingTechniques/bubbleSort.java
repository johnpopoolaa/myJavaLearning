// Bubble sorting technique

package DSA.SortingTechniques;

public class bubbleSort {
    public static void main(String a[])
    {
        int nums[] = {8,6,9,3,2,4,1};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size; i++) // loop to keep the sort procedure running
        {
            for(int j = 0; j < size - i - 1; j++) // loop to go through all the elements in the array. we are subtracting i and 1 from size so as not to go through sorted elements twice to save time
            {
                if(nums[j] > nums[j + 1]) // check if the first element is greater than the next element in the array
                {
                    temp = nums[j]; // assign the first element to temp
                    nums[j] = nums[j + 1]; // assign the next element to the first element
                    nums[j + 1] = temp; // assign the value of temp(first element) to the next element
                }
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}
