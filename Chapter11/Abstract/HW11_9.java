package Chris.Chapter11.Abstract;

// HW11_9, 多重繼承的練習
interface Math5 {
	void show();

	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

interface AdvancedMath {
	public void mod(int a, int b); // 計算 a%b

	public void fac(int a); // 計算 a!

	public void pow(int a, int b); // 計算ab
}

class Compute5 implements Math5, AdvancedMath {
	int ans;
	@Override
	public void mod(int a, int b) {
		ans=a%b;
		
	}

	@Override
	public void fac(int a) {
		ans=1;
		for(int i=1;i<=a;i++) {
			ans*=i;
		}
		
	}

	@Override
	public void pow(int a, int b) {
		ans=(int) java.lang.Math.pow(a, b);
		
	}

	@Override
	public void show() {
		System.out.println(ans);
		
	}

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

public class HW11_9 {
	public static void main(String args[]) {
		Compute5 cmp = new Compute5();
		cmp.mul(3, 5);
		cmp.show(); // 此行會回應 "ans=15" 字串
		cmp.mod(14, 5);
		cmp.show(); // 此行會回應 "ans=4" 字串
		cmp.fac(5);
		cmp.show(); // 此行會回應 "ans=120" 字串

	
	}
}


