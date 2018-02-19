import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* use the reverse method to 
 *  implement isPalindrome. A number is a Palindrome if its reversal is the same as itself. 
 *  Write a test program that prompts the user to enter an integer and reports whether the 
 *  integer is a Palindrome 
 */
public class Exercise_6_3 {
	private static List<Integer> reverseNumArrays = new ArrayList<>();
	private static java.util.Scanner userInput;
	private static boolean bool;
	private static int reverseNum;

	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int a = number;
		int b;
		int i = 0;
		while (a > 0)  {
			b = a % 10; // example: a = 432, so here b == 432 % 10 == 2. 
			reverseNumArrays.add(b);
			a = a / 10;
			i += 1;
		}
		int k = reverseNumArrays.size() - 1;
		for (int j = 0; j < reverseNumArrays.size(); j++) {
			reverseNum = reverseNum + reverseNumArrays.get(j) * (int) Math.pow(10, k);
			k = k - 1;
		}
//		System.out.println("We are in the reverse method");
//		System.out.println("reverseNum = " + reverseNum);
		return reverseNum;
	}
	
	// Return true if number is a Palindrome
	public static boolean isPalindrome(int number) {
		if (number == reverseNum) {
			bool = true;
		} else {
			bool = false;
		}
//		System.out.println("We are in the isPalindrome method");
		return bool;
	}
	
	public static void main (String[] args) {
		String yesOrNo = "Error";
		System.out.print("Enter a possible palindrome number: ");
		userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		System.out.println("This is the number reversed: " + reverse(number));
		if (isPalindrome(number) == true ) {
			yesOrNo = "yes";
		} else {
			yesOrNo = "no";
		}
		System.out.println("Is this a Palindrome? : " + yesOrNo);

	}
}
