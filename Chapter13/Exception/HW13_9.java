package Chris.Chapter13.Exception;

// HW13_9,
class Ctest1

{
	public  void aaa(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println(a + "/" + b + "=" + c);
	}
}

public class HW13_9 {
	public static void main(String args[]) {
		try {
			Ctest1 t=new Ctest1();
			t.aaa(4, 0);
		} catch (ArithmeticException e) {
			System.out.println(e + " throwed");
		}
	}
}
