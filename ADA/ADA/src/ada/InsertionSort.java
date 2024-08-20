package ada;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position in the sorted sublist
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);

        System.out.print("Insertion Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//Best Case: O(n) - occurs when the list is already sorted.
//Worst Case: O(n^2)
//Average Case: O(n^2)