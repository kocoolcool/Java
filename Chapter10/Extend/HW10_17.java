package Chris.Chapter10.Extend;
/*CColor類別裡的show() method不能改寫父類別Car裡的show() method，
父類別Car裡的show() method為final，不能被改寫。*/
class Car {
	protected String owner;
	protected String id;
	Car(String own, String s){
		owner=own;
		id=s;
	}
	final void show() {
		System.out.println("車主姓名:" + owner);
		System.out.println("車牌號碼:" + id);
	}
}
class CColor extends Car{
	String color;
	CColor(String a, String b,String c){
		
		super(a,b);
		color=c;
	}

	 void show1() {
//		System.out.println("車主姓名:" + owner);
//		System.out.println("車牌號碼:" + id);
		System.out.println("車身顏色"+color);
	}
	

	
	
}

public class HW10_17 {

	public static void main(String[] args) {
		CColor mycar = new CColor("Riaan", "A1-2345", "Black");
		mycar.show();
		mycar.show1();
	
	}

}
