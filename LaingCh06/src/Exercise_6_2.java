import java.util.Scanner;

public class Exercise_6_2 {
	public static int sumDigits(long n) {
		int num = 0;
		while (n > 0) {
			long i = n % 10;
			n = n / 10;
			num = num + (int) i;
		}
		return num;
	}
	
	public static void main (String[] args) {
		System.out.print("Enter: "); 
		java.util.Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int answer = sumDigits(i);
		System.out.println("Sum of digits of " + i + " is: " + answer);
	}
}
