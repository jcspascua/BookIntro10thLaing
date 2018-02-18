import java.lang.reflect.Array;

public class AddNumBetween {
	private int aOfObject;
	private int bOfObject;
	
	public int addAllNumBetween (int a, int b) {
		int result = 0;
		if (a < b) {
			this.aOfObject = a;
			this.bOfObject = b;
		} else {
			this.aOfObject = b;
			this.bOfObject = a;
		}
		for (int i = aOfObject; i <= bOfObject; i++)
			result += i;
		return result;
	}
	
	public static void main (String[] args) {
		AddNumBetween anb = new AddNumBetween();
		System.out.println(anb.addAllNumBetween(10, 1));
	}

}
