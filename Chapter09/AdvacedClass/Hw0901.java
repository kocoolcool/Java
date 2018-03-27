package Chris.Chapter09.AdvacedClass;
class CRectangle{
	int width;
	int height;
	CRectangle(int w,int h){
		width=w;
		height=h;
		System.out.println("constructor CRectangle(int w,int h) called");
	}
	CRectangle(){
		this(10,8);
		
		System.out.println("constructor CRectangle() called");
	}
	void show() {
		System.out.println("w:"+width+"h:"+height);
	}
	
}
public class Hw0901 {

	public static void main(String[] args) {
		CRectangle a=new CRectangle(9,6);
		a.show();
		CRectangle b=new CRectangle();
		b.show();
	}

}
