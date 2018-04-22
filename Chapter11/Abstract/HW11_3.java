package Chris.Chapter11.Abstract;
//編譯的錯誤訊息是指 Math 是抽象的，無法實體化。也就是說 Math 是抽象類別，沒辦
//法利用 Math 建立物件。
abstract class Math1 {
	protected static  int ans;

	public static void show() {
		System.out.println("ans=" + ans);
	}

	public abstract void add(int a, int b); // 計算 a+b

	public abstract void sub(int a, int b); // 計算 a-b

	public abstract void mul(int a, int b); // 計算 a*b

	public abstract void div(int a, int b); // 計算 a/b
}

class Compute1 extends Math1 {

	@Override
	public void add(int a, int b) {
		ans=a+b;
		
	}

	@Override
	public void sub(int a, int b) {
		ans=a-b;
		
	}

	@Override
	public void mul(int a, int b) {
		ans=a*b;
		
	}

	@Override
	public void div(int a, int b) {
		ans=a/b;
		
	}
	
}

public class HW11_3 {
	public static void main(String args[]) {
		
		Compute cmp = new Compute();
		cmp.mul(3, 5); // 計算 3*5
		cmp.show(); // 此行會回應 "ans=15" 字串
	}
}

