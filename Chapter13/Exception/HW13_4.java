package Chris.Chapter13.Exception;
// HW13_4 

public class HW13_4 {
	public static void main(String args[]) {
		int num = 12;
		int den[] = { 12, 8, 3, 8, 8, 4 };

		for (int i = 0; i < 10; i++) {
			if (den[i] == 0 || den.length <= i) {
				
				System.out.println("程式執行有誤");
				break;
			} else
				System.out.println("ans=" + num / den[i]);
		}
	}
}
