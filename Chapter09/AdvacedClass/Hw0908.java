package Chris.Chapter09.AdvacedClass;

class CWin {
	static int cnt = 0;
	String color;
	int width;
	int height;

	public CWin() {
		this("red",2,5);
	}

	public CWin(String str, int w, int h) {
		color = str;
		width = w;
		height = h;
		System.out.println("color:  "+color+"  width:  "+width+"  height:  "+height);
		count();
	}

	public void count() {
		cnt++;
	}

	public static void setZero() {
		cnt = 0;
	}

	public static void setValue(int n) {
		cnt = n;
	}

	public static void show() {
		System.out.println("cnt:" + cnt);
	}
}

public class Hw0908 {

	public static void main(String[] args) {
		CWin w1=new CWin();
		CWin w2=new CWin("Blue",5,8);
		CWin.show();
		
		CWin.setZero();
		System.out.println("using setZero()...");
		CWin.show();
		
		CWin.setValue(10);
		System.out.println("using setValue(10)...");
	    CWin.show();
		
		CWin w3=new CWin("Green",4,6);
		CWin.show();

	}
}