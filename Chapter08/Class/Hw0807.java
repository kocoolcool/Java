package Chris.Chapter08.Class;

class CTest {
	public String test(int a) {
		if (a == 0)
			return "此數為0";
		else if (a % 2 == 0)
			return "此數為偶數";
		else
			return "此數為奇數";
	}
}
	public class Hw0807 {

	public static void main(String[] args) {
		
		CTest input=new CTest(); 
		System.out.println(input.test(3));
		System.out.println(input.test(8));
		System.out.println(input.test(0));
	}

}
