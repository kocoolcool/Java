package Chris.Chapter11.Abstract;

interface iVolume7 {
	public void showData(); // 顯示球體的資料

	public double vol(); // 計算球體積
}

abstract class CSphere7 implements iVolume7 {
	int r;
	final double PI = 3.14;
	protected int x;
	protected int y;

	public void showData() {
		System.out.println("球心:(" + x + "," + y + ")");
		System.out.println("半徑:" + r);
		System.out.println("球體積:" + vol());
	};

	public double vol() {

		return (4.0 / 3 * PI * r * r * r);
	}
};

class CCircle7 extends CSphere7 {

	CCircle7(int a, int b, int c) {
		x = a;
		y = b;
		r = c;
	}

}

public class HW11_14_2 {

	public static void main(String[] args) {

		{
			CCircle7 cir = new CCircle7(8, 6, 2);
			cir.showData();
		}
	}
}