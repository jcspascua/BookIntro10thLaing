
public class PracticeAddingMethod {
	public Integer AddTwo (int a, int b) {
		return a + b;
	}
	
	public static void main (String[] args) {
		PracticeAddingMethod pam = new PracticeAddingMethod();
		System.out.println(pam.AddTwo(1, 2));
	}

}
