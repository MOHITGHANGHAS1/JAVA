package ada;

import java.util.Scanner;

public class Factorial1 {

	static int Factorial(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n * Factorial(n - 1);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("we to print Factorial of :");
		int n = sc.nextInt();
		System.out.println("printing Factorial of:" + n);

		System.out.println("Factorial of" + n + "is " + Factorial(n));
		;

	}

}
