package Chris.Chapter13.Exception;
// HW13_4 

public class HW13_5 {
	public static void main(String args[]) {
		int num = 12;
		int den[] = { 12, 8, 3, 8, 8, 4 };
		try {
			for (int i = 0; i < 10; i++) {

				System.out.println("ans=" + num / den[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("陣列索引值超出了範圍");
		} catch (ArithmeticException v) {
			System.out.println("除數為0");
		}

	}
}
