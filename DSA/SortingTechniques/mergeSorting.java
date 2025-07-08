// sorting with merge sort

package DSA.SortingTechniques;

public class mergeSorting {
    private static void mergeSort(int[] arr, int l, int r) { // create the mergeSort method
        if(l < r) // condition to keep code running as far as all elements haven't been checked(from left to right)
        {
            int mid = (l+r)/2; // find and create the mid value
            mergeSort(arr, l, mid); // call mergeSort for the first array half
            mergeSort(arr, mid+1, r); // call mergeSort for the second array half

            merge(arr, l, mid, r); // perform merging on the arrays
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) { // create the merge method
        int n1 = mid - l + 1; // create a variable that holds the number of elements in the first array
        int n2 = r - mid; // create a variable that holds the number of elements in the second array

        int lArr[] = new int[n1]; // create the left array and assign the size to that of the variable created above
        int rArr[] = new int[n2]; // create the right array and assign the size to that of the variable created above

        for(int x = 0; x < n1; x++) // for loop to "conquer" the elements in the left half of the array
        {
            lArr[x] = arr[l + x]; // move the values from the main array to the left array
        }

        for(int x = 0; x < n2; x++) // for loop to "conquer" the elements in the right half of the array
        {
            rArr[x] = arr[mid + 1 + x]; // move the values from the main array to the right array
        }

        int i = 0; // create a variable to select the values in the left array
        int j = 0; // create a variable to select the values in the right array
        int k = l; // create a variable for the elements in the merged array

        while(i < n1 && j < n2) // condition to check if the elements in the left and right array have not exceeded the size
        {
            // merging of the arrays happen here
            if(lArr[i] <= rArr[j]) // check if the elements in the left array are less elements in the right array
            {
                arr[k] = lArr[i]; // move the element in the right array to the merged array if condition is met
                i++; // increase the index of the element in the left array
            }
            else // if the element in the right array is less than the element in the left array
            {
                arr[k] = rArr[j]; // move the element in the right array to the merged array instead
                j++; // increase the index of the element in the right array
            }
            k++; // move to the next empty slot in the merged array
        }

        // this code is in case any of the individual arrays has elements that weren't touched till the sorting completed
        while(i < n1) // while the index of the element in the left array is less than the size of the array
        {
            arr[k] = lArr[i]; // move the elements in the left array to the merged array
            i++; // increase the index of the left array so you go through all the elements
            k++; // increase the index of the merged array so all the spaces are filled
        }

        while(j < n2) // while the index of the element in the right array is less than the size of the array
        {
            arr[k] = rArr[j]; // move the elements in the right array to the merged array
            j++; // increase the index of the right array so you go through all the elements
            k++; // increase the index of the merged array so all the spaces are filled
        }
    }

    public static void main(String a[])
    {
        int arr[] = {5,3,9,1,7,13,24}; // create the array

        // print the array before sorting
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1); // call the mergeSort method to perform sorting
        
        // print the array after sorting
        System.out.println("After sorting");
        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }
}