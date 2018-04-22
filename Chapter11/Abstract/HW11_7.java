package Chris.Chapter11.Abstract;
 /*由於4~8行的method是宣告於Math介面中，在介面中宣告的method，可以省略abstract
關鍵字。因此 4~8 行的 method 之前可以加上 abstract 關鍵字，也可以不加。
*/
 interface Math4
 {
 public  void show();;
 public abstract void add(int a, int b); // 計算 a+b
 public abstract void sub(int a, int b); // 計算 a-b
 public abstract void mul(int a, int b); // 計算 a*b
 public abstract void div(int a, int b); // 計算 a/b
 }
 class Compute4 implements Math4
 {
	 int ans;
	@Override
	public void show() {
		System.out.println("ans="+ans);
		
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

 public class HW11_7
 {
 public static void main(String args[])
 {
 Compute4 cmp=new Compute4();
 cmp.mul(3,5); // 計算 3*5
 cmp.show(); // 此行會回應 "ans=15" 字串
 }
 }


