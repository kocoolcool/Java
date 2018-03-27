package Chris.Chapter09.AdvacedClass;
class CBox{
	private int length;
	private int width;
	private int heigh;
	
	public CBox(int l,int w,int h) {
		length=l;
		width=w;
		heigh=h;
	}
	public void show() {
		System.out.print("length="+length);
		System.out.print(",width="+width);
		System.out.println(",heigh="+heigh);
	}
}


public class Hw0904 {
	
	public static void main(String[] args) {
		CBox box1=new CBox(2,2,2);
		box1.show();

	}

}
