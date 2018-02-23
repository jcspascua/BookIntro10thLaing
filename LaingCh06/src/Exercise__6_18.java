import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise__6_18 {
	private static java.util.Scanner input;
	
	//checkEight() method checks if the password has eight strings
	public static boolean checkEight(String password){
		char s;
		String string;
		List<String> arrayList = new ArrayList<>();
		for(int i = 0; i<password.length();i++) {
			s = password.charAt(i);
			string = Character.toString(s);
			arrayList.add(string);
		}
		
		if (arrayList.size() >= 8) {
			return true;
		} else {
			return false;
		}
	}
	
	//only letters and digits
	//need to understand the ASCII codes
	public static boolean onlyLettersAndDigits(String password) {
		char s;
		String string;
		List<String> arrayList = new ArrayList<>();
		int k = 0;
		for(int i = 0; i<password.length();i++) {
			s = password.charAt(i);
			if (Character.isDigit(s) || Character.isLetter(s) ) {
				string = Character.toString(s);
				arrayList.add(string);
			}
			k++;
		}
		
		if (arrayList.size() == k) {
			return true;
		} else {
			return false;
		}
	}
	
	//minimumTwo() method returns true if the password has a least two digits
	public static boolean minimumTwoDigits(String password) {
		char s;
		List<Integer> digitList = new ArrayList<>();
		for(int i = 0; i<password.length();i++) {
			s = password.charAt(i);
			//Character.isDigit(string.charAt(index)) (JavaDoc) will return true if it's a digit
			//Character.isLetter(string.charAt(index))  (JavaDoc) will return true if it's a letter
			if (Character.isDigit(s) == true) {
				digitList.add((int) s);
			}
		}
		
		if (digitList.size() >= 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		//get user input
		System.out.print("Enter a password: ");
		input = new Scanner(System.in);
		String password = input.nextLine();

		if (checkEight(password) == true && onlyLettersAndDigits(password) == true && minimumTwoDigits(password) == true) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}

}
