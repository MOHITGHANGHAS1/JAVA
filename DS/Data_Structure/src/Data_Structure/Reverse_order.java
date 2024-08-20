package Data_Structure;

import java.util.Random;
import java.util.Scanner;

public class Reverse_order {
	public static void main(String[] args) {
		Random rand = new Random(100);
		Scanner sc = new Scanner(System.in);
		int[] arg = new int[1000000];
		System.out.println("Enter the number of elemennts : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arg[i] = rand.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arg[i]);
        }
        System.out.println("Reverse order");
        for (int i = n-1; i >=0; i--) {
            System.out.println(arg[i]);
        }

	}
}
