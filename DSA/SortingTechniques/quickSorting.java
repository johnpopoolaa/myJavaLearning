// sorting an array with Quick sort

package DSA.SortingTechniques;

public class quickSorting {
    public static void quickSort(int[] arr, int low, int high) // create the class to call the method
    {
        if(low<high)
        {
            int pi = partition(arr, low, high); // pass the value returned from the partition method to pi(i + j)

            quickSort(arr, low, pi - 1); // sort tone half of the divided array
            quickSort(arr, pi + 1, high); // sort the other half of the divided array
        }
    }

    private static int partition(int[] arr, int low, int high) { // create the partition method and accept the values arr, low and high
        int pivot = arr[high]; // make the element at the high index be the pivot
        int i = low - 1; // let i be 1 less than the low index

        for(int j = low; j < high; j++) // condition to keep the code running as far as j starts from index low and less than high
        {
            if(arr[j] < pivot) // if the element at index j is less than the pivot
            {
                i++; // increment i
                int temp = arr[i]; // move the element at index i to a temporary variable
                arr[i] = arr[j]; // move the element at index j to the index i
                arr[j] = temp; // move the temporary variable to the element at index j
            }
        }

        int temp = arr[i + 1]; // store the element at the index of i + 1 in a temporary variable
        arr[i + 1] = arr[high]; // move the value at index high to the value at index of i + 1
        arr[high] = temp; // assign the value of temp to the element at high

        return i + 1; // return the value of i + 1
    }

    public static void main(String a[])
    {
        int arr[] = {7,3,5,1,302,56,21,58,14};
        quickSort(arr, 0, arr.length - 1); // low is set to the first element in the array while high is set to the last element in the array
        for(int num : arr)
        {
            System.out.print(num + " "); // print all the elements in the array
        }
    }
}
