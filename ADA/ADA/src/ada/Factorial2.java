package ada;
import java.util.Scanner;
public class Factorial2 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		System.out.println("Factorial using iteration of " + n + " is: " + FactorialPatternIterative(n));
	}


	static int FactorialPatternIterative(int n) {
		int mul = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int i = n; i >= 1; i--) {
				mul *= i;
			}
			return mul;
		}
	}

}

