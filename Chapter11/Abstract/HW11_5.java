package Chris.Chapter11.Abstract;
 // hw11_5,介面實作的範例
 interface Math3
 {
 public  void show();;
 public void add(int a, int b); // 計算 a+b
 public void sub(int a, int b); // 計算 a-b
 public void mul(int a, int b); // 計算 a*b
 public void div(int a, int b); // 計算 a/b
 }
 class Compute2 implements Math3
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

 public class HW11_5
 {
 public static void main(String args[])
 {
 Compute2 cmp=new Compute2();
 cmp.mul(3,5); // 計算 3*5
 cmp.show(); // 此行會回應 "ans=15" 字串
 }
 }


