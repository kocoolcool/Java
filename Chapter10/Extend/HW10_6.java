package Chris.Chapter10.Extend;

class CTriangle {
	protected int base;
	protected int height;
	CTriangle(){
		this(3,8);
	}
	CTriangle(int e, int f) {
		base = e;
		height = f;
	}

	protected void show() {
		System.out.println("base=" + base + ", height=" + height);
	}
}

class CData1 extends CTriangle {
	public void area() {
		show();
		System.out.println("area=" + base * height / 2.0);
	}
}

public class HW10_6 {
	public static void main(String args[]) {
		CData1 object = new CData1();
		object.area();
	}
}