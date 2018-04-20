package Chris.Chapter10.Extend;

// hw10_5, 簡單的繼承範例
class C1 {
	private int num;
	public C1() {
		this(2);
	}
	public C1(int n) {
		num = n;
	}

	public int get() {
		return num;
	}
}

class C2 extends C1 {
	
	
	public void show() {
		System.out.println("num=" + get());
	}
}

public class HW10_5 {
	public static void main(String args[])
  {		
		  C2 bb=new C2();//或是呼叫public C1() {
			//this(2);再呼叫C1(int n)
			//}
		//C2 bb=new C2(2);直接帶入2呼叫public C1(int n)
  bb.show();
  }
}