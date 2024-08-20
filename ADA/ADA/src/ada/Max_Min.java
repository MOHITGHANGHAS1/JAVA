package ada;
import java.util.Scanner;
public class Max_Min {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] numbers =new int[10];
		System.out.println("Enter the Number U Want to enter");
		for(int i=0;i<10;i++) {
			System.out.println("Enter the number"+(i+1)+":");
			numbers[i]= sc.nextInt(); 
		}
		int max=forMax(numbers);
		int min = forMin(numbers);
		System.out.println("The maximum number is"+max);
		System.out.println("The minimum number is"+min);
		
		
		

	}
	public static int forMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int forMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
