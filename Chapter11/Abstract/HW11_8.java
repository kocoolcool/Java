package Chris.Chapter11.Abstract;

// HW11_8
interface iAaa {
	public void show();
}

class Cbbb {
	public int num = 10;

	public void set(int n) {
		num = n;
	}
}

class Ccc extends Cbbb implements iAaa {
	public void set(int n) {
		num = n;
	}

	@Override
	public void show() {
		System.out.println("num=" + num);

	}

}

public class HW11_8 {
	public static void main(String args[]) {
		Ccc cc = new Ccc();
		cc.set(5);
		cc.show(); // 印出 num=5
	}
}
