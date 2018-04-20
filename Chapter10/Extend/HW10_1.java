package Chris.Chapter10.Extend;

class Caaa{
	public Caaa() {
		num1=1;
		num2=1;
	}
	public 	Caaa(int a,int b) {
		num1=a;
		num2=b;
	}
		public int num1;
		public int num2;
}
class Cbbb extends Caaa{
	public Cbbb() {		
	}
	public Cbbb(int a,int b) {
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
public class HW10_1 {

	public static void main(String[] args) {
	
		Cbbb b1=new Cbbb();
		Cbbb b2=new Cbbb(3,9);
		 b1.show();
		 b2.show();
		
//		Cbbb bb=new Cbbb();
//		bb.set_num(50,10);
//		bb.show();
	}
}

/*10.2
不能繼承,因為private
*/
/*10.3
 (a)60
 (b)60
 (c)
 */
