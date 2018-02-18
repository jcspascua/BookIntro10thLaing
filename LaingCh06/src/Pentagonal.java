	/*
	 * Example 1:
	 * 
	 * Suppose you are asked to write method that returns a
	 * pentagonal number. A pentagonal number is defined as
	 * n(3n–1)/2 for n  1, 2, . . ., and so on. Therefore, the
	 * first few numbers are 1, 5, 12, 22, . . ..
	 * 
	 * Write a method with the following header that returns a
	 * pentagonal number:
	 * 
	 * public static int getPentagonalNumber(int n)
	 * 
	 * Write a test program that uses this method to display the
	 * first 100 pentagonal numbers with 10 numbers on each
	 * line.
	 */
public class Pentagonal {
	private int counter = 0;
	public static int getPentagonalNumber(int n) {
		int result = n*(3*n-1)/2;
		return result;
	}
	
	public static void main (String[] args) {
		Pentagonal pen = new Pentagonal();
		// for loop
		for (int i = 1; i<=100; i++) 
			if (i%10 == 0) {
				System.out.println("("+ i + ")" + getPentagonalNumber(i+1) + ", ");
			} else {
				System.out.print("("+ i + ")" + getPentagonalNumber(i+1) + ", ");
			}
		
	}
}
