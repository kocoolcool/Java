package Chris.Chapter10.Extend;
class CRectangle{
	private int length;
	private int width;
	CRectangle() {
	length=2;
	width=2;	
}
public CRectangle(int l,int w) {
	length=l;
	width=w;
}

		private void show() {
			System.out.print("length="+length);
			System.out.print(",width="+width);
		}
		void 	area(){
			show();
			System.out.println(",area="+length*width);	
		}
}
class CData extends CRectangle{
	CData(int l,int w){
		super(l,w);
	}
	CData(){
		
	}

 
	
	
}
public class HW10_4 {

	public static void main(String[] args) {
		CData obj1=new CData(3,8);
		CData obj2=new CData();
		obj1.area();
		obj2.area();

	}

}
