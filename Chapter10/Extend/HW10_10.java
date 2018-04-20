package Chris.Chapter10.Extend;

//hw10_10,試說明下列程式碼錯誤之處
class Ca {
	public Ca(){
		System.out.println("CA");
	}
	public void Caa() {
		System.out.println("A");
	}
}

class Cb extends Ca {
	public Cb(){
		System.out.println("CB");
	}
	public void Cbb() {
		System.out.println("B");
	}
}

class Cc extends Cb {
	public Cc(){
		System.out.println("CC");
	}
	public void Ccc() {
		System.out.println("C");
	}
	public String SCcc() {
		return "imCcc";
	}
}

public class HW10_10 {
	public static void main(String args[]) {
//	    Cb b1 = new Cb();
		Object b3 = new Cc();
		Cb b2 = new Cc();
		String SC = ((Cc)b2).SCcc();; //強制轉型
		System.out.println(SC);
//		Ca c1 = new Cc();
//  	Ca c2 = new Cc();
//		b2.Caa();
//		b2.Cbb();
//	System.out.println(b2.getClass());
	}
}
// 錯誤發生在第11及12行，子類別的變數不可以指向父類別的物件。Cccc類別為Cbbb的子類別，
// Cbbb類別又為Caaa的子類別，因此，Cccc類別的變數不能指向Cbbb或Caaa的物件，
// 利用Cccc c1=new Caaa()及Cccc c2=new Cbbb()的方式宣告變數是錯誤的。
