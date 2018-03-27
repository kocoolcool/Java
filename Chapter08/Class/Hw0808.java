package Chris.Chapter08.Class;

class CTest1 {
	public String test(int a) {
		if (a == 0)
			return "此數為0";
		else if (a >= 0)
			return "此數為正數";
		else
			return "此數為負數";
	}
}

public class Hw0808 {

	public static void main(String[] args) {
		CTest1 input=new CTest1(); 
		System.out.println(input.test(-4));
		System.out.println(input.test(8));
		System.out.println(input.test(0));
	}

}
