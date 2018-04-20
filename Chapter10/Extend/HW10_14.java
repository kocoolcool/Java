package Chris.Chapter10.Extend;

class AA {
	public AA() {
		num1 = 1;
		num2 = 1;
	}

	public AA(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int num1;
	public int num2;
}

class BB extends AA {
	public BB() {
	}

	public BB(int a, int b) {
		super(a, b);
	}

	public void set_num(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public void show() {
		System.out.println("num1=" + num1 + "  num2=" + num2);
	}
}

public class HW10_14 {

	public static void main(String[] args) {

	
		Cbbb b2 = new Cbbb(3, 9);
	
		b2.show();

	}
}
