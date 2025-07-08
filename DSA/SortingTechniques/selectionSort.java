// sorting an array with Insertion sort

package DSA.SortingTechniques;

public class selectionSort {
    public static void main(String a[])
    {
        int nums[] = {7,9,4,5,2,8,1}; // array created
        int size = nums.length;
        int temp = 0; // temporary variable to store number to aid swapping the elements in the array
        int minIndex = 0; // create a minimum index variable to update the index of the minimum number

        System.out.println("Before sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size; i++)
        {
            minIndex = i; // make the minimum index to be the value of i(wherever i is at the moment)
            for(int j = i + 1; j < size; j++)
            {
                if(nums[minIndex] > nums[j]) // condition: in the number at the minimum index is greater than the number at the index of j
                    minIndex = j; // change minIndex to j
            }
            temp = nums[minIndex]; // store the element at the minimum index in the temporary variable
            nums[minIndex] = nums[i]; // update the number at the minimum index with the number at index "i"
            nums[i] = temp; // update the element at index "i" with the temporary variable
        }

        System.out.println();
        System.out.println("After sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}
