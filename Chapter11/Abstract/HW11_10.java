package Chris.Chapter11.Abstract;
//將第 16 行改寫之後，程式仍然可以執行，而 mod()、fac()與 pow() method 則會變成
//Compute 類別裡自訂的 method，而非實作 AdvancedMath 介面中的 method。
// HW11_9, 多重繼承的練習
interface Math6 {
	void show();

	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

interface AdvancedMath6 {
	public void mod(int a, int b); // 計算 a%b

	public void fac(int a); // 計算 a!

	public void pow(int a, int b); // 計算ab
}

class Compute6 implements Math6 {
	int ans;
	
	public void mod(int a, int b) {
		ans=a%b;
		
	}

	
	public void fac(int a) {
		ans=1;
		for(int i=1;i<=a;i++) {
			ans*=i;
		}
		
	}

	
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

public class HW11_10 {
	public static void main(String args[]) {
		Compute6 cmp = new Compute6();
		cmp.mul(3, 5);
		cmp.show(); // 此行會回應 "ans=15" 字串
		cmp.mod(14, 5);
		cmp.show(); // 此行會回應 "ans=4" 字串
		cmp.fac(5);
		cmp.show(); // 此行會回應 "ans=120" 字串

	
	}
}


