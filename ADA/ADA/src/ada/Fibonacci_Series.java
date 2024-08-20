package ada;

import java.util.Scanner;

public class Fibonacci_Series {
	static int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we to print Fibonacci series upto:");
		int count = sc.nextInt();
		System.out.println("printing Fibonacci series upto:");
		for (int i = 0; i < count; i++) {
			System.out.print(Fibonacci(i)+"");

		}
		int sum =0;
		for (int i = 0; i < count; i++) {
			sum=sum+ Fibonacci(i);
			
		}
		System.out.println("");

		System.out.println("Sum ="+sum);
		
		
		// Search for a number
				System.out.println("\nEnter the number to search :");
				int num = sc.nextInt();
				boolean found = false;
				for (int i = 0; i < count; i++) {
					if (num == Fibonacci(i)) {
						System.out.println("Index = " + i);
						found = true;
						break; //
					}
				}
				if (!found) {
					System.out.println("Not Found");
				}

	}

}
