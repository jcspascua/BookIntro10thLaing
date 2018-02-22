import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * (Display matrix of 0s and 1s) Write a method that displays 
 * an n-by-n matrix using the following header:
 * public static void printMatrix(int n)
 * 
 * Each element is 0 or 1, which is generated randomly. 
 * Write a test program that prompts the user to enter 
 * n and displays an n-by-n matrix. Here is a sample run:
 */
public class Exercise_6_17 {
	public static void printMatrix(int n) {
		int n2 = n * n;
		
		// create list array with length of n2
		List<Integer> arrayList = new ArrayList<>();
		
		// for loop to add to the arrayList
		for (int i = 0; i < n2; i++ ) {
			
			// place in each element a random 0 or 1
			arrayList.add((int)(Math.random()*2));
		}
		
		//print a matrix
		int j = 1;
		do {
			if (j % n == 0 && j != 1) { // 4 ÷ 2 remainder = 0
				System.out.println(arrayList.get(j-1));
				j++;
			} else {
				System.out.printf(arrayList.get(j-1) + " ");
				j++;
			}
		} while(j < (n2 + 1));
	}
	

	public static void main(String[] args) {
		System.out.print("Enter n: ");
		java.util.Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);

	}

}
