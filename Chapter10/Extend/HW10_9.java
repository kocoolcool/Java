package Chris.Chapter10.Extend;

// hw10_5, 簡單的繼承範例
class C3 {
	private int num;
	public C3() {
		this(2);
	}
	public C3(int n) {
		num = n;
	}

	public int get() {
		return num;
	}
	void display() {
		System.out.println("printed from C3class");
	}
}

class C4 extends C3 {
	void display() {
		System.out.println("printed from C4 class");
	}
	
	public void show() {
		System.out.println("num=" + get());
	}
}

public class HW10_9 {
	public static void main(String args[])
  {		
		  C4 bb=new C4();//或是呼叫public C1() {
			//this(2);再呼叫C1(int n)
			//}
		//C2 bb=new C2(2);直接帶入2呼叫public C1(int n)
  bb.show();
  bb.display();//印出"printed from C2 class"
  }
}