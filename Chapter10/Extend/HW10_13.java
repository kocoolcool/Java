package Chris.Chapter10.Extend;

class W{
	public W() {
		num1=1;
		num2=1;
	}
	public W(int a,int b) {
		num1=a;
		num2=b;
	}
		public int num1;
		public int num2;
}
class O extends W{
	public O() {	
		super();
	}
	public O(int a,int b) {
			super(a,b);
		}
	public void set_num(int a,int b) {
			num1=a;
			num2=b;
		}
		public void show() {
		System.out.println("num1="+num1+"  num2="+num2);
		}
}
public class HW10_13 {

	public static void main(String[] args) {
	
		O b1=new O();
	
		 b1.show();
		
		
	}}
