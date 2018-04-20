package Chris.Chapter10.Extend;

class EE {
	protected int base;
	protected int height;
	EE(){
		this(1,1);
	}
	EE(int e, int f) {
		base = e;
		height = f;
	}

	protected void show() {
		System.out.println("base=" + base + ", height=" + height);
	}
}

class DD extends EE {
	DD(){
		super();
	}
	public void area() {
		show();
		System.out.println("area=" + base * height / 2.0);
	}
}

public class HW10_15 {
	public static void main(String args[]) {
		DD object = new DD();
		object.area();
	}
}