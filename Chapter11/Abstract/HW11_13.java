package Chris.Chapter11.Abstract;

// HW11_13,介面的延伸
interface Show_ans {
	public void show();
}

interface Math2 extends Show_ans {
	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

class Compute3 implements Math2 {
	int x,y,ans;

	@Override
	public void show() {
		System.out.println("ans="+ans);
		
	}

	@Override
	public void add(int a, int b) {
	ans=	a+b;
		
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

public class HW11_13 {
	public static void main(String args[]) {
		Compute3 cmp = new Compute3();
		cmp.mul(3, 5);
		cmp.show();
	}
}
