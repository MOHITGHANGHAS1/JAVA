package ada;


import java.util.Arrays;

//import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] b = {11,12,22,25,64 };
		Arrays.sort(b);
		

		System.out.println("AT INDEX: " + Search(b, 22));
	}

	static int Search(int[] a, int target) {
		int start = 0, end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
