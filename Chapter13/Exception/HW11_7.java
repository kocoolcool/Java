package Chris.Chapter13.Exception;

public class HW11_7 {
	public static int test() throws  ArithmeticException{
		int num = 12, den = 0;
		int ans = num / den;
		return ans;
	}

	public static void main(String[] args) {
		try {
		System.out.println(test());
		System.out.println("end of main() method !!");
		}
		catch(ArithmeticException e) {
			System.out.println("Have Exception");
		}
		}
}
